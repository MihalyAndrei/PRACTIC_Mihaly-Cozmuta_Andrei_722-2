package main;
import controller.EreignisController;
import controller.SponsorGeschenkController;
import controller.TributController;

import model.Ereignis;
import model.SponsorGeschenk;
import model.Tribut;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EreignisController controller = new EreignisController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENIU ===");
            System.out.println("1. Arata datele");
            System.out.println("2. Filtreaza dupa distrikt si status");
            System.out.println("3. Sorteaza dupa skill level");
            System.out.println("4. Iesire");
            System.out.print("Alege: ");

            String optiune = scanner.nextLine();

            switch (optiune) {
                case "1":
                    List<Ereignis> all = EreignisController.findAll;
                    for (Ereignis m : all) {
                        System.out.println(m);
                    }
                    break;
                    List<SponsorGeschenk> all2=SponsorGeschenkController.findAll();
                    for (SponsorGeschenk m : all2) {
                        System.out.println(m);
                    }
                    break;
                    List<Tribut> all3=TributController.findAll();
                    for (Tribut m : all3) {
                        System.out.println(m);
                    }
                    break;

                case "2":
                    List<Tribut> bune = TributController.filterbyDistriktAndStatus();
                    if (bune.isEmpty()) {
                        System.out.println("Niciun tribut gasit cu distriktul D si statusul LEBENDIG.");
                    } else {
                        System.out.println("Tribute gasite:");
                        for (Tribut m : bune) {
                            System.out.println(m);
                        }
                    }
                    break;

                case "3":
                    List<Tribut> sortate = TributController.sortBySkillLevel();
                    for (Tribut m : sortate) {
                        System.out.println(m);
                    }
                    break;

                case "4":
                    String name=System.in.read();
                    List<Tribut> sortate = TributController.sortBySkillLevel();
                    for (Tribut m : sortate) {
                        if(getName().equals(name))
                        System.out.println(m);
                    }
                    break;

                case "5":
                    System.out.println("Pa!");
                    return;

                default:
                    System.out.println("Optiune gresita!");
            }
        }
    }
}