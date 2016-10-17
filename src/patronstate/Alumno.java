package patronstate;
public class Alumno {
    private long id;
    private String codigo,nombre;

    //...
    /*
    1: Registrado
    2: Matriculado
    3: Egresado
    0: Suspendido
    -1: Expulsado
     */
    public Alumno() {
        this.estado=1;
    }

    private int estado;

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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}
