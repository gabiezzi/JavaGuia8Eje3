package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServiAlumno {
    
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    ArrayList<Alumno> alumnos = new ArrayList();
    
    public Alumno crearAlumno() {

        
        Alumno alumnoNuevo = new Alumno();
        
        ArrayList<Integer> notas = new ArrayList();

        System.out.println("Ingrese el nombre del alumno");
       alumnoNuevo.setNombres(leer.next());
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota");
            notas.add(leer.nextInt());

        }
        alumnoNuevo.setNotas(notas);
        
        return alumnoNuevo;
    }

    public double notaFinal(Alumno nuevoAlumno) {

        return (nuevoAlumno.getNotas().get(0)+nuevoAlumno.getNotas().get(1)+nuevoAlumno.getNotas().get(2)) / 3;

    }
    
    public void menu(){
          String opc = "";
        
        
        alumnos.add(crearAlumno());

        while (!opc.equals("n")) {
            System.out.println("Desea agregar otro alumno s/n");
            opc = leer.next();
            if (opc.equals("s")) {
                alumnos.add(crearAlumno());
            } else {
                System.out.println("Operacion Finalizada");
            }
        }

        System.out.println("Ingrese el nombre de un alumno a buscar");
        String nombreBuscar = leer.next();
        
        Iterator<Alumno> it = alumnos.iterator();
        
        while (it.hasNext()) {
            Alumno aux = it.next();
            
            if(aux.getNombres().equals(nombreBuscar)) {
                System.out.println("El promedio es: " + notaFinal(aux));
            }
            
        }
        
    }

}
