package MiniProject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Database {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<WeightedIngredient> fridgeInventory;
    public static ArrayList<Recipe> recipesInventory;


    public static void getStarted() {
        fridgeInventory = new ArrayList<>();
        recipesInventory = new ArrayList<>();


        // Osnovni recepti
        Recipe hamburger = new Recipe("Hamburger", RecipeLevel.BEGINNER);
        Recipe jagnjetinaNaZaru = new Recipe("Jagnjetina na zaru", RecipeLevel.BEGINNER);
        Recipe piletinaNaZaru = new Recipe("Piletina na zaru", RecipeLevel.EASY);
        Recipe biftekSaUmakomOdSampinjona = new Recipe("Biftek sa umakom od sampinjona", RecipeLevel.EASY);
        Recipe semifredo = new Recipe("Semifredo", RecipeLevel.MEDIUM);
        Recipe ribljaCorba = new Recipe("Riblja corba", RecipeLevel.MEDIUM);
        Recipe carpaccioTuna = new Recipe("Carpaccio tuna", RecipeLevel.HARD);
        Recipe biftekSaUmakomOdTartufa = new Recipe("Biftek sa umakom od tartufa", RecipeLevel.HARD);
        Recipe pasticada = new Recipe("Pasticada", RecipeLevel.PRO);
        Recipe ajkulaUZacinu = new Recipe("Ajkula u zacinu", RecipeLevel.PRO);

        // Osnovni sastojci
        WeightedIngredient crniLuk = new WeightedIngredient("Crni Luk", 0, 50);
        WeightedIngredient mesavinaZacina = new WeightedIngredient("Mesavina zacina", 0, 80);
        WeightedIngredient jabuke = new WeightedIngredient("Jabuke", 0, 30);
        WeightedIngredient meso = new WeightedIngredient("Meso", 0, 100);
        WeightedIngredient sargarepa = new WeightedIngredient("Sargarepa", 0, 70);
        WeightedIngredient njoke = new WeightedIngredient("Njoke", 0, 150);
        WeightedIngredient slanina = new WeightedIngredient("Slanina", 0, 200);
        WeightedIngredient persun = new WeightedIngredient("Persun", 0, 10);
        WeightedIngredient ulje = new WeightedIngredient("Ulje", 0, 150);
        WeightedIngredient vino = new WeightedIngredient("Vino", 0, 220);
        WeightedIngredient pomfrit = new WeightedIngredient("Pomfrit", 0, 80);
        WeightedIngredient secer = new WeightedIngredient("Secer", 0, 90);
        WeightedIngredient badem = new WeightedIngredient("Badem", 0, 250);
        WeightedIngredient jaje = new WeightedIngredient("Jaje", 0, 10);
        WeightedIngredient tunaSteak = new WeightedIngredient("Tuna steak", 0, 500);
        WeightedIngredient rukola = new WeightedIngredient("Rukola", 0, 30);
        WeightedIngredient paprika = new WeightedIngredient("Paprika", 0, 80);
        WeightedIngredient riba = new WeightedIngredient("Riba", 0, 120);
        WeightedIngredient limun = new WeightedIngredient("Limun", 0, 140);
        WeightedIngredient tartufata = new WeightedIngredient("Tartufata", 0, 1000);
        WeightedIngredient sampinjoni = new WeightedIngredient("Sampinjoni", 0, 110);
        WeightedIngredient beliLuk = new WeightedIngredient("Beli luk", 0, 80);
        WeightedIngredient slag = new WeightedIngredient("Slag", 0, 120);

        Fridge.addIngridient(new WeightedIngredient(meso.getName(), 10, meso.getPricePerUnit()));
        Fridge.addIngridient(new WeightedIngredient(crniLuk.getName(), 2, crniLuk.getPricePerUnit()));
        Fridge.addIngridient(new WeightedIngredient(pomfrit.getName(), 20, meso.getPricePerUnit()));
        Fridge.addIngridient(new WeightedIngredient(sampinjoni.getName(), 3, sampinjoni.getPricePerUnit()));
        Fridge.addIngridient(new WeightedIngredient(ulje.getName(), 5, ulje.getPricePerUnit()));
        Fridge.addIngridient(new WeightedIngredient(jaje.getName(), 40, jaje.getPricePerUnit()));
        Fridge.addIngridient(new WeightedIngredient(rukola.getName(), 5, rukola.getPricePerUnit()));
        Fridge.addIngridient(new WeightedIngredient(riba.getName(), 50, riba.getPricePerUnit()));
        Fridge.addIngridient(new WeightedIngredient(beliLuk.getName(), 10, beliLuk.getPricePerUnit()));
        Fridge.addIngridient(new WeightedIngredient(tunaSteak.getName(), 3, tunaSteak.getPricePerUnit()));
        Fridge.addIngridient(new WeightedIngredient(vino.getName(), 5, vino.getPricePerUnit()));
        Fridge.addIngridient(new WeightedIngredient(mesavinaZacina.getName(), 1, mesavinaZacina.getPricePerUnit()));
        Fridge.addIngridient(new WeightedIngredient(paprika.getName(), 5, paprika.getPricePerUnit()));


        hamburger.addIngridients(new WeightedIngredient(crniLuk.getName().toLowerCase(), 0.003, crniLuk.getPricePerUnit()));
        hamburger.addIngridients(new WeightedIngredient(meso.getName().toLowerCase(), 0.15, meso.getPricePerUnit()));
        hamburger.addIngridients(new WeightedIngredient(mesavinaZacina.getName().toLowerCase(), 0.01, mesavinaZacina.getPricePerUnit()));
        hamburger.addIngridients(new WeightedIngredient(pomfrit.getName().toLowerCase(), 0.133, pomfrit.getPricePerUnit()));
        hamburger.addIngridients(new WeightedIngredient(paprika.getName().toLowerCase(), 0.02, paprika.getPricePerUnit()));
        hamburger.addIngridients(new WeightedIngredient(ulje.getName().toLowerCase(), 0.05, ulje.getPricePerUnit()));
        recipesInventory.add(hamburger);

        jagnjetinaNaZaru.addIngridients(new WeightedIngredient(mesavinaZacina.getName().toLowerCase(), 0.01, mesavinaZacina.getPricePerUnit()));
        jagnjetinaNaZaru.addIngridients(new WeightedIngredient(meso.getName().toLowerCase(), 0.4, meso.getPricePerUnit()));
        jagnjetinaNaZaru.addIngridients(new WeightedIngredient(ulje.getName().toLowerCase(), 0.1, ulje.getPricePerUnit()));
        recipesInventory.add(jagnjetinaNaZaru);

        piletinaNaZaru.addIngridients(new WeightedIngredient(crniLuk.getName().toLowerCase(), 0.05, crniLuk.getPricePerUnit()));
        piletinaNaZaru.addIngridients(new WeightedIngredient(meso.getName().toLowerCase(), 0.25, meso.getPricePerUnit()));
        piletinaNaZaru.addIngridients(new WeightedIngredient(ulje.getName().toLowerCase(), 0.06, ulje.getPricePerUnit()));
        piletinaNaZaru.addIngridients(new WeightedIngredient(mesavinaZacina.getName().toLowerCase(), 0.01, mesavinaZacina.getPricePerUnit()));
        recipesInventory.add(piletinaNaZaru);

        biftekSaUmakomOdSampinjona.addIngridients(new WeightedIngredient(mesavinaZacina.getName().toLowerCase(), 0.01, mesavinaZacina.getPricePerUnit()));
        biftekSaUmakomOdSampinjona.addIngridients(new WeightedIngredient(meso.getName().toLowerCase(), 0.25, meso.getPricePerUnit()));
        biftekSaUmakomOdSampinjona.addIngridients(new WeightedIngredient(ulje.getName().toLowerCase(), 0.06, ulje.getPricePerUnit()));
        biftekSaUmakomOdSampinjona.addIngridients(new WeightedIngredient(pomfrit.getName().toLowerCase(), 0.2, pomfrit.getPricePerUnit()));
        biftekSaUmakomOdSampinjona.addIngridients(new WeightedIngredient(sampinjoni.getName().toLowerCase(), 0.2, sampinjoni.getPricePerUnit()));
        recipesInventory.add(biftekSaUmakomOdSampinjona);

        semifredo.addIngridients(new WeightedIngredient(badem.getName().toLowerCase(), 0.015, badem.getPricePerUnit()));
        semifredo.addIngridients(new WeightedIngredient(mesavinaZacina.getName().toLowerCase(), 0.008, mesavinaZacina.getPricePerUnit()));
        semifredo.addIngridients(new WeightedIngredient(jaje.getName().toLowerCase(), 4, jaje.getPricePerUnit()));
        semifredo.addIngridients(new WeightedIngredient(secer.getName().toLowerCase(), 0.02, secer.getPricePerUnit()));
        semifredo.addIngridients(new WeightedIngredient(slag.getName().toLowerCase(), 0.05, slag.getPricePerUnit()));
        recipesInventory.add(semifredo);

        ribljaCorba.addIngridients(new WeightedIngredient(persun.getName().toLowerCase(), 0.005, persun.getPricePerUnit()));
        ribljaCorba.addIngridients(new WeightedIngredient(riba.getName().toLowerCase(), 0.15, riba.getPricePerUnit()));
        ribljaCorba.addIngridients(new WeightedIngredient(mesavinaZacina.getName().toLowerCase(), 0.01, mesavinaZacina.getPricePerUnit()));
        ribljaCorba.addIngridients(new WeightedIngredient(ulje.getName().toLowerCase(), 0.03, ulje.getPricePerUnit()));
        recipesInventory.add(ribljaCorba);

        carpaccioTuna.addIngridients(new WeightedIngredient(tunaSteak.getName().toLowerCase(), 0.08, tunaSteak.getPricePerUnit()));
        carpaccioTuna.addIngridients(new WeightedIngredient(mesavinaZacina.getName().toLowerCase(), 0.01, mesavinaZacina.getPricePerUnit()));
        carpaccioTuna.addIngridients(new WeightedIngredient(limun.getName().toLowerCase(), 0.1, limun.getPricePerUnit()));
        carpaccioTuna.addIngridients(new WeightedIngredient(ulje.getName().toLowerCase(), 0.015, ulje.getPricePerUnit()));
        carpaccioTuna.addIngridients(new WeightedIngredient(rukola.getName().toLowerCase(), 0.04, rukola.getPricePerUnit()));
        recipesInventory.add(carpaccioTuna);

        biftekSaUmakomOdTartufa.addIngridients(new WeightedIngredient(meso.getName().toLowerCase(), 0.25, meso.getPricePerUnit()));
        biftekSaUmakomOdTartufa.addIngridients(new WeightedIngredient(tartufata.getName().toLowerCase(), 0.02, tartufata.getPricePerUnit()));
        biftekSaUmakomOdTartufa.addIngridients(new WeightedIngredient(ulje.getName().toLowerCase(), 0.1, ulje.getPricePerUnit()));
        biftekSaUmakomOdTartufa.addIngridients(new WeightedIngredient(persun.getName().toLowerCase(), 0.001, persun.getPricePerUnit()));
        recipesInventory.add(biftekSaUmakomOdTartufa);

        pasticada.addIngridients(new WeightedIngredient(beliLuk.getName().toLowerCase(), 0.003, beliLuk.getPricePerUnit()));
        pasticada.addIngridients(new WeightedIngredient(jabuke.getName().toLowerCase(), 0.008, jabuke.getPricePerUnit()));
        pasticada.addIngridients(new WeightedIngredient(mesavinaZacina.getName().toLowerCase(), 0.01, mesavinaZacina.getPricePerUnit()));
        pasticada.addIngridients(new WeightedIngredient(crniLuk.getName().toLowerCase(), 0.08, crniLuk.getPricePerUnit()));
        pasticada.addIngridients(new WeightedIngredient(sargarepa.getName().toLowerCase(), 0.2, sargarepa.getPricePerUnit()));
        pasticada.addIngridients(new WeightedIngredient(njoke.getName().toLowerCase(), 0.25, njoke.getPricePerUnit()));
        pasticada.addIngridients(new WeightedIngredient(slanina.getName().toLowerCase(), 0.005, slanina.getPricePerUnit()));
        pasticada.addIngridients(new WeightedIngredient(persun.getName().toLowerCase(), 0.003, persun.getPricePerUnit()));
        pasticada.addIngridients(new WeightedIngredient(ulje.getName().toLowerCase(), 0.08, ulje.getPricePerUnit()));
        pasticada.addIngridients(new WeightedIngredient(vino.getName().toLowerCase(), 0.03, vino.getPricePerUnit()));
        recipesInventory.add(pasticada);

        ajkulaUZacinu.addIngridients(new WeightedIngredient(beliLuk.getName().toLowerCase(), 0.001, beliLuk.getPricePerUnit()));
        ajkulaUZacinu.addIngridients(new WeightedIngredient(mesavinaZacina.getName().toLowerCase(), 0.008, mesavinaZacina.getPricePerUnit()));
        ajkulaUZacinu.addIngridients(new WeightedIngredient(riba.getName().toLowerCase(), 0.5, riba.getPricePerUnit()));
        ajkulaUZacinu.addIngridients(new WeightedIngredient(persun.getName().toLowerCase(), 0.001, persun.getPricePerUnit()));
        ajkulaUZacinu.addIngridients(new WeightedIngredient(vino.getName().toLowerCase(), 0.05, vino.getPricePerUnit()));
        ajkulaUZacinu.addIngridients(new WeightedIngredient(ulje.getName().toLowerCase(), 0.02, ulje.getPricePerUnit()));
        recipesInventory.add(ajkulaUZacinu);

        Scanner sc = new Scanner(System.in);
        System.out.println("*** DOBRODOSLI U MENI***");
        System.out.print("""
                1. Unos namirnica u frizider
                2. Brisanje namirnica iz frizidera
                3. Koja jela mogu da se naprave
                4. Koja jela mogu da se naprave (50%)
                5. Pravljenje jela
                6. Koja sve jela mozete da napravite za "X" dinara
                7. Koja sve jela mozete da napravite u odredjenoj tezini
                8. Koja sve jela mozete da napravite do "X" dinara i u odredjenoj tezini
                9. Sortiranje recepta po ceni
                10. Svi recepti
                0. Kraj
                """);
        int input = sc.nextInt();
        while (input != 0) {
            switch (input) {
                case 1:
                    Fridge.addIngridient();
                    break;
                case 2:
                    Fridge.removeIngridient();
                    break;
                case 3:
                    canYouMakeIt();
                    break;
                case 4:
                    canYouMakeItScaled();
                    break;
                case 5:
                    makeTheRecipe();
                    break;
                case 6:
                    System.out.print("Do koliko dinara zelite da napravite recept?: ");
                    double price = sc.nextDouble();
                    whatCanYouMake(price);
                    break;
                case 7:
                    System.out.print("0.Beginner \n1.Easy \n2.Medium \n3.Hard \n4.Pro \nIzaberite tezinu: ");
                    int tezina = sc.nextInt();
                    sortByLevel(tezina);
                    break;
                case 8:
                    System.out.print("0.Beginner \n1.Easy \n2.Medium \n3.Hard \n4.Pro \nIzaberite tezinu: " );
                    int level = sc.nextInt();
                    System.out.print("Do koje cene?: ");
                    double price2 = sc.nextDouble();
                    sortByLevelandPrice(level, price2);
                    break;
                case 9:
                    sortRecipeByPrice();
                    break;
                case 10:
                    allRecipies();
                    break;
            }
            System.out.println("\n".repeat(2));
            System.out.print("""
                    1. Unos namirnica u frizider
                    2. Brisanje namirnica iz frizidera
                    3. Koja jela mogu da se naprave
                    4. Koja jela mogu da se naprave (50%)
                    5. Pravljenje jela
                    6. Koja sve jela mozete da napravite za "X" dinara:
                    7. Koja sve jela mozete da napravite u odredjenoj tezini:
                    8. Koja sve jela mozete da napravite do X dinara i u odredjenoj tezini:
                    9. Sortiranje recepta po ceni
                    10. Svi recepti
                    0. Kraj
                    """);
            input = sc.nextInt();
        }
    }

    public static void allRecipies(){
        for (var recipe : recipesInventory) {
            System.out.println(recipe.toString());
        }
    }

    public static void sortRecipeByPrice() {
        ArrayList<Recipe> sorting = new ArrayList<>();
        for (var recipe : recipesInventory) {
            if (sorting.isEmpty()) {
                sorting.add(recipe);
            } else {
                if (sorting.get(0).getPrice() > recipe.getPrice()) {
                    var tmp = sorting.get(0);
                    sorting.add(0, recipe);
                    sorting.add(tmp);
                } else {
                    sorting.add(recipe);
                }
            }
        }
        int counter = 1;
        for (var sort : sorting)
        System.out.println(counter++ + ". " + sort);
    }

    public static void sortByLevel(int number) {
        String s = "";
        for (var recipe : recipesInventory) {
            if (recipe.getLevel() == RecipeLevel.values()[number]) {
                s += recipe.getRecipeName() + " " + recipe.getPrice() + " din\n";
            }
        }
        System.out.println(s);
    }

    public static void sortByLevelandPrice(int level, double price) {
        String s = "";
        for (var recipe : recipesInventory) {
            if (recipe.getLevel() == RecipeLevel.values()[level] && recipe.getPrice() <= price) {
                s += recipe.getRecipeName() + " " + recipe.getPrice() + " din\n";
            }
        }
        System.out.println(s);
    }

    public static void canYouMakeIt() {
        System.out.println("Koji recept zelite da napravite?: ");
        System.out.println(recipesInventory.toString());
        String input = sc.nextLine().toLowerCase();
        ArrayList<WeightedIngredient> x = new ArrayList<>();
        for (var recipe : recipesInventory) {
            if (recipe.getRecipeName().toLowerCase().equals(input)) {
                x = recipe.getIngridients();
            }
        }
        for (var ing : x) {
            if ((Fridge.getIngredientWeight(ing.getName()) - ing.getWeight()) < 0) {
                System.out.println("Nemamo dovoljno sastojaka za ovaj recept");
                return;
            }
        }
        System.out.println("Imamo dovoljno sastojaka za ovaj recept");

    }

    public static void canYouMakeItScaled() {
        System.out.println("Koji recept zelite da napravite?: ");
        System.out.println(recipesInventory.toString());
        String input = sc.nextLine().toLowerCase();
        ArrayList<WeightedIngredient> x = new ArrayList<>();
        for (var recipe : recipesInventory) {
            if (recipe.getRecipeName().toLowerCase().equals(input)) {
                x = recipe.getScaledRecipe(50);
            }
        }
        for (var ing : x) {
            if ((Fridge.getIngredientWeight(ing.getName()) - ing.getWeight()) < 0) {
                System.out.println("Nemamo dovoljno sastojaka za ovaj recept");
                return;
            }
        }
        System.out.println("Imamo dovoljno sastojaka za ovaj recept");
    }


    public static void makeTheRecipe() {
        System.out.println("Koji recept zelite da napravite?: ");
        System.out.println(recipesInventory.toString());
        String input = sc.nextLine().toLowerCase();
        ArrayList<WeightedIngredient> x = new ArrayList<>();
        for (var recipe : recipesInventory) {
            if (recipe.getRecipeName().toLowerCase().equals(input)) {
                x = recipe.getIngridients();
            }
        }
        for (var ing : x) {
            if (!((Fridge.getIngredientWeight(ing.getName()) - ing.getWeight()) < 0)) {
                Fridge.getIngredient(ing.getName()).setWeight(Fridge.getIngredientWeight(ing.getName()) - ing.getWeight());
            } else {
                System.out.println("Ne mozemo da napravimo ovaj recept");
                return;
            }
        }
        System.out.println("Recept je napravljen!");
    }

    public static void whatCanYouMake(double number) {
        int counter = 1;
        for (var recipe : recipesInventory) {
            if (recipe.getPrice() < number) {
                System.out.println(counter++ + "." + recipe.getRecipeName());
            }
        }
    }

}



