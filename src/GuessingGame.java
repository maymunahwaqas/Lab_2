public class GuessingGame {
    public static void main(String[] arg){
        int secretNumber = 7;
                int guess = 3;
                        if (guess == secretNumber) {
                            System.out.println("Correct!");
                        }
                            else if (guess > secretNumber) {
                                System.out.println("too high");
                            }
                            else if (guess < secretNumber) {
                                System.out.println("too low");
                        }

                        }
    }

