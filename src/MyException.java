public class MyException extends Exception {

    public MyException() {
        super();
    }

    public void printMessage(){
        System.err.println("Cat already at home");
    }

}