package ClubesUniversitarios;


public class Administrador extends Usuario {
    private String permisos;
 
    public Administrador(String id, String nom, String cor, String per) {
        super(id, nom, cor);
        this.permisos = per;
    }
 
    public void crearActividad() {
        System.out.println("Actividad creada.");
    }
 
    public void eliminarActividad() {
        System.out.println("Actividad eliminada.");
    }
 
    public void registrar() {
        System.out.println("Administrador registrado: " + nombre);
    }
 
    public void mostrar() {
        System.out.println("Administrador: " + nombre + ", Correo: " + correo + ", Permisos: " + permisos);
    }
 
    // Getters y setters
    public String getPermisos() { return permisos; }
    public void setPermisos(String permisos) { this.permisos = permisos; }
}    

