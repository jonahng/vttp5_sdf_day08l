package project02am;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Permutations {
    //take digits/alphabets from console input using args[0]
    //number of permutations = 
    public static void main(String[] args){
        
    String string = "";
    if(args.length ==0){
        string = "ABCD";
    }else{
        string = args[0];
    }

    HashSet<String> permutations = new HashSet<>();
    List<Character> characters = new ArrayList<>(); 
    for(char c: string.toCharArray()){
        characters.add(c);
    }
    System.out.println(characters);

    for(int i=0; i<1000; i++){
    Collections.shuffle(characters);
    StringBuilder shuffledString = new StringBuilder();
    for(char c: characters){
        shuffledString.append(c);
        
    }

    permutations.add(shuffledString.toString());

    }

    System.out.println(permutations);
    System.out.println("Total unique variations = " + permutations.size());


    



    }
    




    
}
