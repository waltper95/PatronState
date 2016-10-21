
package patronstate;

import patronstate.estados.EstadoAlumno;
import patronstate.estados.EstadoRegistrado;

public class Alumno {
    public static final int ESTADO_REGISTRADO = 1;
    public static final int ESTADO_MATRICULADO = 2;
    public static final int ESTADO_EGRESADO = 3;
    public static final int ESTADO_ADVERTIDO = 4;
    public static final int ESTADO_SUSPENDIDO = 0;
    public static final int ESTADO_EXPULSADO = -1;
    
    
    private long id;
    private String codigo;
    private String nombre;
    // ...

    private EstadoAlumno estado;

    public Alumno() {
        this.estado = new EstadoRegistrado(this);
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EstadoAlumno getEstado() {
        return estado;
    }

    public void setEstado(EstadoAlumno estado) {
        this.estado = estado;
    }
    
    
}
