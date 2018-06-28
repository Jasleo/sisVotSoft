package model;

public class CantidadVoto {
    private int idCandidato;
    private int cantVoto;

    public CantidadVoto(int idCandidato, int cantVoto) {
        this.idCandidato = idCandidato;
        this.cantVoto = cantVoto;
    }

    public CantidadVoto() {
    }

    public CantidadVoto(int cantVoto) {
        this.cantVoto = cantVoto;
    }
    
    
    

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public int getCantVoto() {
        return cantVoto;
    }

    public void setCantVoto(int cantVoto) {
        this.cantVoto = cantVoto;
    }
    
    
}
