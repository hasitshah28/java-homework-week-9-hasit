package Programme_1_Calculate;

public class Calculator {
    public void addition(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
    }

    public void subtraction(int a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + " is " + (a - b));
    }

    public void division(int a, int b) {
        System.out.println("Divison of " + a + " and " + b + " is " + (a / b));
    }

    public void multiplication(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
    }
    public void calculateResult(int a, int b, char Symbol){
        if (Symbol == '+'){
            addition(a,b);
        } else if (Symbol == '-'){
            subtraction(a, b);
        } else if(Symbol == '*'){
            multiplication(a, b);
        } else if (Symbol == '/') {
            try {
                division(a, b);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Number can not divide by 0 ");
            }
        } else {
            System.out.println("Invalid Input ");
        }
    }

}
