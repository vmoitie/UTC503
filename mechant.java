public class Mechant extends Personnage {
    private boolean coteObscur;

    public Mechant(String nom, String prenom, boolean coteObscur) {
        super(nom, prenom);
        this.coteObscur = coteObscur;
    }

    public boolean isCoteObscur() {
        return coteObscur;
    }

    public void setCoteObscur(boolean coteObscur) {
        this.coteObscur = coteObscur;
    }

    @Override
    public String toString() {
        return "Mechant{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", coteObscur=" + coteObscur +
                '}';
    }
}
