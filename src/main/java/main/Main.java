package main;
import controller.EreignisController;
import controller.MovieController;
import controller.MovieController;
import model.Movie;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieController controller = new MovieController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MOVIE MENU ===");
            System.out.println("1. Arata toate filmele");
            System.out.println("2. Cauta filme bune (dupa nota minima)");
            System.out.println("3. Iesire");
            System.out.print("Alege: ");

            String optiune = scanner.nextLine();

            switch (optiune) {
                case "1":
                    List<Movie> all = controller.findAll();
                    for (Movie m : all) {
                        System.out.println(m);
                    }
                    break;

                case "2":
                    System.out.print("Introdu nota minima (ex: 8.0): ");
                    // Citim ca String si convertim, e mai sigur
                    String inputNota = scanner.nextLine();
                    double nota = Double.parseDouble(inputNota);

                    List<Movie> bune = controller.filterByMinRating(nota);
                    if (bune.isEmpty()) {
                        System.out.println("Niciun film gasit cu nota asta.");
                    } else {
                        System.out.println("Filme gasite:");
                        for (Movie m : bune) {
                            System.out.println(m);
                        }
                    }
                    break;

                case "3":
                    System.out.println("Pa!");
                    return; // Oprește programul

                default:
                    System.out.println("Optiune gresita!");
            }
        }
    }
}