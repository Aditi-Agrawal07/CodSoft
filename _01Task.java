import java.util.*;

import javax.sound.sampled.SourceDataLine;
import javax.swing.SpringLayout;
class _01Task{
    public static void main(String[] args) {
       
        int min = 0;
        int max = 100;
  int random_number = (int)(Math.round(Math.random()*(max-min+1)+min));
        System.out.println(random_number);
     int chance = 0;
     do{
       
  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gussed number: ");
        int user = sc.nextInt();
        if(random_number == user){
            System.out.println("you guessed correct number");
           
           break;
        }
        else if(user > random_number/2){
            System.out.println("Guess is correct too high");
            chance++;
        }
        else if (user < random_number/2){
            System.out.println("Guess number is too low");
            chance++;
        }
    } 
    while(chance <3);
     


    }
    
}

