package mastermindGame;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//computer generates a number with 4 digits, with each digit between 1-6, use random function
//use console to ask for 4 digit user input
//can check for input legitness
//check if input digit at each position using charAt(index)


public class Mastermind {
    public static void main(String[] args) {
    String computerKey = "";
    Random random = new Random();
    for(int i = 0; i<4;i++){
    int randDigit = random.nextInt(5) + 1;
    computerKey = computerKey + randDigit;
    }
    System.out.println("\n" + "\n");
    System.out.println("Just fyi, computer key is:" + computerKey);

    List<String> hintStatus = new ArrayList<>(Arrays.asList("0","0","0","0"));
    String userInput = "";
    Console console = System.console();

    while(!userInput.equals("logoff")){
        userInput = console.readLine("Type in your 4 numbers here:");
    
        for(int i = 0; i < 4; i++){

    
            for(int k = 0; k < 4; k++){
                if(userInput.charAt(i) ==computerKey.charAt(k)){
                    if(!hintStatus.get(k).equals("CP")){
                        hintStatus.set(k, "C");
                    }

                }
    
    
            }
            if(userInput.charAt(i)==computerKey.charAt(i)){
                hintStatus.set(i, "CP");
                }
    
        }
        System.out.println(hintStatus);
        
        int CCount = Collections.frequency(hintStatus, "C");
        int CPCount = Collections.frequency(hintStatus, "CP");
        System.out.println("CP: " + CPCount +"\n C: " + CCount);

        hintStatus = Arrays.asList("0","0","0","0");

    }
    
        
    }
    

}
