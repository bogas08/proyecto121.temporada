
package ClubesUniversitarios;
public abstract class ClubesUniversitario {
    protected String nombre;
    protected int id;
    protected Estudiante[] estudiantes = new Estudiante[50];
    protected Actividad[] actividades = new Actividad[50];
 
    public ClubesUniversitario() {}
 
    public void agregarEstudiante(Estudiante estudiante) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] == null) {
                estudiantes[i] = estudiante;
                break;
            }
        }
    }
 
    public void agregarActividad(Actividad actividad) {
        for (int i = 0; i < actividades.length; i++) {
            if (actividades[i] == null) {
                actividades[i] = actividad;
                break;
            }
        }
    }
 
    public void mostrar() {
        System.out.println("Club: " + nombre + ", ID: " + id);
    }
 
    public void leer() {
        System.out.println("Leyendo datos del club...");
    }
 
    // Getters y setters
    public String getNombre() { return nombre; }
    public int getId() { return id; }
    public Estudiante[] getEstudiantes() { return estudiantes; }
    public Actividad[] getActividades() { return actividades; }
 
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setId(int id) { this.id = id; }
    public void setEstudiantes(Estudiante[] estudiantes) { this.estudiantes = estudiantes; }
    public void setActividades(Actividad[] actividades) { this.actividades = actividades; }
 
}
