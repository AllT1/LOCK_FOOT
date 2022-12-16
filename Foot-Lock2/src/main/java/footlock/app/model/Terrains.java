package footlock.app.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name = "terrain")
public class Terrains {

	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTerrain;
	private String nom;
	private String tel;
	private float prix;
	private String latitude;
	private String longitude;
	private String adresse;
	private String review;
	private String description;
	private int etoiles;
	private String photo;
	private int nbrJoueur;
	
	
	
	public Terrains(String nom, float prix, String latitude, String longitude, String adresse, String review,
			String description, int etoiles, String photo, int nbrJoueur) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.latitude = latitude;
		this.longitude = longitude;
		this.adresse = adresse;
		this.review = review;
		this.description = description;
		this.etoiles = etoiles;
		this.photo = photo;
		this.nbrJoueur = nbrJoueur;
	}
	
	
	public Terrains() {
		super();
	}


	public int getIdTerrain() {
		return idTerrain;
	}
	public void setIdTerrain(int idTerrain) {
		this.idTerrain = idTerrain;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getEtoiles() {
		return etoiles;
	}
	public void setEtoiles(int etoiles) {
		this.etoiles = etoiles;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getNbrJoueur() {
		return nbrJoueur;
	}
	public void setNbrJoueur(int nbrJoueur) {
		this.nbrJoueur = nbrJoueur;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}

	
	






}
