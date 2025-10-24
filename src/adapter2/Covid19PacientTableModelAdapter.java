package adapter2;

import java.util.ArrayList;
import java.util.Set;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames =
	    new String[] {"Symptom", "Weight" };

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
	    this.pacient=p;
	  }

	  public int getColumnCount() {
	    // Challenge!
		 return 2;
	  }

	  public String getColumnName(int i) {
	    // Challenge!
		  return columnNames[i];
	  }

	  public int getRowCount() {
	    // Challenge!
		  return pacient.getSymptoms().size();
	  }

	  public Object getValueAt(int row, int col) {

		  Set<Symptom> losSintomas = pacient.getSymptoms();
		  Object[] symptoms =losSintomas.toArray();
		  Symptom s= (Symptom) symptoms[row];
		  if(col==0)  return s.getName();
		  if(col ==1) return pacient.getWeight(s);
		  return null;
	  }
	}
