import java.util.Scanner;
public class SpaceRace {
    // Program type: GAME
    // Overview: The system genarates random numbers from 1-6 for each player and adds to previous round number until one player reaches 100.
    //           After each round the user is asked if they'd like to continue.
    //           If user chooses to end the game before 100 - the player with the highest score is declared the winner.
    //           Once a player reaches 100 the game ends and a winning message is displayed.
    //           If the user ends the game while tied - the system displays a tie message.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\t   ***SPACE RACE***");
        System.out.println("Which Player Can Reach Outter Space First?");
        // Displays game title and header
        
        System.out.println();
        // for aesthetics
        
        int p1Score = 0;
        int p2Score = 0;
        int finalScore = 100;
        int rnd = 1;
        
        while (p1Score <= finalScore || p2Score <= finalScore){
            System.out.println(" ---------");
            System.out.println("| Round "+ rnd++ + " |");
            System.out.println(" ---------");
            //display current round
            
            int ranNum1 = (int) (Math.random()*6) + 1;
            //get random number for P1
            int ranNum2 = (int) (Math.random()*6) + 1;
            //get random number for P2
            
            p1Score = p1Score + ranNum1;
            //logic for player 1 score
            p2Score = p2Score + ranNum2;
            //logic for player 2 score
            
            System.out.println("Player 1: ~~~~ " + p1Score + " >");
            System.out.println("Player 2: ~~~~ " + p2Score + " >");
            //display current score of each player
           
            //logic to interpret answer 
            boolean yn;
            String answer;    
            while(true) {
                System.out.println("Would you like to continue? (y/n): ");
                answer = input.next();
                //collect user choice to continue (y/n)
                if (answer.equals("n")){
                //if user chooses NOT to continue, display who the winner is
                    yn = true;
                        if (p1Score > p2Score){
                        System.out.println("PLAYER 1 IS THE WINNER!!\nThey made it the farthest with a score of " + p1Score +" out of 100!");
                        //displays player 1 winner
                    return;}
                        else if (p2Score > p1Score){
                        System.out.println("PLAYER 2 IS THE WINNER!!\nThey made it the farthest with a score of " + p2Score +" out of 100!"); 
                        //displays player 2 winner
                    return;}
                        else if (p2Score == p1Score){
                        System.out.println("Both your spaceships have stalled!!\nThey made it the same distance with a score of " + p2Score +" out of 100!"); 
                        //displays when its a tie
                    return;}
                }else {
                    //if user chooses to continue then break out of while(true) loop and continue with next round
                    answer.equals("y");
                    yn = false;
                    break;
                    }    
            } 
            // calculating the winner of game
            if (p1Score == finalScore) {
            System.out.println();
	    System.out.println("PLAYER 1 WINS!!");
            //displays if player 1 is the winner
            return;}
            else if (p2Score == finalScore) {
            System.out.println();
	    System.out.println("PLAYER 2 WINS!!");
            //displays if player 2 is the winner
            return;}
        }
    }       
}
