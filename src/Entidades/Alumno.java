package Entidades;

import java.util.*;

public class Alumno {
    private String nombres;
    private ArrayList<Integer> notas;

    public Alumno(String nombres, ArrayList<Integer> notas) {
        this.nombres = nombres;
        this.notas = notas;
    }

    public Alumno() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    

}
