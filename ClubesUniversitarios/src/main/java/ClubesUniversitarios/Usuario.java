
package ClubesUniversitarios;
public abstract class Usuario {
    protected String idEst;
    protected String nombre;
    protected String correo;
    protected boolean encriptado;
 
    public Usuario(String id, String nom, String cor) {
        this.idEst = id;
        this.nombre = nom;
        this.correo = cor;
        this.encriptado = false;
    }
 
    public abstract void registrar();
    public abstract void mostrar();
 
    public boolean validarIdentidad() {
        return encriptado;
    }
 
    // Getters y setters
    public String getIdEst() { return idEst; }
    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
    public boolean isEncriptado() { return encriptado; }
 
    public void setIdEst(String idEst) { this.idEst = idEst; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCorreo(String correo) { this.correo = correo; }
    public void setEncriptado(boolean encriptado) { this.encriptado = encriptado; }
}
