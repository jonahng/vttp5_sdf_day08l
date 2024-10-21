package project01am.day08;
import java.security.KeyStore.Entry;
import java.util.*;
import java.util.stream.Collectors;


public class Mapping {
    //map<key,value>
    //the value can be another map as well
    //key is a string



    //Create Map objects
    //Sort the mao Objects
    public static void main(String[] args) {

        Map<String, Integer> mapObjectList = new HashMap<>();
        mapObjectList.put("James", 9);
        mapObjectList.put("kiley", 10);
        mapObjectList.put("quaff", 10);

        mapObjectList.forEach((k,v)) -> System.out.println(k + "-->" + v);
        List<Entry<String, Integer>> mapList = new ArrayList<>();
        mapList.sort(Entry.comparingByKey());
        mapList.forEach(System.out::println);

        mapObjectList.entrySet().stream().sorted(Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getkey, Map.Entry::getValue);

    }





    
}
