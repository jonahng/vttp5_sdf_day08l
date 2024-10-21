package project01am;
import project01am.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
import java.io.*;

import project01am.day08.Product;

public class App {
    public static void main(String[] args) throws IOException{
        List<Product> Catalogue = new ArrayList<>();
        Date currentDate = new Date();


        Product Mouse = new Product(10000,"Mouse","clicking on computer","Computer",99.0f,currentDate);
        Catalogue.add(Mouse);
        Product Iphone = new Product(20000,"Iphone 16", "smartphone", "Mobile", 1200.0f, currentDate);
        Catalogue.add(Iphone);
        Product Monitor = new Product(30001, "16 INCH Monitor", "display panel", "Computer", 157.5f, currentDate);
        Catalogue.add(Monitor);

        Catalogue.add(new Product(40001,"Iphone 16 Pro", "Fancy Iphone", "Mobile", 2000.0f, currentDate));





        /* instructor code:
        filteredProducs = products.steam().filter(p -> p.getProdCategory.equals("mobile") && (p.getPrice() >1500.0f)).
        collect(Collectors.toList());
        filteredProducts.forEach(System.out::println); */

        File newFile = new File(args[0]);
        FileWriter newFileWriter = new FileWriter(newFile);
        BufferedWriter bw = new BufferedWriter(newFileWriter);

        List<Product> filteredProducts = new ArrayList<>();
        filteredProducts = Catalogue.stream()
        .filter(product -> product.getPrice() > 1000)
        .collect(Collectors.toList());


        newFileWriter.write("testing filewriter writing");

        Iterator<Product> iterator = filteredProducts.iterator();
        while (iterator.hasNext()) {
            bw.write(iterator.next().toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
        newFileWriter.close();

        newFileWriter.close();
        System.out.println("created file in your location" + args[0] + "and wrote to it");

        //using a comparator to perform sorting
        //remember to use a set instead of list to get a list with no repeats

        Comparator<Product> comparator = Comparator.comparing(Product::getProdName);
        Catalogue.sort(comparator);
        Catalogue.forEach(System.out::println);
        Catalogue.sort(comparator.reversed());//this is to sort in the opposite order

        //sort an array of strings nameArray = "Albert" "Ben" "Doug"
        //
        String arr[] = {"Amy", "Dane", "Fred", "Kingsey"};
        //Comparator<String> comparator2 = Comparator.comparing();
        Arrays.sort(arr);
        System.out.println("Ascending order" + arr.toString());



    }
    
}
