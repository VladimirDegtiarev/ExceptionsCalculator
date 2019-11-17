public class OperatorException extends MyException {

    @Override
    public String getMessage() {
        String myMessage = "OperatorException: Математический оператор не соответствует символам / + - x\n\n";
        return myMessage;
    }
}
