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
        return this;
    }

    public ListaAlumnos obtenerAlumnosApuntadosACurso(String nombreCurso){
        return this;
    }

    public ListaAlumnos devolverLosPrimerosAlumnos(int numeroDeAlumnos){
        return this;
    }

    public ListaAlumnos obtenerAlumnosOrdenadosPorApellido(){
        return this;
    }

    public Alumno alumnoMasJoven(){
        return null;
    }

    public List<Double> obtenerNotas(){
        return null;
    }

    public Integer edadMedia(){
        return null;
    }

    public List<String> obtenerListadoApellidosEnMayusculas(){
        return null;
    }

    public Double obtenerNotaMasBaja(){
        return null;
    }

    public Integer obtenerNumeroDeAlumnosSuspendidos(){
        return null;
    }

    public String obtenerTodasLasCedulasEnUnUnicoStringSeparadosPorGuionBajo(){
        return null;
    }

    public Integer obtenerNotaMediaAlumnosAsignatura(String asignatura){
        return null;
    }

    public String obtenerAsignaturaMasPopularEntreAlumnosMasJovenes (int edadLimite){
        return null;
    }

}
