package MiniProject;

public class WeightedIngredient extends Ingridient {

    private double weight;
    private double pricePerUnit;
    private int next_id = 0;
    private static int id;

    public WeightedIngredient(String name, double weight, double pricePerUnit) {
        super(name.toLowerCase());
        this.weight = weight;
        this.pricePerUnit = pricePerUnit;
        id = next_id++;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double getWeight() {
        return weight;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public static int getId() {
        return id;
    }

    @Override
    public double getPrice() {
        return weight * pricePerUnit;
    }

    @Override
    public String toString() {
        return  "\nIme: " + getName() +
                ", PricePerUnit: " + pricePerUnit +
                ", Weight: " + weight;
    }
}
