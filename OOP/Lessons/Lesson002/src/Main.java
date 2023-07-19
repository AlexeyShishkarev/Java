import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Speackable> animals = new ArrayList<>();
        animals.add(new Cat("Барсик"));
        animals.add(new Dog("Бобик"));

        NoiseZoo noiseZoo = new NoiseZoo(animals);
        noiseZoo.speakAll();
    }
}