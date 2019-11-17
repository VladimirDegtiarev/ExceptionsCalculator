
public class Calculator extends Exception {
    private int res  = 0;

    public Calculator() {}

    public void calculation (int num1, int num2, String symbol) {

        switch (symbol) {
            case ("\\+"):
                this.res = num1 + num2;
                System.out.printf("Результат сложения %d и %d равен: %d \n\n", num1, num2, this.res);
                break;
            case ("-") :
                this.res = num1 - num2;
                System.out.printf("Результат вычитания %d из %d равен: %d \n\n", num2, num1, this.res);
                break;
            case ("x") :
                this.res = num1 * num2;
                System.out.printf("Результат умножения %d на %d равен: %d \n\n", num1, num2, this.res);
                break;
            case ("/") :
                this.res = num1 / num2;
                System.out.printf("Результат деления %d на %d равен: %d \n\n", num1, num2, this.res);
                break;
        }

    }

    public void calcChecker (String newString) throws OperatorException {
        String calcOperator = null;

            if (newString.contains("/")) { calcOperator = "/"; }
       else if (newString.contains("+")) { calcOperator = "\\+"; }
       else if (newString.contains("x")) { calcOperator = "x"; }
       else if (newString.contains("-")) { calcOperator = "-"; }
       else {throw new OperatorException();}

        String [] stringArray = newString.split(calcOperator);
        int num1 = Integer.parseInt(stringArray[0]);
        int num2 = Integer.parseInt(stringArray[1]);

        calculation(num1, num2, calcOperator);

    }

}
