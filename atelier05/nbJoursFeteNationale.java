package atelier05;

public class nbJoursFeteNationale {
	
	/** point d'entrée d'un exécutable */
	public static void main(String[] args) { 
		// Instanciation de deux objets de type date
		Date today = new Date(7, 11, 2024); 
		Date FeteNat = new Date(14, 7, 2025);

		today.Afficher(); FeteNat.Afficher();
		do { today.Incrementer(); today.Afficher(); }
		while (today.CompareTo(FeteNat));
		}

}
