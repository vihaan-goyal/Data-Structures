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
        return "Name: " + name + " Age: " + age + " Weight: " + weight;
    }


    //compare age
    /*@Override public int compareTo(Dog other){
        return this.age - other.age;
    }
    */

    //compare weight

    @Override public int compareTo(Dog other){
        if(this.weight > other.weight)
            return 1;
        if(this.weight < other.weight)
            return -1;
        return 0;
    }

    public double getWeight(){
        return this.weight;
    }
    /*
    //compare name
    @Override public int compareTo(Dog other){
        return this.name.compareTo(other.name);
    }
    */



}
