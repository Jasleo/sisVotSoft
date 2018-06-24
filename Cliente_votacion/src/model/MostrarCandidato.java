package model;

public class MostrarCandidato {
    private String id;
    private String rut;
    private String nombre;
    private String apellido;
    private String partido;

    public MostrarCandidato() {
    }

    public MostrarCandidato(String id, String rut, String nombre, String apellido, String partido) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.partido = partido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }    
}
