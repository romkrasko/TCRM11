import java.util.List;

public class CatCafe {

    private String adress;
    private List<Cat> cats;
    private String timeOfWork;
    private int catCounter;

    public CatCafe(String adress,List<Cat> cats, String timeOfWork, int catCounter) {
        this.adress = adress;
        this.cats = cats;
        this.timeOfWork = timeOfWork;
        this.catCounter = catCounter;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTimeOfWork() {
        return timeOfWork;
    }

    public void setTimeOfWork(String timeOfWork) {
        this.timeOfWork = timeOfWork;
    }

    public int getCatCounter() {
        return catCounter;
    }

    public void setCatCounter(int catCounter) {
        this.catCounter = catCounter;
    }

    public void printCatsInCafe(String breed) {
        for (Cat cat : cats) {
            try {
                if ((cat.isInCafe()) && (cat.getBreed().equals(breed))) {
                    System.out.println(cat.getName() + " " + cat.getSex() + " " + cat.getBreed());
                }
            } catch (NullPointerException ex) {
                ex.getMessage();
            }
        }
    }
}