import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME to BMICALCULATOR ");
        System.out.println("****************************");
        System.out.println("Please select an option");
        System.out.println("1. Calculate BMI.");
        System.out.println("2. Determine BMI category.");
        System.out.println("Please enter a number to select option =>");


        BMICalculator bmi = new BMICalculator();
        // bmi.init();

        int x = input.nextInt();
        switch(x) {
            case 1:
            bmi.init1();
              break;
            case 2:
            bmi.init2();
              break;
            default:
            System.out.println("LOGOUT");
          }
        
        
    }


}
