
package clase2207;
public class ConfiguracionAulaVirtual {
    private static ConfiguracionAulaVirtual instancia;
    private String nombreCurso;
    private int maxEstudiantes;
    private String plataforma;
// Constructor privado
    private ConfiguracionAulaVirtual() {
        nombreCurso = "POO 2025";
        maxEstudiantes = 60;
        plataforma = "Moodle";
        System.out.println("Configuración inicializada.");
        }
    // Método de acceso público y estático
    public static ConfiguracionAulaVirtual getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionAulaVirtual();
        }
        return instancia;}
    public void mostrarConfiguracion() {
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Máximo de estudiantes: " +maxEstudiantes);
        System.out.println("Plataforma: " + plataforma);}
    public void setMaxEstudiantes(int nuevosMax) {
        maxEstudiantes = nuevosMax;}
}
