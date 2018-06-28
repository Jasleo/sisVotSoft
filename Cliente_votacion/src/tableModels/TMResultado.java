package tableModels;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import model.*;

public class TMResultado implements TableModel {

    private List<MostrarCandidato> candidatosList;
    private Data d;

    public TMResultado(List<MostrarCandidato> candidatosList) {
        this.candidatosList = candidatosList;
        d = new Data();
    }

    public MostrarCandidato getCandidato(int index) {
        return candidatosList.get(index);
    }

    @Override
    // para saber la cantidad de filas
    public int getRowCount() {
        return candidatosList.size();
    }

    @Override
    // cantidad de columnas
    public int getColumnCount() {
        return 4;
    }

    @Override
    // para obtener el nombre de la columna
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Nombre";
            case 1:
                return "Apellido";
            case 2:
                return "Partido";
            default:
                return "Cantidad Votos";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MostrarCandidato mc = candidatosList.get(rowIndex);

        switch (columnIndex) {

            case 0:
                return mc.getNombre();
            case 1:
                return mc.getApellido();
            case 2:
                return mc.getPartido();
            default:
                System.out.println("TOTAL:"+d.getCantidadVotosTotal());
                System.out.println("VOTOS:"+d.getCantidadVoto(Integer.parseInt(mc.getId())));
                return d.getCantidadVoto(Integer.parseInt(mc.getId())) * 100 / d.getCantidadVotosTotal() + "%";

        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

}
