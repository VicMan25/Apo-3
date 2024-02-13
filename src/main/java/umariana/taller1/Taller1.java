/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umariana.taller1;

import java.util.ArrayList;
import java.util.Scanner;
import mundo.Tarea;

/**
 *
 * @author Victor Manuel Velasquez Benavides
 */
public class Taller1 {
    
    public static void main(String[] args) {
    
    // Se utiliza el ArrayList denominado "misTareas" para almacenar las tareas registradas en el sistema.
    ArrayList<Tarea> misTareas = new ArrayList<>();
    Scanner lector=new Scanner(System.in);
    
    //Inicializamos el menú en activo = true, para que ingrese de manera automática al ejecutar.
    boolean activo=true;
    do {
    System.out.println("========== MENÚ DE OPCIONES ==========\n"
            + "1. Agregar Tarea\n"
            + "2. Mostrar Tareas\n"
            + "3. Terminar Programa\n");
    
    int opcion=lector.nextInt();
    switch(opcion){
        case 1:
            System.out.println("Ingresa el Id de la tarea: \n");
            int id=lector.nextInt();    lector.nextLine();
            System.out.println("Ingrese la descripción de la tarea \n");
            String descripcion=lector.nextLine();
            System.out.println("Ingrese la prioridad de 1-5 \n");
            int prioridad=lector.nextInt();
             
            
            //Creación del objeto y llenar la información
            Tarea nuevaTarea = new Tarea(id, descripcion, prioridad);
            
            //Almacenar el objeto en la contenedora
            misTareas.add(nuevaTarea);
            System.out.println("La tarea fue agregada exitosamente");
        break;
           
        case 2:
            //El sistema verifica si hay datos en la contenedora de misTareas para dar acción al case 2.
            if (misTareas.isEmpty()) {
                        System.out.println("Aún no has registrado tareas en el sistema.");
                    } else {
                        System.out.println("==========Tareas Registradas==========");
                        
                        // Creamos la variable de control i para organizar las tareas recibidas.
                        for (int i = 5; i >= 1; i--) {
                            // Realizamos un recorrido en las tareas de la contenedora.
                            for (Tarea tarea : misTareas) {
                                // Ordenar las tareas por prioridad de 5 a 1
                                if (tarea.getPrioridad() == i) {
                                    System.out.println("Id: " + tarea.getIdTarea());
                                    System.out.println("Descripción: " + tarea.getDescripcion());
                                    System.out.println("Prioridad: " + tarea.getPrioridad());
                                }
                            }
                        }
                    }
        break;
        case 3:
            activo=false;
        break;
        default:
            System.out.println("Opción Incorrecta, intenta nuevamente.");
        }
    }
    while (activo); 
    }
}
