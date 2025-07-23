package ClubesUniversitarios;
public class Cientifica extends Actividad {
    protected String AreaDeInvestigacion; 
    public Cientifica(String idAct, String tema, int duracion ,String AreaDeInvestigacion) {
        super(idAct, tema, duracion);
        this.AreaDeInvestigacion=AreaDeInvestigacion;
    }

    public String getAreaDeInvestigacion() {
        return AreaDeInvestigacion;
    }

    public void setAreaDeInvestigacion(String AreaDeInvestigacion) {
        this.AreaDeInvestigacion = AreaDeInvestigacion;
    }
    public void CalcularDuracion(Cientifica a){
        /*if(){
        }*/
    }
    
    
}
