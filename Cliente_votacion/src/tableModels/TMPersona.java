package tableModels;
    

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import model.PersonaSelect;

public class TMPersona implements TableModel{
    
    private List<PersonaSelect> personaList;

    public TMPersona(List<PersonaSelect> personaList) {
        this.personaList = personaList;
    }
    
    public PersonaSelect getPersona(int index) {
        return personaList.get(index);
    }
    
    @Override
    // para saber la cantidad de filas
    public int getRowCount() {
        return personaList.size();
    }

    @Override
    // cantidad de columnas
    public int getColumnCount() {
        return 3;
    }

    @Override
    // para obtener el nombre de la columna
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "R.U.T";
            case 1:
                return "Nombre";
            default:
                return "Apellido";
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
        PersonaSelect pe = personaList.get(rowIndex);
        
        switch(columnIndex){
            
            case 0:
                return pe.getRut();
            case 1:
                return pe.getNombre();
            default:
                return pe.getApellido();
                
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


