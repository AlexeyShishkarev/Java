import java.util.List;

public class NoiseZoo {
    private List<Speackable> speackable;

    public NoiseZoo(List<Speackable> speackable) {
        this.speackable = speackable;
    }
    public void speakAll(){
        for (Speackable speackable: speackable){
            speackable.speak();
        }
    }
}
