import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class _02Task {
    public static void main(String[] args) throws IOException {
      FileInputStream file = new FileInputStream("input.txt");
      BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
   String user = reader.readLine();
       
         
        int count = 0;
        String[] newString = user.split(" ");
        for(int i = 0 ; i <= newString.length- 1;i++){
  count++;
        }
        System.out.println(count);
    }
    
}
