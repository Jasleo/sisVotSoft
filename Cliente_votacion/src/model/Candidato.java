package model;

public class Candidato {

    private int id;
    private int partido_fk;
    private String persona_fk;

    public Candidato() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPartido_fk() {
        return partido_fk;
    }

    public void setPartido_fk(int partido_fk) {
        this.partido_fk = partido_fk;
    }

    public String getPersona_fk() {
        return persona_fk;
    }

    public void setPersona_fk(String persona_fk) {
        this.persona_fk = persona_fk;
    }

    @Override
    public String toString() {
        return "Candidato{" + "id=" + id + ", partido_fk=" + partido_fk + ", persona_fk=" + persona_fk + '}';
    }
    
    
}
