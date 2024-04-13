import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PoemTester2 {
    public static void main(String[] args) {


        try{
            Scanner scan = new Scanner(new FileReader("src/poem2.txt"));
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

//        try{
//            BufferedReader br = new BufferedReader(new FileReader("poem2.txt"));
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }


    }
}
