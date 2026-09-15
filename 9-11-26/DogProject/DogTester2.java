package DogProject;

import java.util.Comparator;

public class DogTester2 {
    static void main() {
        Dog d1 = new Dog("Bryce", 2, 64.3);
        Dog d2 = new Dog("Slice", 7, 3.4);
        Dog d3 = new Dog("Thrice", 0, 97);

        Dog[] pack = {d1, d2, d3};

        Comparator<Dog>  c = new Comparator<Dog>() {
            @Override
            public int compare(Dog d1, Dog d2) {
                if(d1.getWeight() < d2. getWeight()) return -1;
                if(d1.getWeight() > d2. getWeight()) return 1;
                return 0;
            }
        };
    }
}
