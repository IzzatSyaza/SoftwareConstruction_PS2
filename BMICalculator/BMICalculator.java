import java.text.DecimalFormat;
import java.util.Scanner;

public class BMICalculator {
    
    public void init1(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in kilogram(kg): " );
        double weight = input.nextDouble();

        System.out.println("Enter height in centimeter(cm): " );
        double height = input.nextDouble();
        input.close();
        // double bmi = weight / (Math.pow(height/100, 2));

        // DecimalFormat dformat = new DecimalFormat("0.00");
        // System.out.println("Your BMI is: "+ dformat.format(bmi));
        calcBMI(weight, height);

    }

    

    

    public double calcBMI (double weight, double height){
        //precondition
        assert weight > 0: "Weight must be more than 0kg";
        assert height > 0: "Height must be more than 0cm";

        double bmi = 0;
            bmi = weight / (Math.pow(height/100, 2));
            DecimalFormat dformat = new DecimalFormat("0.00");
            System.out.println("Your BMI is: "+ dformat.format(bmi));

            //postcondition
            assert bmi > 0: "BMI index must be more than 0";
        return bmi;
    }
    
    
    public void init2(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your BMI index: " );
        double bmiindex = input.nextDouble();
        input.close();
        // double bmi = weight / (Math.pow(height/100, 2));

        // DecimalFormat dformat = new DecimalFormat("0.00");
        // System.out.println("Your BMI is: "+ dformat.format(bmi));
        BMIcategory(bmiindex);

    }

    public double BMIcategory (double bmi){
        //precondition
        assert bmi > 0: "BMI Index must be more than 0";

        String category= "";

        if(bmi< 18.5){
            category = "Underweight";
        }
        else if(bmi>= 18.5 && bmi<= 24.9){
            category = "Normal Weight";
        }
        else if(bmi>= 25 && bmi<= 29.9){
            category = "Overweight";
        }
        else if(bmi> 30){
            category = "Obesity";
        }
        
        System.out.println("Your BMI category is "+ category);
        //postcondion
        assert !category.equals(""): "BMI Index must be more than 0" ;
        return bmi;
    }
}