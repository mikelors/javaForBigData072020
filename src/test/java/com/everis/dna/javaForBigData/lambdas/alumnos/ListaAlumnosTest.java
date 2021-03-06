package com.everis.dna.javaForBigData.lambdas.alumnos;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListaAlumnosTest {
    ListaAlumnos listaAlumnos;

    @Before
    public void inicializacion(){
        List<Alumno> listado = new ArrayList<>();

        listado.add(new Alumno(1, "1717213183", "Javier Ignacio", "Molina Cano", "Java 8", 4, 28));
        listado.add(new Alumno(2, "1717456218", "Lillian Eugenia", "Gomez Alvarez", "Java 8", 10, 33));
        listado.add(new Alumno(3, "1717328901", "Sixto Naranjoe", "Marín", "Java 8", 8.6, 15));
        listado.add(new Alumno(4, "1717567128", "Gerardo Emilio", "Duque Gutiérrez", "Java 8", 10, 13));
        listado.add(new Alumno(5, "1717902145", "Jhony Alberto", "Sáenz Hurtado", "Java 8", 9.5, 15));
        listado.add(new Alumno(6, "1717678456", "Germán Antonio", "Lotero Upegui", "Java 8", 8, 34));
        listado.add(new Alumno(7, "1102156732", "Oscar Darío", "Murillo González", "Java 8", 3, 32));
        listado.add(new Alumno(8, "1103421907", "Augusto Osorno", "Palacio Martínez", "PHP", 9.5, 17));
        listado.add(new Alumno(9, "1717297015", "César Oswaldo", "Alzate Agudelo", "Java 8", 8, 26));
        listado.add(new Alumno(10, "1717912056", "Gloria Amparo", "González Castaño", "PHP", 10, 28));
        listado.add(new Alumno(11, "1717912058", "Jorge León", "Ruiz Ruiz", "Python", 8, 22));
        listado.add(new Alumno(12, "1717912985", "John Jairo", "Duque García", "Java Script", 9.4, 32));
        listado.add(new Alumno(13, "1717913851", "Julio Cesar", "González Castaño", "C Sharp", 1, 22));
        listado.add(new Alumno(14, "1717986531", "Gloria Amparo", "Rodas Monsalve", "Ruby", 7, 18));
        listado.add(new Alumno(15, "1717975232", "Gabriel Jaime", "Jiménez Gómez", "Java Script", 10, 18));

        listaAlumnos = new ListaAlumnos(listado);
    }

    @Test
    public void Laboratorio(){
        //probando obtenerAlumnosCuyoApellidoEmpiezaPor
        listaAlumnos.obtenerAlumnosCuyoApellidoEmpiezaPor('M').println();
        System.out.println("----------");
        listaAlumnos.obtenerAlumnosConNotaSuperiorA(8).println();
        System.out.println("----------");
        listaAlumnos.obtenerAlumnosApuntadosACurso("Java 8").println();
        System.out.println("----------");
        listaAlumnos.devolverLosPrimerosAlumnos(4).println();
        System.out.println("----------");
        listaAlumnos.obtenerAlumnosOrdenadosPorApellido().println();
        System.out.println("----------");
        System.out.println("El alumno más joven es: " + listaAlumnos.alumnoMasJovenConSorted().toString());
        System.out.println("----------");
        System.out.println("El alumno más joven es: " + listaAlumnos.alumnoMasJovenConMin().toString());
        System.out.println("----------");
        List<Double> notas = listaAlumnos.obtenerNotas();
        notas.stream().forEach((nota)-> System.out.println(nota));
        System.out.println("----------");
        System.out.println("La media es: " + listaAlumnos.edadMediaConMapReduce());
        System.out.println("----------");
        System.out.println("La media es: " + listaAlumnos.edadMediaConAverage());
        System.out.println("----------");
        List<String> apellidos = listaAlumnos.obtenerListadoApellidosEnMayusculas();
        apellidos.stream().forEach((x) -> System.out.println(x));
        System.out.println("----------");
        System.out.println("La nota más baja es: " + listaAlumnos.obtenerNotaMasBajaConMap());
        System.out.println("La nota más baja es: " + listaAlumnos.obtenerNotaMasBajaSinMap());
        System.out.println("----------");
        System.out.println("Alumnos suspendidos: " + listaAlumnos.obtenerNumeroDeAlumnosSuspendidos());
        System.out.println("----------");
        System.out.println("Cedulas: " + listaAlumnos.obtenerTodasLasCedulasEnUnUnicoStringSeparadosPorGuionBajo());
        System.out.println("----------");
        System.out.println("Nota media: " + listaAlumnos.obtenerNotaMediaAlumnosAsignatura("PHP"));
        System.out.println("----------");
        System.out.println("Asignatura más popular: " + listaAlumnos.obtenerAsignaturaMasPopularEntreAlumnosMasJovenes(25) );


    }
}