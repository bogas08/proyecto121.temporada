package ClubesUniversitarios;
import java.util.ArrayList;
public class Certificado {
    protected String IdCert;
    protected String fecha;
    protected Actividad actividad;
    protected ArrayList<Estudiante> participante;

    public Certificado(String IdCert, String fecha, Actividad actividad, Estudiante[] estudiante) {
        this.IdCert = IdCert;
        this.fecha = fecha;
        this.actividad = actividad;
        //this.participante = new Estudiante[100];
    }
    

    public String getIdCert() {
        return IdCert;
    }

    public void setIdCert(String IdCert) {
        this.IdCert = IdCert;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String Fecha) {
        this.fecha = Fecha;
    }
    public void mostrar(){
    System.out.println(IdCert+actividad +fecha +participante);}
    public void agregarParticipante(Estudiante estudiante) {
        if (participante.size() < 100) {
            participante.add(estudiante);
        }
    }
}
