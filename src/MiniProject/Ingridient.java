package MiniProject;

public abstract class Ingridient implements Priceable{

    private int next_id = 0;
    private static int id;
    private String name;

    public Ingridient(String name) {
        this.name = name;
        id = next_id++;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
