import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Books {


    public static void main(String[] args) {
        ArrayList<Integer> books = new ArrayList<>();
        int sum =0;
        try{
            Scanner scan = new Scanner(new File("src/books.csv"));
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                String [] x = line.split(",");
                int y = 0;

                for (int i =0; i < x.length; i++){

                    y = Integer.parseInt(x[i]);
                    books.add(y);
                    sum += y;
//                    System.out.println(sum);

                }
                System.out.println(Collections.min(books));
                System.out.println(Collections.max(books));
                System.out.println((double)sum/books.size());
                System.out.println(sum);
//                System.out.println(books);

//                System.out.println(Collections.);
//                System.out.println(line);
//                System.out.println(Arrays.toString(x));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("stats.txt"))){

            bw.write("The sum of the numbers is: " + sum);
            bw.write("\nThe lowest number is: " + Collections.min(books)+
                    "\nThe highest number is : " + Collections.max(books) +
                    "\nThe average of the numbers is : " + (double) sum/books.size());
        }catch(IOException e){
            e.printStackTrace();
        }



    }




}
