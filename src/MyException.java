public class MyException extends Exception{

    protected String mess;

    public MyException(String message) {
        this.mess=message;
        //initCause(e);
    }

    public void printMessage() {
        System.err.println(mess);
    }
}