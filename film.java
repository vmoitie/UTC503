import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Film {
    private String titre;
    private int anneeDeSortie;
    private int numeroEpisode;
    private double cout;
    private double recette;
    private List<Acteur> acteurs;

    // Constructeur
    public Film(String titre, int anneeDeSortie, int numeroEpisode, double cout, double recette) {
        this.titre = titre;
        this.anneeDeSortie = anneeDeSortie;
        this.numeroEpisode = numeroEpisode;
        this.cout = cout;
        this.recette = recette;
        this.acteurs = new ArrayList<>();
    }

    // Ajout d'un acteur
    public void ajouterActeur(Acteur acteur) {
        this.acteurs.add(acteur);
    }

    // Méthode nbActeurs()
    public int nbActeurs() {
        return acteurs.size();
    }

    // Méthode nbPersonnages()
    public int nbPersonnages() {
        return acteurs.stream()
                .mapToInt(Acteur::nbPersonnages)
                .sum();
    }

    // Méthode calculBénéfice()
    public double calculBenefice() {
        return recette - cout;
    }

    // Méthode isBefore()
    public boolean isBefore(int annee) {
        return this.anneeDeSortie < annee;
    }

    // Méthode tri()
    public void triActeursParNom() {
        acteurs.sort((a1, a2) -> a1.getNom().compareToIgnoreCase(a2.getNom()));
    }

    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre + '\'' +
                ", anneeDeSortie=" + anneeDeSortie +
                ", numeroEpisode=" + numeroEpisode +
                ", cout=" + cout +
                ", recette=" + recette +
                ", acteurs=" + acteurs +
                '}';
    }
}
