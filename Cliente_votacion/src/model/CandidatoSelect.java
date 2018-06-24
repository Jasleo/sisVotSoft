package model;

public class CandidatoSelect {
    private String id;
    private String partido_fk;
    private String persona_fk;

    public CandidatoSelect() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPartido_fk() {
        return partido_fk;
    }

    public void setPartido_fk(String partido_fk) {
        this.partido_fk = partido_fk;
    }

    public String getPersona_fk() {
        return persona_fk;
    }

    public void setPersona_fk(String persona_fk) {
        this.persona_fk = persona_fk;
    }
}
