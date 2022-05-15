package at.campus02.bsd;

public class Calculator {
        private static double result;
        private static double number1= 10;
        private static double number2= 2;


        public static double add(double number1, double number2){
                result= number1+number2;
                System.out.println(result);
                return result;
        }
        public static double minus(double number1, double number2){
                result = number1-number2;
                System.out.println(result);
                return result;
        }
        public static double divide(double number1, double number2){
                result = number1/number2;
                System.out.println(result);
                return result;
        }
        public static double multiply(double number1, double number2){
                result = number1*number2;
                System.out.println(result);
                return result;
        }

        public static void main(String[] args){
               add(number1, number2);
               minus(number1,number2);
               divide(number1,number2);
               multiply(number1,number2);
        }
}
