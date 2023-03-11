import java.util.Scanner;
import java.util.logging.*;

public class task4 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(test.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler ();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter ();
        ch.setFormatter(sFormat);
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Num1:");
            double num1 = scan.nextDouble();
            logger.log(Level.INFO, "Num1Enter");
            System.out.println("Num2:");

            double num2 = scan.nextDouble();            
            logger.log(Level.INFO, "Num2Enter");
            System.out.println("Operation (+, -, *, /):");
            char operator = scan.next().charAt(0);
            logger.log(Level.INFO, "OpEnter");
            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    logger.log(Level.INFO, "sumOfNum1Num2");
                    break;
                case '-':
                    result = num1 - num2;
                    logger.log(Level.INFO, "difOfNum1Num2");
                    break;
                case '*':
                    result = num1 * num2;
                    logger.log(Level.INFO, "mulOfNum1Num2");
                    break;
                case '/':
                    result = num1 / num2;
                    logger.log(Level.INFO, "divOfNum1Num2");
                    break;
                default:
                    System.out.println("Ошибка! Неверный оператор.");
                    logger.log(Level.INFO, "error");
                    return;
            }
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}
