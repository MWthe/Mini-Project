package MiniProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Fridge {
    private static Scanner sc = new Scanner(System.in);
    private static List<WeightedIngredient> ingridients = new ArrayList<>();

    public static void addIngridient(WeightedIngredient ingredient) {
        ingridients.add(ingredient);
    }

    public static void addIngridient() {
        System.out.print("MOLIMO VAS UNESITE 1 ZA UNOS PROIZVODA U FRIZIDER ILI 0 ZA PREKID: ");
        int choice = sc.nextInt();
        while (choice != 0) {
            System.out.print("Ime:");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Tezina(kg)/Komada:");
            double weight = sc.nextDouble();
            System.out.print("Cena po jedinici:");
            double pricePerUnit = sc.nextDouble();
            WeightedIngredient weightedIngredients = new WeightedIngredient(name, weight, pricePerUnit);
            if (ingridients.isEmpty()) {
                ingridients.add(weightedIngredients);
            } else {
                for (var ingridient : ingridients) {
                    if (ingridient.getName().equals(weightedIngredients.getName())) {
                        ingridient.setWeight(weightedIngredients.getWeight() + ingridient.getWeight());
                        break;
                    } else {
                        ingridients.add(weightedIngredients);
                        break;
                    }
                }
            }
            System.out.print("MOLIMO VAS UNESITE 1 ZA UNOS PROIZVODA U FRIZIDER ILI 0 ZA NAZAD: ");
            choice = sc.nextInt();
        }
    }

    public static void removeIngridient(WeightedIngredient weightedIngridient) {
        if (!ingridients.contains(weightedIngridient)) {
            System.out.println("U frizideru ne postoji ovaj sastojak.");
        } else {
            ingridients.remove(weightedIngridient);
            System.out.println("Sastojak je uklonjen.");
        }
    }

    public static void removeIngridient() {
        System.out.print("\nMOLIMO VAS UNESITE 1 ZA BRISANJE PROIZVODA IZ FRIZIDERA ILI 0 ZA NAZAD: ");
        int choice = sc.nextInt();
        while (choice != 0) {
            int num = 1;
            System.out.println("Trenutne namernice koje su u frizideru: ");
            for (var ingridient : ingridients) {
                System.out.println(num++ + "." + ingridient.getName());
            }
            System.out.print("Koji sastojak zelite da obrisete?: ");
            String name = sc.next();
            for (var ingridient : ingridients) {
                if (ingridient.getName().equals(name)) {
                    ingridients.remove(ingridient);
                    System.out.println("Sastojak je uklonjen.");
                    break;
                }
            }
            System.out.print("\nMOLIMO VAS UNESITE 1 ZA BRISANJE PROIZVODA IZ FRIZIDERA ILI 0 ZA NAZAD: ");
            choice = sc.nextInt();
        }
    }

    public static double getIngredientWeight(String name) {
        for (var ingredient : ingridients) {
           if(ingredient.getName().equals(name)){
               return ingredient.getWeight();
           }
        }
        return 0;
    }
    public static WeightedIngredient getIngredient(String name) {
        for (var ingredient : ingridients) {
            if(ingredient.getName().equals(name)){
                return ingredient;
            }
        }
        return new WeightedIngredient("", 0 , 0);
    }

    public static void getIngridients() {
        for (var ingredient : ingridients) {
            System.out.println(ingredient.toString());
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (var ingridient : ingridients) {
            s += "\n______________________________________" +
                    "\nIme:" + ingridient.getName() +
                    "\nTezina:" + ingridient.getWeight() +
                    "\nCena po jedinici:" + ingridient.getPricePerUnit();
        }
        return s;
    }
}

