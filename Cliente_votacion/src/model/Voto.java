package model;

public class Voto {
    private int id;
    private String fecha_voto;
    private String votante_fk;/*persona*/
    private int candidato_fk;

    public Voto() {
    }

    public Voto(String fecha_voto, String votante_fk, int candidato_fk) {
        this.fecha_voto = fecha_voto;
        this.votante_fk = votante_fk;
        this.candidato_fk = candidato_fk;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha_voto() {
        return fecha_voto;
    }

    public void setFecha_voto(String fecha_voto) {
        this.fecha_voto = fecha_voto;
    }

    public String getVotante_fk() {
        return votante_fk;
    }

    public void setVotante_fk(String votante_fk) {
        this.votante_fk = votante_fk;
    }

    public int getCandidato_fk() {
        return candidato_fk;
    }

    public void setCandidato_fk(int candidato_fk) {
        this.candidato_fk = candidato_fk;
    }

    @Override
    public String toString() {
        return "Voto{" + "id=" + id + ", fecha_voto=" + fecha_voto + ", votante_fk=" + votante_fk + ", candidato_fk=" + candidato_fk + '}';
    }    
}
