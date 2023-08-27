/*
Design and implement a class called Bulb that represents a light bulb that can be turned on and off.  
This class needs to have methods for turning the bulb on and off, and checking the bulb is on or off.  (4 Points)

Programmed By Michael Bacu
8/27/2023
U300 
*/

import java.util.Scanner;


class Bulb {
    public static void main(String[] args){  
      
      Scanner myObj = new Scanner(System.in);
      
      while (true){
            System.out.println("Turn the lightbulb on? Y/N");

            String status = myObj.nextLine();
            String text = "empty";
            if(status.equals("Y")){
              text = "on";
            }else if(status.equals("N")){
               text = "off";
            }
            
            System.out.println("The bulb is " + text);

      }
      
            
    }
}
    
    