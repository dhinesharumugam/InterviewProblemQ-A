import java.io.*;

public class Vowel_checking {
	
	static void VowelCheck(char y) {
		if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u') 
			System.out.println("it is a Vowel");
			
			else 
				System.out.println("its not a vowel");
	}
		
		public static void main(String[] args){
			VowelCheck('n');
			VowelCheck('i');

			
		}
		
}

