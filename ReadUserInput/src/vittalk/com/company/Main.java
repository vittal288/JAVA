package vittalk.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Date Of Birth");
        if(scanner.hasNextInt()){
            int yearOfBirth = scanner.nextInt();
            int age = 2018 - yearOfBirth;

            scanner.nextLine();//to handle next line character ("Enter key")

            System.out.println("Enter Your Name !!!");
            String name = scanner.nextLine();

            if( age > 0 && age <= 100){
                System.out.println("Your Name is "+ name +" and you are "+ age+" years old");
            }else{
                System.out.println("Invalid Year of birth");
            }
        }else{
            System.out.println("Invalid Year of birth");
        }

        scanner.close();
    }
}
