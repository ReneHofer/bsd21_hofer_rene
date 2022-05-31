package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author rhren
 * Class that allows the user to carry out different arithmetic operations.
 */
public class Calculator {
        private static double result;
        private static double number1= 10;
        private static double number2= 2;

        /**
         * @param number1 first number that is used for an addition.
         * @param number2 second number that is used for an addition.
         * @return the sum of number1 and number2.
         */
        public static double add(double number1, double number2){
                result= number1+number2;
                System.out.println(result);
                return result;
        }
        /**
         * @param number1 first number that is used for a subtraction.
         * @param number2 second number that is used for a subtraction.
         * @return the difference between number1 and number2.
         */
        public static double minus(double number1, double number2){
                result = number1-number2;
                System.out.println(result);
                return result;
        }
        /**
         * @throws ArithmeticException if number2 ==0.
         * @param number1 first number that is used for a division.
         * @param number2 second number that is used for a division.
         * @return the quotient of number1 divided by number2.
         */
        public static double divide(double number1, double number2) throws ArithmeticException{
                try {
                        result = number1 / number2;
                        System.out.println(result);
                } catch (ArithmeticException e) {
                        System.out.println("Divisions by Zero are not possible!");
                }

                return result;
        }
        /**
         * @param number1 first number that is used for a multiplication.
         * @param number2 second number that is used for a multiplication.
         * @return the product of number1 multiplied by number2.
         */
        public static double multiply(double number1, double number2){
                result = number1*number2;
                System.out.println(result);
                return result;
        }

        /**
         * calculates the factorial of the number that is passed as a parameter.
         * @param number1 integer value that the factorial will be calculated of.
         * @return the factorial of number1.
         */
        public static long factorial(int number1){
                long result =1;
                if (number1 <= 0){
                        return 0;
                }
                else {
                for (int i = 2; i <= number1; i++) {
                        result = result * i;
                }
                }
                return result;
        }

        private static final Logger logger = LogManager.getLogger("Fileappender");

        /**
         * Entrypoint into the implementation of Calculator Class.
         */
        public static void main(String[] args){


                logger.info("info");
                logger.error("error");



               add(number1, number2);
               minus(number1,number2);
               divide(number1,number2);
               multiply(number1,number2);
               factorial(5);
        }
}
