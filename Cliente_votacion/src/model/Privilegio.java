package model;

public class Privilegio {
    private int id;
    private String Descripcion;

    public Privilegio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "Privilegio{" + "id=" + id + ", Descripcion=" + Descripcion + '}';
    }
    
    
    
}
