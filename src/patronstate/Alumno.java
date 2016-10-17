package patronstate;
public class Alumno {
    
    private static final int ESTADO_REGISTRADO = 1;
    private static final int ESTADO_MATRICULADO = 2;
    private static final int ESTADO_EGRESADO = 3;
    private static final int ESTADO_SUSPENDIDO = 0;
    private static final int ESTADO_EXPULSADO = -1;
    private static final int ESTADO_ADVERTIDO = 4;
    
    private long id;
    private String codigo;
    private String nombre;
    
    //...
    private int estado;
    /*
    1: Registrado
    2: Matriculado
    3: Egresado
    0: Suspendido
    -1: Expulsado
     */
    
//    public void cumplirCreditos(){
//        if(this.estado == ESTADO_MATRICULADO){
//            this.estado = ESTADO_EGRESADO;
//        }
//    }
//    
//    public void cumplirTiempo(){
//        if(this.estado == ESTADO_SUSPENDIDO){
//            this.estado = ESTADO_REGISTRADO;
//        }
//    }
//    
//    public void finalizarCiclo(){
//        if(this.estado == ESTADO_MATRICULADO){
//            this.estado = ESTADO_REGISTRADO;
//        }
//    }
//    
//    public void matricular(){
//        if(this.estado == ESTADO_REGISTRADO){
//            this.estado = ESTADO_MATRICULADO;
//        }
//    }
//    
//    public void cometerInfraccion(){
//        if(this.estado == ESTADO_REGISTRADO || this.estado == ESTADO_REGISTRADO){
//            this.estado = ESTADO_SUSPENDIDO;
//        }
//    }
//    
//    public void expulsar(){
//        if(this.estado == ESTADO_SUSPENDIDO 
//                || this.estado == ESTADO_REGISTRADO 
//                || this.estado == ESTADO_MATRICULADO){
//            this.estado = ESTADO_EXPULSADO;
//        }
//    }
//    public void imcumplirCondicion(){
//        if(this.estado == ESTADO_ADVERTIDO){
//            this.estado = ESTADO_REGISTRADO;
//        }
//    }
    
    public Alumno() {
        this.estado=1;
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
    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
}
