package ClubesUniversitarios;

public class Cultural extends Actividad {
    protected String nombre ;

    public Cultural(String nombre, String idAct, String tema, int duracion) {
        super(idAct, tema, duracion);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
       
}
