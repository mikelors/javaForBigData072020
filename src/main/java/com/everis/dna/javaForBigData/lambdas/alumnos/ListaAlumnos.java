package com.everis.dna.javaForBigData.lambdas.alumnos;

import java.util.List;
import java.util.stream.Collectors;

public class ListaAlumnos {

    List<Alumno> alumnos;

    public ListaAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void println(){
        alumnos
                .stream()
                .forEach((alumno) -> System.out.println(alumno));
    }

    public ListaAlumnos obtenerAlumnosCuyoApellidoEmpiezaPor(char inicial){
        ListaAlumnos resultado;

        List<Alumno> listaAlumnos = alumnos.stream()
                .filter((alumno) -> alumno.getApellidos().startsWith(String.valueOf(inicial)))
                .collect(Collectors.toList());  //<<-- Nos permite volver a sacar un Arraylist a partir de un Stream. Es el inverso de Stream()

        resultado = new ListaAlumnos(listaAlumnos);
        return resultado;


    }

    public ListaAlumnos obtenerAlumnosConNotaSuperiorA(double nota){
        return new ListaAlumnos(
                alumnos.stream()
                        .filter((alumno) -> alumno.getNota() > nota)
                        .collect(Collectors.toList())
        );
    }

    public ListaAlumnos obtenerAlumnosApuntadosACurso(String nombreCurso){
        return new ListaAlumnos(
                alumnos.stream()
                        .filter((alumno) -> alumno.getNombreCurso().equals(nombreCurso))
                        .collect(Collectors.toList())
        );
    }

    //LIMIT
    public ListaAlumnos devolverLosPrimerosAlumnos(int numeroDeAlumnos){
        return new ListaAlumnos(
                alumnos.stream()
                        .limit(numeroDeAlumnos)
                        .collect(Collectors.toList())
        );
    }

    public ListaAlumnos obtenerAlumnosOrdenadosPorApellido(){

        return new ListaAlumnos(
                alumnos.stream()
                        .sorted((a,b) -> a.getApellidos().compareTo(b.getApellidos()))
                        .collect(Collectors.toList())
        );
    }

    //FINDFIRST, MIN
    public Alumno alumnoMasJovenConSorted(){
        Alumno alumno = alumnos.stream()
                .sorted((a,b) -> a.getEdad().compareTo(b.getEdad()))
                .findFirst()
                .get();
        return alumno;
    }

    //FINDFIRST, MIN
    public Alumno alumnoMasJovenConMin(){
        Alumno alumno = alumnos.stream()
                .min((a,b) -> a.getEdad().compareTo(b.getEdad()))
                .get();
        return alumno;
    }

    public List<Double> obtenerNotas(){
        return alumnos.stream()
                .map(alumno -> alumno.getNota())
                .collect(Collectors.toList());
    }

    public Integer edadMediaConMapReduce(){
        Integer sumaEdades = alumnos.stream()
                .map(alumno -> alumno.getEdad())
                .reduce((a,b) -> a + b)
                .get();
        return (sumaEdades / alumnos.size());
    }

    public Double edadMediaConAverage(){
        return alumnos.stream()
                .mapToDouble(alumno -> alumno.getEdad())
                .average()
                .getAsDouble();
    }

    public List<String> obtenerListadoApellidosEnMayusculas(){
        return alumnos.stream()
                .map(alumno -> alumno.getApellidos().toUpperCase())
                .collect(Collectors.toList());
    }

    public List<String> obtenerListadoApellidosEnMayusculasConDosMap(){
        return alumnos.stream()
                .map(alumno -> alumno.getApellidos())
                .map(apellido -> apellido.toUpperCase())
                .collect(Collectors.toList());
    }

    public Double obtenerNotaMasBajaConMap(){
        return alumnos.stream()
                .map((alumno) -> alumno.getNota())
                .min((a,b)->a.compareTo(b))
                .get();
    }

    public Double obtenerNotaMasBajaSinMap(){
        return alumnos.stream()
                .min((a,b)->a.getNota().compareTo(b.getNota()))
                .get()
                .getNota();
    }

    public Integer obtenerNumeroDeAlumnosSuspendidos(){
        return (int) alumnos.stream()
                .filter(alumno -> alumno.getNota()<5)
                .count();
    }

    public String obtenerTodasLasCedulasEnUnUnicoStringSeparadosPorGuionBajo(){
        return alumnos.stream()
                .map(alumno -> alumno.getCedula())
                .reduce((cedula1, cedula2) -> cedula1 + "_" + cedula2)
                .get();
    }

    public Double obtenerNotaMediaAlumnosAsignatura(String asignatura){
        return alumnos.stream()
                .filter(alumno -> alumno.getNombreCurso().equals(asignatura))
                .mapToDouble(alumno -> alumno.getNota())
                .average()
                .getAsDouble();
    }

    public String obtenerAsignaturaMasPopularEntreAlumnosMasJovenes (int edadLimite){
        return alumnos.stream()
                .filter(alumno -> alumno.getEdad()<edadLimite) //Filtrado para quitarnos a los alumnos más mayores de la edad límite
                .collect(Collectors.groupingBy(Alumno::getNombreCurso, Collectors.counting())) //<-- Monta un map<String,Integer> con las asignaturas como índice y el número de apariciones como valor
                .entrySet()//<-- Método que te devuelve un listado de todas las entradas del Mapa.
                .stream()// <-- Sacamos un Stream del listado de entradas
                .max((asignaturaA,asignaturaB) -> asignaturaA.getValue().compareTo(asignaturaB.getValue())) // <-- El máximo lo scamos comparando los valores
                .get() // Obtengo la entrada que ha resultado del MAX
                .getKey();  // Saco el índice de la entrada, que es el nombre de la asignatura
    }

}
