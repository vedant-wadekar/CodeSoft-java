import java.util.Scanner; //package to take input
import java.util.Random; // pakage to generate random integer

public class Task1 {
    public static void main(String args[]) {
               System.out.println("Hello World !");
        System.out.println("Welcome to the world of guessing numbers");
        // 
        do {
             Random rando = new Random();
            Scanner sc = new Scanner(System.in);
            int rand = rando.nextInt(100) + 1; // to take input in between 1 to 100
            System.out.println(rando);
            int guess = 0, attempt = 1; //initalization
            // System.out.println(rand);


            System.out.println("Want to play(Y/N): "); 
            String ans = sc.nextLine();
            if (ans.equals("Y") || ans.equals("y") || ans.equals("yes") || ans.equals("YES")) {   // to take a String as a condition
                System.out.println("Let's play");
                 
                do {
                    System.out.print("Enter your number(1 to 100): ");

                    if (sc.hasNextInt()) {  //to check weather the input is integer or not
                        guess = sc.nextInt();
                        // sc.nextLine();
                        if(guess < 1 || guess > 100){
                            System.out.print(" Error: Please Enter in between 1 and 100: ");
                        }
                        System.out.println("You entered: " + guess);
                        if (guess < rand) {
                            System.out.println("Too small");
                        } else if (guess > rand) {
                            System.out.println("Too big");
                        } else if (rand == guess) {
                            System.out.println("Congrats you entered the correct Number in " + attempt + " attempts");
                            break;
                        }
                    } else {
                        sc.nextLine(); //to take the empty line in above statements
                        System.out.println("Error `Invalid integer input!");
                        break;
                    }
                    attempt++;

                } while (rand != guess);
            }

            else if (ans.equals("N") || ans.equals("n") || ans.equals("no") || ans.equals("NO")) {
                break;      // exists the whole code
            } else{
                
                System.out.println("Ek kay te sang !");
                // sc.nextLine(); //to take the empty line in above statements
            }

        } while (true);

    }
}