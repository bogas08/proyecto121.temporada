
package ClubesUniversitarios;

public class Estudiante extends Usuario {
    private int edad;
    private String carrera;
    private int semestre;
    private Actividad[] actividadesInscritas = new Actividad[7];
 
    public Estudiante(String id, String nom, String cor, String carr, int sem, int edad) {
        super(id, nom, cor);
        this.carrera = carr;
        this.semestre = sem;
        this.edad = edad;
    }
 
    public void inscribirActividad(Actividad actividad) {
        for (int i = 0; i < actividadesInscritas.length; i++) {
            if (actividadesInscritas[i] == null) {
                actividadesInscritas[i] = actividad;
                break;
            }
        }
    }
 
    public void registrar() {
        System.out.println("Estudiante registrado: " + nombre);
    }
 
    public void mostrar() {
        System.out.println("Estudiante: " + nombre + ", Carrera: " + carrera + ", Semestre: " + semestre + ", Edad: " + edad);
    }
 
    // Getters y setters
    public int getEdad() { return edad; }
    public String getCarrera() { return carrera; }
    public int getSemestre() { return semestre; }
    public Actividad[] getActividadesInscritas() { return actividadesInscritas; }
 
    public void setEdad(int edad) { this.edad = edad; }
    public void setCarrera(String carrera) { this.carrera = carrera; }
    public void setSemestre(int semestre) { this.semestre = semestre; }
    public void setActividadesInscritas(Actividad[] actividadesInscritas) {
        this.actividadesInscritas = actividadesInscritas;
    }
}
    
