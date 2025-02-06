import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Création des personnages
        Personnage perso1 = new Gentil("Luke", "Skywalker", true);
        Personnage perso2 = new Mechant("Darth", "Vader", true);
        Personnage perso3 = new Gentil("Leia", "Organa", false);

        // Ajout des personnages à des acteurs
        Acteur acteur1 = new Acteur("Mark", "Hamill");
        acteur1.ajouterPersonnage(perso1);

        Acteur acteur2 = new Acteur("Carrie", "Fisher");
        acteur2.ajouterPersonnage(perso3);

        Acteur acteur3 = new Acteur("David", "Prowse");
        acteur3.ajouterPersonnage(perso2);

        // Création d'un film
        Film film = new Film("Star Wars", 1977, 1, 11_000_000, 775_000_000);
        film.ajouterActeur(acteur1);
        film.ajouterActeur(acteur2);
        film.ajouterActeur(acteur3);

        // Test des fonctionnalités
        System.out.println("Nombre d'acteurs : " + film.nbActeurs());
        System.out.println("Nombre de personnages : " + film.nbPersonnages());
        System.out.println("Bénéfice : " + film.calculBenefice());
        System.out.println("Sortie avant 1980 : " + film.isBefore(1980));

        // Tri des acteurs
        film.triActeursParNom();
        System.out.println(film);
    }
}
