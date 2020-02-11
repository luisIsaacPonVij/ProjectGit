/*
pedir el numero del dni y dar la letra
 */
// author : luis isaac ponce vijil 
// 4/02/2020
package projectgit;

import java.util.Scanner;

public class ProjectGit {
// global declarations 

    static Scanner keyboard = new Scanner(System.in);
    String[] letters;
    
    int [] numbers;

    public static void main(String[] args) {
    //pregubtar dni
 int dni;
        // DNI();
        
        System.out.println("give me your dni");
       dni=keyboard.nextInt();
        char letter = DNIletter(dni);
        System.out.println(dni + " : " + letter);
  

    }

    //ahora deberemos de devolverle la letra 
    private static char DNIletter(int dni) {

     
    char letter='T';
       String letters =  "TRWAGMYFPDXBNJZSQVHLCKE";
     // numbers={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
     int res=dni%23;
      letter= letters.charAt (res);
      
      
      return letter;
    }

}
