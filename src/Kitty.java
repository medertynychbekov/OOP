public class Kitty extends Cat{

    private String breed;

    public Kitty(String name, int weight, String breed) {
        super(name, weight);
        this.breed = breed;
    }


    @Override
    public String toString() {
        return "Kitty{" +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", breed='" + breed + '\'' +
                '}';
    }
}
