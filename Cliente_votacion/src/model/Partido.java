package model;

public class Partido {
    private int id;
    private String Descripcion;
    private int anio_fundacion;

    public Partido() {
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

    public int getAnio_fundacion() {
        return anio_fundacion;
    }

    public void setAnio_fundacion(int anio_fundacion) {
        this.anio_fundacion = anio_fundacion;
    }

    @Override
    public String toString() {
        return "Partido{" + "id=" + id + ", Descripcion=" + Descripcion + ", anio_fundacion=" + anio_fundacion + '}';
    }
    
    
    
}
