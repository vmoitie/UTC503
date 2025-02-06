public class Gentil extends Personnage {
    private boolean force;

    public Gentil(String nom, String prenom, boolean force) {
        super(nom, prenom);
        this.force = force;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return "Gentil{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", force=" + force +
                '}';
    }
}
