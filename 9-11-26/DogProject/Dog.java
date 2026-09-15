package DogProject;

public class Dog implements Comparable<Dog>{
    private String name;
    private int age;
    private double weight;

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                "Name: " + name + " Age: " + age + " Weight: " + weight;
    }
}
