public class Mustang implements Horse {
    private String Name;
    private double Weight;

    public Mustang(String Name, double Weight){
        this.Name = Name;
        this.Weight = Weight;
    }

    public String getName(){
        return this.Name;
    }

    public double getWeight(){
        return this.Weight;
    }

    public String toString(){
        return this.getName();
    }
}
