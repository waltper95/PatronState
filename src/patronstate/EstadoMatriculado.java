package patronstate;
public class EstadoMatriculado implements EstadoAlumno{
    
    private Alumno alumno;
    
    EstadoMatriculado(Alumno alumno) {
        this.alumno = alumno;
        }
    
    @Override
    public void matricular() {
        }

    @Override
    public void finalizarCiclo() {
        }

    @Override
    public void cometerInfraccion() {
        }

    @Override
    public void cumplirTiempo() {
        }

    @Override
    public void expulsar() {
        }

    @Override
    public void cumplirCreditos() {
        }

    @Override
    public void matricularAdvertidos() {
        }

    @Override
    public void cumplirCondicion() {
        }

    @Override
    public void imcumplirCondicion() {
        }
}
