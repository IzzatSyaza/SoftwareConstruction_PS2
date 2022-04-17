import java.util.Scanner;

public class login {
    public static void main(String[] args) throws Exception{


        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME to BMICALCULATOR ");
        System.out.println("****************************");
        System.out.println("Enter username :");
        
        String nama = input.next();

        if(nama.equals("izzat"))
        {
            System.out.println("Enter password : ");
            String pass = input.next();

            if(pass.equals("1234"))
            {   //postcondition
                System.out.println("Access Granted!!");
            }
            else
            {//precondition
                assert false : "invalid password";
            }

        }else{
            //postcondition
            assert false : "invalid user";
        }
        
    }
}
