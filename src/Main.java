import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbę");
        int x = scanner.nextInt();
        System.out.println("podaj jaka operacje chcesz wykonać (+,-,*,/)");
        String znak = scanner.next();
        System.out.println("podaj drugą liczbę");
        int y = scanner.nextInt();

        switch (znak){
            case "+":
                System.out.println(calculator.add(x,y));
                break;
            case "-":
                System.out.println(calculator.sub(x,y));
                break;
            case"*":
                System.out.println(calculator.mult(x,y));
                break;
            case"/":
                System.out.println(calculator.div(x,y));
                    break;
        }
    }

}
