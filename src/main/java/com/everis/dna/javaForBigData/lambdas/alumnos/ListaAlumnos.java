package com.everis.dna.javaForBigData.lambdas.alumnos;

import java.util.List;
import java.util.stream.Collectors;

public class ListaAlumnos {

    List<Alumno> alumnos;

    public ListaAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void println(){

    }

    public ListaAlumnos obtenerAlumnosCuyoApellidoEmpiezaPor(char inicial){
        return this;
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
