package project;

import java.text.SimpleDateFormat;
import java.util.Date;

public class projectttt {
	//static final int a = 256; 
	/*static char getMaxOccuringChar(String str) 
	{ 
		// Create array to keep the count of individual 
		// characters and initialize the array as 0 
		int[] aa = new int[256]; 
	
		// Construct character count array from the input 
		// string. 
		int len = str.length(); 
		for (int i=0; i<len; i++) {
			//System.out.println(aa[str.charAt(i)]+"befor");
			aa[str.charAt(i)]++;
			//System.out.println(aa[str.charAt(i)]+"after");
			}
		System.out.println(aa[str.charAt(0)]);
		System.out.println(aa[str.charAt(1)]);
		System.out.println(aa[str.charAt(2)]);
		int max = 0; // Initialize max count 
		char result = ' '; // Initialize result 
	
		// Traversing through the string and maintaining 
		// the count of each character 
		for (int i = 0; i < len; i++) { 
			//System.out.println(i+"i");
			System.out.println(max+"max"); 
			if (max < aa[str.charAt(i)]) { 
				max = aa[str.charAt(i)]; 
				System.out.println(max+"maxaftr"); 
				result = str.charAt(i);
              System.out.println(aa[str.charAt(i)]+"hjh");
            
            
			} 
		} 
	
		return result; */
//}
	public static void main(String[] args) 
	{ 
		long DateInLong= 1594512000;

		Date date = new Date(DateInLong*1000L);

		SimpleDateFormat simpledateformate= new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat f = new SimpleDateFormat("MMM");
	     SimpleDateFormat f1 = new SimpleDateFormat("dd");
		String DATE = simpledateformate.format(date);
		String f3=f1.format(date);
		String month=f.format(new Date());
					System.out.println(DATE);
					System.out.println(f3+"ghghg");
				}
		
	} 
