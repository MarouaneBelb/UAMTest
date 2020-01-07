import java.util.Date;


public class Etudiant {
	private String nom;
	private String prenom;
	private String email;
	private Date dateNaissance;
	private Civilite civilte;
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String nom, String prenom, String email, Date dateNaissance, Civilite civilte) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.dateNaissance = dateNaissance;
		this.civilte = civilte;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Civilite getCivilte() {
		return civilte;
	}

	public void setCivilte(Civilite civilte) {
		this.civilte = civilte;
	}
	
	

}
