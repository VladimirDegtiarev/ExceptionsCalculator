public class MyException extends Exception {

    @Override
    public String getMessage() {
        String myMessage = "MyException (собственный класс)\n\n";
        return myMessage;
    }
}
