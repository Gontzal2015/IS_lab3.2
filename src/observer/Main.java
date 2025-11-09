package observer;

import java.util.Observable;


public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable	pacient=new	Covid19Pacient("aitor", 35);
		Observable pacient2=new Covid19Pacient("Jaime",48);
		new	PacientObserverGUI	(pacient);
		new	PacientSymptomGUI((Covid19Pacient) pacient);
		new PacientThermometerGUI(pacient);
		new	PacientObserverGUI	(pacient2);
		new	PacientSymptomGUI((Covid19Pacient) pacient2);
		new PacientThermometerGUI(pacient2);

		

	}


}