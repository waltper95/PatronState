
package patronstate;

import patronstate.estados.EstadoAlumno;

public class GestorMatricula {
    public void matricular(Alumno alumno){
       alumno.getEstado().matricular();
    }
    
    public void expulsar(Alumno alumno){
        EstadoAlumno estado = alumno.getEstado();
        estado.expulsar();
        
    }
    
    //..
}
