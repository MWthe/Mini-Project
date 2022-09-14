package MiniProject;

import java.util.*;

public class Recipe implements Priceable {
    private RecipeLevel recipeLevel;
    private String recipeName;
    private ArrayList<WeightedIngredient> requiredIngridients;
    Scanner sc = new Scanner(System.in);
    public Recipe(String recipeName, RecipeLevel recipeLevel) {
        this.requiredIngridients = new ArrayList<>();
        this.recipeName = recipeName;
        this.recipeLevel = recipeLevel;
    }

    public Recipe() {
    }

    public void addRecipe() {
        System.out.println("MOLIMO VAS UNESITE 1 ZA UNOS RECEPTA ILI 0 ZA NAZAD");
        int input = sc.nextInt();
        while(input != 0) {
            System.out.println("Unesite ime recepta: ");
            String recName = sc.nextLine().toLowerCase();
            System.out.println("Unesite tezinu recepta(BEGINNER, EASY, MEDIUM, HARD, PRO): ");
            String recLevel = sc.nextLine().toLowerCase();
            ArrayList <RecipeLevel> rl = new ArrayList<>(1);
            switch (recLevel) {
                case "beginner":
                    rl.add(RecipeLevel.BEGINNER);
                    break;
                case "easy":
                    rl.add(RecipeLevel.EASY);
                    break;
                case "medium":
                    rl.add(RecipeLevel.MEDIUM);
                    break;
                case "hard":
                    rl.add(RecipeLevel.HARD);
                    break;
                case "pro":
                    rl.add(RecipeLevel.PRO);
                    break;
                default:
                    System.out.println("Pogresan unos");
            }
            Recipe x = new Recipe(recName, rl.get(0));
            System.out.println("MOLIMO VAS UNESITE 1 ZA UNOS RECEPTA ILI 0 ZA NAZAD");
            input = sc.nextInt();
        }

    }

    public RecipeLevel getLevel() {
        return recipeLevel;
    }
    public void addIngridients(WeightedIngredient weightedIngredient) {
        this.requiredIngridients.add(weightedIngredient);
    }

    public void addIngridients() {
        int input = 1;
        while (input != 0) {
            System.out.print("Unesite naziv sastojka: ");
            String ingridientName = sc.next();
            sc.nextLine();
            System.out.print("Unesite potrebnu kolicinu za ovaj recept: ");
            double ingridientWeight = sc.nextDouble();
            System.out.println("Unesite cenu po jedinici mere: ");
            double ingridientPrice = sc.nextDouble();
            WeightedIngredient addedIngridient = new WeightedIngredient(ingridientName, ingridientWeight, ingridientPrice);
            if (this.requiredIngridients.isEmpty()) {
                this.requiredIngridients.add(addedIngridient);
                System.out.println("Sastojak je dodat!");
            } else {
                for (var ingridient : this.requiredIngridients)
                    if (ingridientName.toLowerCase().equals(ingridient.getName())) {
                        ingridient.setWeight(ingridientWeight + ingridient.getWeight());
                        break;
                    } else {
                        this.requiredIngridients.add(addedIngridient);
                        System.out.println("Sastojak je dodat!");
                        break;
                    }
            }
            System.out.print("MOLIMO VAS UNESITE 1 ZA UNOS SASTOJAKA U RECEPT ILI 0 ZA NAZAD: ");
            input = sc.nextInt();
        }

    }

    public String removeIngridients(WeightedIngredient ingridient) {
        String s = "";
        for (var reqIngridient : requiredIngridients) {
            if (reqIngridient.getName().equals(ingridient.getName())) {
                requiredIngridients.remove(ingridient);
            } else {
                s = "Taj sastojak ne postoji u receptu!";
            }
        }
        return s;
    }

    public void removeIngridients() {
        System.out.print("MOLIMO VAS UNESITE 1 ZA BRISANJE SASTOJAKA IZ RECEPTA ILI 0 ZA NAZAD: ");
        int input = sc.nextInt();
        while (input != 0) {
            System.out.println("Molimio vas unesite ime sastojka koji zelite da uklonite");
            String nameOfRecipe = sc.nextLine();
            for (var ingridient : requiredIngridients) {
                if (ingridient.getName().equals(nameOfRecipe)) {
                    requiredIngridients.remove(ingridient);
                    System.out.println("Sastojak je uklonjen");
                } else {
                    System.out.println("Taj sastojak ne postoji u receptu!");
                }
            }
            System.out.print("MOLIMO VAS UNESITE 1 ZA BRISANJE SASTOJAKA IZ RECEPTA ILI 0 ZA NAZAD: ");
            input = sc.nextInt();
        }
    }

    public ArrayList<WeightedIngredient> getScaledRecipe(double scaleNumber) {
        ArrayList <WeightedIngredient> tmp = new ArrayList<>(requiredIngridients);
        for (var ingridient : tmp) {
            ingridient.setWeight(ingridient.getWeight() * (scaleNumber/100));
        }
        return tmp;
    }

    public ArrayList<WeightedIngredient> getIngridients (){
        return requiredIngridients;
    }

    public String getRequiredIngridients() {
        String s = "";
        System.out.println("\nPotrebni sastojci su: ");
        for (var ingridient : requiredIngridients) {
            s += "\n-----------------------------------" +
                    "\nIme:" + ingridient.getName() +
                    "\nKolicina:" + ingridient.getWeight() +
                    "\nCena po jedinici:" + ingridient.getPricePerUnit();
        }
        return s;
    }

    public RecipeLevel getRecipeLevel() {
        return recipeLevel;
    }

    public void setRecipeLevel(RecipeLevel recipeLevel) {
        this.recipeLevel = recipeLevel;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    @Override
    public String toString() {
        return "" + recipeName;
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (var ingridient : requiredIngridients) {
            price += ingridient.getPrice();
        }
        return price;
    }
}
