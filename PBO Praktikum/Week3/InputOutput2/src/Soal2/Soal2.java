package Soal2;

import java.util.*;
public class Soal2 {
    public static void main(String[] args){
    	Scanner keyboard = new Scanner(System.in);
        String line1,line2,line3;
        line1 = keyboard.nextLine();
        line2 = keyboard.nextLine();
        line3 = keyboard.nextLine();
        String [] value1 = line1.split(" ");
        String [] value2 = line2.split(" ");
        String [] value3 = line3.split(" ");
        System.out.println("================================");
        System.out.println(String.format("%-15s", value1[0]).toLowerCase() + String.format("%3s", value1[1]).replace(" ", "0"));
        System.out.println(String.format("%-15s", value2[0]).toLowerCase() + String.format("%3s", value2[1]).replace(" ", "0"));
        System.out.println(String.format("%-15s", value3[0]).toLowerCase() + String.format("%3s", value3[1]).replace(" ", "0"));
        System.out.println("================================");            
    }
}
