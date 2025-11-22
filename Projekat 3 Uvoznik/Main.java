package Uvoznik;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Proizvod> proizvodi = new ArrayList<>();

        proizvodi.add(new Garderoba("Majica", "Italija", 123, 2024, 20.0, "Pamuk", "Ljeto"));
        proizvodi.add(new Hrana("Mlijeko", "Njemačka", 456, 2025, 1.0, 80, "2025-02-01"));
        proizvodi.add(new Hrana("Tjestenina", "Italija", 789, 2025, 2.0, 200, "2026-01-01"));

        System.out.println("=== SVI PROIZVODI ===");
        for (Proizvod p : proizvodi) {
            System.out.println(p);
        }

        System.out.println("\n=== MALOPRODAJNE CIJENE ===");
        for (Proizvod p : proizvodi) {
            System.out.println(p.getUvoznaCijena());
        }

        double sumaHrana = 0, sumaGarderoba = 0;
        int brHrana = 0, brGarderoba = 0;

        for (Proizvod p : proizvodi) {
            if (p instanceof Hrana) {
                sumaHrana += p.getUvoznaCijena();
                brHrana++;
            } else if (p instanceof Garderoba) {
                sumaGarderoba += p.getUvoznaCijena();
                brGarderoba++;
            }
        }

        System.out.println("\n=== PROSJEČNE CIJENE ===");
        if (brHrana > 0)
            System.out.println("Hrana: " + sumaHrana / brHrana);
        if (brGarderoba > 0)
            System.out.println("Garderoba: " + sumaGarderoba / brGarderoba);
    }
}
