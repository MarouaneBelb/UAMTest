import java.text.ParseException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws ParseException {
		Operations operationToDo = new Operations();
		
		//OUR SCANNER OBJECT
		Scanner sc = new Scanner(System.in);
		//WELCOME
		System.out.println("GESTION DES ETUDIANTS");
		System.out.println("-----------------------");
		
		//VARIABLES
		char reponse=' ', operation = ' ';
		
		
		do {
			 do{ // WHILE REPONSE IS NOT YES OR NO
			        operation = ' ';
			    	System.out.println("Veuillez entre le numéro l'opération à faire!");
					System.out.println("1 - Créer un nouvel étudiant");
					System.out.println("2 - Afficher la liste des étudiants");
					System.out.println("3 - Supprimer un étudiant");
					System.out.println("4 - Trier la liste des étudiants par nom ascendant");
					System.out.println("5 - Trier la liste des étudiants par date de naissance descendant");
					
					//VALUE OF THE OPERATION
			        operation = sc.nextLine().charAt(0);
			       
			        if(operation != '1' && operation != '2' && operation != '3' && operation != '4' && operation != '5')
			          System.out.println("Operation n'existe pas, veuillez ressayer une autre");
			  
			      }while (operation != '1' && operation != '2' && operation != '3' && operation != '4' && operation != '5');
			
			 //IF ADDING CHOSEN
			 if (operation == '1') {
				 operationToDo.addStudent();
			 }
			 //IF SHOWING STUDENT CHOSEN
			 if (operation == '2') {
				 operationToDo.getAllStudents();
			 }
			 //IF DELETING STUDENT CHOSEN
			 if (operation == '3') {
				 operationToDo.deleteStudent();
			 }
			 //IF SORTED BY NAME CHOSEN
			 if (operation == '4') {
				 operationToDo.ascendingByName();
			 }
			//IF SORTED BY BIRTH CHOSEN
			 if (operation == '5') {
				 operationToDo.descendingByBirth();
			 }
			 
			 
			//TO PROCEED OR TO LEAVE
		      do{       
		    	  
		        System.out.println("Tapez (Y) to recommencer ou (N) to quitter");
		        reponse = sc.nextLine().charAt(0);
		       
		      }while(reponse != 'Y' && reponse != 'N');	
			
		}while (reponse == 'Y');
		
		System.out.println("MERCI");
		
		
		
		
	
		
		
		
		
		
	

	}

}
