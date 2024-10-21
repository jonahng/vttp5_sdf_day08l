package mastermindGame;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//computer generates a number with 4 digits, with each digit between 1-6, use random function
//use console to ask for 4 digit user input
//can check for input legitness
//check if input digit at each position using charAt(index)


public class Mastermind {
    public static void main(String[] args) {

    String computerKey = "2345";
    List<String> hintStatus = new ArrayList<>(Arrays.asList("0","0","0","0"));
    String userInput = "";
    Console console = System.console();

    while(!userInput.equals("logoff")){
        userInput = console.readLine("type in your 4 numbers e.g 1234");
    
        for(int i = 0; i < 4; i++){

    
            for(int k = 0; k < 4; k++){
                if(userInput.charAt(i) ==computerKey.charAt(k)){
                    hintStatus.set(k, "C");
                }
    
    
            }
            if(userInput.charAt(i)==computerKey.charAt(i)){
                hintStatus.set(i, "CP");
                }
    
        }
        System.out.println(hintStatus);
        hintStatus = Arrays.asList("0","0","0","0");

    }
    
        
    }
    

}
