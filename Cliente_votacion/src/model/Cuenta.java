package model;

public class Cuenta {

    private int id;
    private String rutPersona_fk;
    private String pass;
    private int privilegio_fk;

    public Cuenta() {
    }

    public Cuenta(String rutPersona_fk, String pass, int privilegio_fk) {
        this.rutPersona_fk = rutPersona_fk;
        this.pass = pass;
        this.privilegio_fk = privilegio_fk;
    }   
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRutPersona_fk() {
        return rutPersona_fk;
    }

    public void setRutPersona_fk(String rutPersona_fk) {
        this.rutPersona_fk = rutPersona_fk;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getPrivilegio_fk() {
        return privilegio_fk;
    }

    public void setPrivilegio_fk(int privilegio_fk) {
        this.privilegio_fk = privilegio_fk;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "id=" + id + ", rutPersona_fk=" + rutPersona_fk + ", pass=" + pass + ", privilegio_fk=" + privilegio_fk + '}';
    }   

}
