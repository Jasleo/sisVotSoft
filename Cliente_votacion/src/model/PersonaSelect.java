package model;

public class PersonaSelect {
    private String rut;
    private String nombre;
    private String apellido;
    private String direccion;
    private String edad;
    private String paisRecidencia_fk;
    private String nacionalidad_fk;

    public PersonaSelect() {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPaisRecidencia_fk() {
        return paisRecidencia_fk;
    }

    public void setPaisRecidencia_fk(String paisRecidencia_fk) {
        this.paisRecidencia_fk = paisRecidencia_fk;
    }

    public String getNacionalidad_fk() {
        return nacionalidad_fk;
    }

    public void setNacionalidad_fk(String nacionalidad_fk) {
        this.nacionalidad_fk = nacionalidad_fk;
    }
    
    
    
}
