package model;

public class Persona {
    private String rut;
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private int paisResidencia_fk;
    private int nacionalidad_fk;

    public Persona() {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPaisResidencia_fk() {
        return paisResidencia_fk;
    }

    public void setPaisResidencia_fk(int paisResidencia_fk) {
        this.paisResidencia_fk = paisResidencia_fk;
    }

    public int getNacionalidad_fk() {
        return nacionalidad_fk;
    }

    public void setNacionalidad_fk(int nacionalidad_fk) {
        this.nacionalidad_fk = nacionalidad_fk;
    }

    @Override
    public String toString() {
        return "Persona{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", edad=" + edad + ", paisResidencia_fk=" + paisResidencia_fk + ", nacionalidad_fk=" + nacionalidad_fk + '}';
    }    
}
