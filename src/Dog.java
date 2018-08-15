public class Dog extends Pet {

    public Dog(Person owner) {
        this.type = "Dog";
        setOwner(owner);
    }

    public Dog() {
        this.type = "Dog";
    }

    @Override
    public void speak(){
        System.out.println(this.type+", Woof");
    }

    @Override
    public void info(){
        System.out.println(Dog.class.getName()+" goes Woof");
    }
}