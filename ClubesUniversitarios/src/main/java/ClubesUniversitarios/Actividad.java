
package ClubesUniversitarios;

public class Actividad {
    protected String idAct;
    protected String tema;
    protected int duracion;
    //protected participantes p[]=new [100];

    public Actividad(String idAct, String tema, int duracion) {
        this.idAct = idAct;
        this.tema = tema;
        this.duracion = duracion;
    }

    public String getIdAct() {
        return idAct;
    }

    public void setIdAct(String idAct) {
        this.idAct = idAct;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


}


