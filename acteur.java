import java.util.ArrayList;
import java.util.List;

public class Acteur {
    private String nom;
    private String prenom;
    private List<Personnage> personnages;

    // Constructeur
    public Acteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.personnages = new ArrayList<>();
    }

    // Ajout d'un personnage
    public void ajouterPersonnage(Personnage personnage) {
        this.personnages.add(personnage);
    }

    // Méthode nbPersonnages()
    public int nbPersonnages() {
        return personnages.size();
    }

    // Getters et Setters
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

    @Override
    public String toString() {
        return "Acteur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", personnages=" + personnages +
                '}';
    }
}
