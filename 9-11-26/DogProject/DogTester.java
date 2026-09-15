package DogProject;

import java.util.Arrays;

public class DogTester {
    static void main() {
        Dog d1 = new Dog("Bryce", 2, 64.3);
        Dog d2 = new Dog("Slice", 7, 3.4);
        Dog d3 = new Dog("Thrice", 0, 97);

        Dog[] pack = {d1, d2, d3};

        for (Dog dog : pack) {
            System.out.println(dog);
        }
        System.out.println("--------------------------");

        Arrays.sort(pack);

        for (Dog dog : pack) {
            System.out.println(dog);
        }
    }
}
