import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Operations implements Comparator<Etudiant> {
	//INITIALISATION
	List<Etudiant> listEtudiant = new ArrayList<Etudiant>();
	
	//STRING TO DATE
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	String space = "           ";
	//METHOD OF ADDING A STUDENT
		public List<Etudiant> addStudent() throws ParseException {
			Etudiant etudiant = new Etudiant();
			//SCANNER  OF VALUES
			Scanner sc = new Scanner(System.in);
			
				System.out.println("Veuillez saisir le nom: ");
					String nom = sc.nextLine();
					etudiant.setNom(nom);
				System.out.println("Veuillez saisir le prenom: ");
					String prenom = sc.nextLine();
					etudiant.setPrenom(prenom);
				System.out.println("Veuillez saisir l'email: ");
					String email = sc.nextLine();
					etudiant.setEmail(email);
				System.out.println("Veuillez saisir la date de naissance (yyyy-MM-dd): ");
					String dateNai = sc.nextLine();
					etudiant.setDateNaissance(dateFormat.parse(dateNai));
				System.out.println("Veuillez choisir votre civilité (Madame ou Monsieur): ");
					String civilite = sc.nextLine();
						if (civilite.equals("Madame")) etudiant.setCivilte(Civilite.MADAME);
						if (civilite.equals("Monsieur")) etudiant.setCivilte(Civilite.MONSIEUR);
					
					//ADD OBJECT ETUDIANT TO OUR LIST
					listEtudiant.add(etudiant);

					
			return listEtudiant;
			
		}
		
		
		//METHOD OF DELETING A STUDENT
		public void deleteStudent() {	
			//SCANNER  OF VALUES
			Scanner sc = new Scanner(System.in);
			
			//STUDENT TO DELETE
			System.out.println("Veuillez saisir le nom d'etudiant à supprimer: ");
			String nom = sc.nextLine();
			
			//LOOKING FOR STUDENT TO DELETE
			for (int i = 0; i < listEtudiant.size(); i++) {
			       	//FISRTLY WE MUST BE SURE THAT OUR OBJECT IS NOT NULL, 
					//SECONDLY IF FIND THE STUDENT IN OUR LIST, WE REMOVE IT.
					if (listEtudiant.get(i) != null && listEtudiant.get(i).getNom().equals(nom)){
			           listEtudiant.remove(i);
			           System.out.println("Vous avez supprimé cet etudiant!");
			         break; 
			       }
					
					// IF WE DIDNT FIND THE STUDENT
			       if (i == listEtudiant.size() - 1) {
			           System.out.println("Cet étudiant n'existe pas!");
			  }
		}
		}
		
		
		//METHOD OF SHOWING ALL STUDENTS
		public void getAllStudents(){
			System.out.println("Nom" + space + "Prenom" + space + "Date nai" + space + "Email" + space + "Civilité");
			System.out.println("-------------------------------------------------------------------------------");
			//CALL OUR FUNCTION
			printStudentInformation();
		}
		
		
		//ASCENDING LIST BY NAME
		public void ascendingByName(){
			System.out.println("Nom" + space + "Prenom" + space + "Date nai" + space + "Email" + space + "Civilité");
			System.out.println("-------------------------------------------------------------------------------");
			//SORTED LIST BY NAME
			//LIST INTERFACE SORT()
			listEtudiant.sort(Comparator.comparing(Etudiant::getNom));
			//CALL OUR FUNCTION
			printStudentInformation();		
		}
		
		
		//ASCENDING LIST BY BIRTH
		public void descendingByBirth(){
			System.out.println("Nom" + space + "Prenom" + space + "Date nai" + space + "Email" + space + "Civilité");
			System.out.println("-------------------------------------------------------------------------------");
			//SORTED LIST DESCENDING
			Collections.sort(listEtudiant, new Operations());
			//CALL OUR FUNCTION
			printStudentInformation();
		}
		
		
		//FUNCTION OF PRINTING
		public void printStudentInformation() {
			//IF OUR LIST IS EMPTY, WE PRINT IT
			if (listEtudiant.isEmpty() ) {
				System.out.println("La liste vide, veuillez la remplir");
			}else {
				//IF NOT, WE PRINT EVERY STUDENTS INFROMATIONES
				for (Etudiant etudiant : listEtudiant) {	
					String dateNaissance = dateFormat.format(etudiant.getDateNaissance());
					System.out.println(etudiant.getNom() + "\t" + 
									   etudiant.getPrenom() + "\t" +
									   dateNaissance + "\t" + 
									   etudiant.getEmail() + "\t" + 
							           etudiant.getCivilte());
				}
			}
			
		}
		
		
		//Collections.sort() WITH COMPARATOR 
		@Override
		public int compare(Etudiant e1, Etudiant e2) {
			return e2.getDateNaissance().compareTo(e1.getDateNaissance());
		}
		

}
