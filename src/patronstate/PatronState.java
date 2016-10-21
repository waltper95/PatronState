
package patronstate;

import patronstate.estados.EstadoMatriculado;

public class PatronState {

    public static void main(String[] args) {        
        Alumno alumno1 = new Alumno();
        GestorMatricula gestor = new GestorMatricula();
        gestor.matricular(alumno1);
        
        if(alumno1.getEstado() instanceof EstadoMatriculado){
            System.out.println("Cambio de estado");
        }else{
            System.out.println("No cambio de estado");
        }
    }
    
}
