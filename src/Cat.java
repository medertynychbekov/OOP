public class Cat extends Object {
    private String name;
    private int weight;
    private String lastName;
    private String email;



    public Cat(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight + '\'' +
                ", lastName=" + lastName + '\'' +
                ", email=" + email +
                '}';
    }
}
