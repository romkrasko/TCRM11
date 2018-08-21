import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList();
        cats.add(new Cat());
        cats.add(new Cat("Pushok", "Female", "Britain", true));
        cats.add(new Cat("Barsik", "Female", "Pers", true));
        cats.add(new Cat("Pushok2", "Female", "Britain", false));
        cats.add(new Cat("Marusya", "Male", "Britain", true));

        CatCafe cafe = new CatCafe("address1", cats, "13:00-16:00", cats.size());

        Person owner = new Person("personName");

        System.out.println(cats.get(0).isInCafe());
        cats.get(0).setInCafe(false);
        System.out.println(cats.get(0).isInCafe());
        cats.get(0).setInCafe(true);
        System.out.println(cats.get(0).isInCafe());
        try {
            cats.get(1).takeAwayFromCafe(owner);
        } catch (MyException myEx) {
            myEx.printMessage();
        }
        try {
            cats.get(4).takeAwayFromCafe(owner);
        } catch (MyException myEx) {
            myEx.printMessage();
        }
        System.out.println(cats.get(0).isInCafe());
        cafe.printCatsInCafe("Britain");

        Lynx lynx = new Lynx();
        lynx.speak();
        lynx.info();
        Lynx lynx1 = new Lynx("qwerty");
        lynx1.speak();
        lynx1.info();
        Dog dog = new Dog();
        dog.speak();
        dog.info();
        Dog dog1 = new Dog(owner);
        dog1.speak();
        dog1.info();

        owner.acquiringPet("namePet", dog1);


    }
}