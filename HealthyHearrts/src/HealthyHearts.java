import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int age = 0;
        int max = 0;

        try {

            System.out.println("Please enter your age");

           age =  sc.nextInt();
           max = 220 - age;

        }catch (Exception e){

            System.out.println(e);

        }

        System.out.printf("Your maximum heart rate should be %d \n" , max);
        System.out.printf("Your target heart rate zone should be %d - %d" ,(int)(.5*max),(int)(.85*max) );


    }
}
