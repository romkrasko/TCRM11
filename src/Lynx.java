public class Lynx implements Animal {

    private String speakWord;
    private String type;

    public Lynx(String speakWord) {
        this.speakWord = speakWord;
        this.type = type;
    }
    public Lynx() {
        this.type = "Lynx";
    }

    public String getSpeakWord() {
        return speakWord;
    }

    public void setSpeakWord(String speakWord) {
        this.speakWord = speakWord;
    }

    public void speak(){
        System.out.println(getSpeakWord());
    }


    public void info(){
        System.out.println(Cat.class.getName()+" goes "+getSpeakWord());
    }

}