public abstract class Pet implements Animal {
    protected int age;
    public String name;
    private Person owner;
    protected String type;
    protected String speakWord;

    public String getOwner() {
        return owner.getName();
    }

    @Override
    public String getSpeakWord() {
        return speakWord;
    }

    @Override
    public void setSpeakWord(String speakWord) {
        this.speakWord = speakWord;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet() {
    }

    public Pet(String speakWord, int age, String name, Person owner) {
        this.age = age;
        this.name = name;
        this.owner = owner;
    }

    @Override
    public void speak(){
        System.out.println(name);
    }

    @Override
    public void info(){
        System.out.println(name);
    }

}