public class Parrot extends Pet {

    private boolean isWave;

    public Parrot(String speakWord, int age, String name, Person owner, boolean isWave) {
        super(speakWord, age, name, owner);
        this.isWave = isWave;
    }

    public Parrot(boolean isWave) {
        this.isWave = isWave;
    }

    public boolean isWave() {
        return isWave;
    }

    public void setWave(boolean wave) {
        isWave = wave;
    }
}