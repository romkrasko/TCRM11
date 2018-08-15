public class Cat extends Pet {
    private String sex;
    private String breed;
    private boolean inCafe;
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public String getSex() {
        return sex;
    }
    public String getBreed() {
        return breed;
    }
    public boolean isInCafe() {
        return inCafe;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setInCafe(boolean inCafe) {
        this.inCafe = inCafe;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    //default
    public Cat(){
        inCafe=true;
        type="Cat";
        this.age=10;
    }

    //name and sex
    public Cat(String name, String sex){
        this.name=name;
        this.sex=sex;
        this.inCafe = true;
        this.type="Cat";
        this.age=10;
    }

    //all fields
    public Cat(String name, String sex, String breed, boolean inCafe){
        this.name=name;
        this.sex=sex;
        this.breed=breed;
        this.inCafe=inCafe;
        this.type="Cat";
        this.age=10;
    }



    public void takeAwayFromCafe(Person owner) {
        try {
            if (isInCafe()) throw new MyException("Cat "+getName() +" already home");
            setInCafe(false);
            setOwner(owner);
        } catch (MyException ex) {
            ex.printMessage();
        }
    }

    @Override
    public void speak(){
        System.out.println("Meow");
    }

    @Override
    public void info(){
        System.out.println(Cat.class.getName()+" goes Meow");
    }

}