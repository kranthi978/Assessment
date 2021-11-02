package student;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
         Scanner myObj = new Scanner(System.in);
         
         StudentInterface ui = new StudentInterface(myObj);
         ui.start();
         

    }

}
