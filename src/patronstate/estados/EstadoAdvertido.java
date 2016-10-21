
package patronstate.estados;

import patronstate.Alumno;

public class EstadoAdvertido implements EstadoAlumno{
    private Alumno alumno;
    
    public EstadoAdvertido(Alumno alumno){
        this.alumno = alumno;
    }
    
    @Override
    public void matricular() {}

    @Override
    public void finalizarCiclo() {}

    @Override
    public void cometerInfraccion() {}

    @Override
    public void cumplirTiempo() {}

    @Override
    public void expulsar() {}

    @Override
    public void cumplirCreditos() {}

    @Override
    public void matricularAdvertidos() {}

    @Override
    public void cumplirCondicion() {
        this.alumno.setEstado(new EstadoRegistrado(this.alumno));
    }

    @Override
    public void incumplirComdicion() {
        this.alumno.setEstado(new EstadoExpulsado(this.alumno));
    }
    
}
