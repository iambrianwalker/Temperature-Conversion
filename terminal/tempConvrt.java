import java.util.Scanner;

public class tempConvrt {
    // This code converts temperature from kelvins, celsius, and fahrenheit
    private static double fahrenheit(double n, char t) {
        double result = 0;
        if (t == 'K') {
            result = (n - 273.15) * 1.8 + 32;
        } else if (t == 'C') {
            result = (n * 9.0/5.0) + 32;
        } else {
            System.out.println("Sorry. Not valid.");
        }
        return result;
    }

    private static double celsius(double n, char t) {
        double result = 0;
        if (t == 'F') {
            result = (n - 32) * 5.0/9.0;
        } else if (t == 'K') {
            result = n - 273.15;
        } else {
            System.out.println("Sorry. Not valid.");
        }
        return result;
    }

    private static double kelvins(double n, char t) {
        double result = 0;
        if (t == 'F') {
            result = (n - 32) * 5.0/9.0 + 273.15;
        } else if (t == 'C') {
            result = n + 273.15;
        } else {
            System.out.println("Sorry. Not valid");
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        System.out.println("What is the temperature? ");
        double temper = input.nextDouble();
        System.out.print("What temperature type is it? (F,K,C) \nTemperature: " + temper + " ");
        char temp = input.next().charAt(0);

        switch (temp) {
            case 'F':
                System.out.println("What are we converting " + temper + " " + temp + " to? ");
                char convert = input.next().charAt(0);
                if (convert == 'C') {
                    System.out.println("Converted temperature: " + celsius(temper, temp));
                } else if (convert == 'K') {
                    System.out.println("Converted temperature: " + kelvins(temper, temp));
                } else {
                    System.out.println("Sorry, this is not valid.");
                }
                break;
            case 'K':
                System.out.println("What are we converting " + temper + " " + temp + " to? ");
                convert = input.next().charAt(0);
                if (convert == 'C') {
                    System.out.println("Converted temperature: " + celsius(temper, temp));
                } else if (convert == 'F') {
                    System.out.println("Converted temperature: " + fahrenheit(temper, temp));
                } else {
                    System.out.println("Sorry, this is not valid.");
                }
                break;
            case 'C':
                System.out.println("What are we converting " + temper + " " + temp + " to? ");
                convert = input.next().charAt(0);
                if (convert == 'F') {
                    System.out.println("Converted temperature: " + fahrenheit(temper, temp));
                } else if (convert == 'K') {
                    System.out.println("Converted temperature: " + kelvins(temper, temp));
                } else {
                    System.out.println("Sorry, this is not valid.");
                }
                break;
            default:
                System.out.println("Maybe next time -_-");
        }
        input.close();
    }
}
