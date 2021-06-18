import java.util.Scanner;
import java.util.Random;

public class RPS {

    public static void main(String[] args){

        initialScreen();

    }

    private static void initialScreen(){

         int rounds = 0;

         Scanner sc = new Scanner(System.in);

         try {

              System.out.println("Please enter the amount of round you want to play");

              rounds = sc.nextInt();

              if (rounds <= 0 || rounds >= 10) {

                  throw new Exception();

              }

         }catch (Exception e) {

             System.out.println("the range has to be 1-10");

             System.exit(0);

         }

         for(int i  = 0; i < rounds; i++ ){

             playround();

         }

         playAgain();

    }

    private static void playround(){

        Random rand = new Random();
        int roundWins = 0,computerWins = 0,roundTies = 0;
        int userChoice = getWeaponChoice();
        int computerChoice = rand.nextInt(3);

        if(userChoice == computerChoice ){

            roundTies++;

        }else if(userChoice == 1 && computerChoice == 3){

            roundWins++;

        }else if(userChoice == 2 && computerChoice == 1){

            roundWins++;

        }else if(userChoice == 3 && computerChoice == 2){

            roundWins++;

        }else{

            computerWins++;

        }

        System.out.printf("User wins: %d \n",roundWins);
        System.out.printf("Computer wins: %d \n",computerWins);
        System.out.printf("Rounds tied: %d \n",roundTies);

        if(roundWins > computerWins){

            System.out.println("Congratulations you won!");

        }else{

            System.out.println("Computer has won the game");

        }

    }

    private static int getWeaponChoice(){

        int choice = 0;
        Scanner sc = new Scanner(System.in);

        try{

            System.out.println("Please enter a choice between 1-3 (1 = Rock, 2 = Paper, 3 = Scissors)");

            choice = sc.nextInt();

            if(choice == 0 || choice >3){

               throw new IndexOutOfBoundsException();

            }

        }catch(Exception e){

            System.out.println("the range has to be 1-3");

        }

        return choice;

    }

    private static void playAgain(){

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Would you like to play again?");

            String choice = sc.nextLine().toLowerCase();

            if(choice.equals("y") || choice.equals("yes")){

                sc.close();

                initialScreen();

            }else {

                System.out.println("Thanks for playing!");

                sc.close();

                System.exit(0);
            }

        }catch (Exception e){

            System.out.println(e);

        }

    }

}
