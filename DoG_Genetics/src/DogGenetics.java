import java.util.Scanner;
import java.util.Random;

public class DogGenetics {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        String petname = "";

        String[] randomdogs = {"St. Bernard","Chihuahua","Dramatic Red Nose Asian Pug","Common Cur","King Doberman"};

        int maxPercent = 100;

        int currentPercent;

        try {

            System.out.println("What is your dogs name");

            petname = sc.nextLine();

        }catch (Exception e){

            System.out.println(e);

        }

        System.out.println("Well then, I have this highly reliable report on " + petname + "'s prestigious background right here.\n");

        System.out.println(petname + " is: \n");

        for(String x : randomdogs){

            if(x.equals("King Doberman")){

                currentPercent = maxPercent;

            }else {

                currentPercent = rand.nextInt(maxPercent);

                maxPercent -= currentPercent;

            }

            System.out.println(currentPercent + "% " + x);

        }

    }

}


