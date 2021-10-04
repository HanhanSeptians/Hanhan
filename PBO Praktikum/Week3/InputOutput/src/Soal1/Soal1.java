package Soal1;

import java.util.*;

public class Soal1 {
    public static void main(String[] args){
    	Scanner keyboard = new Scanner(System.in);
    	String userInput;
    	userInput= keyboard.nextLine();
    	String[] temp = userInput.split("\\ |!|,|\\?|\\.|\\_|\\@|'");
    	System.out.println(temp.length);
    	int i;
    	for(i=0;i<=temp.length-1;i++) {
    		System.out.println(temp[i]);
    	}
    	
    }
} 
