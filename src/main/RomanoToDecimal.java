package main;

public class RomanoToDecimal {
	public int romanoDecimal(String roman){
		int suma = 0;
		for(int i = 0; i<roman.length();i++){
			if(i > 0 && charToRoman(roman.charAt(i-1)) < charToRoman(roman.charAt(i))){
				suma-=2*charToRoman(roman.charAt(i-1));
			}
			suma+=charToRoman(roman.charAt(i));				
				
		}
		return suma;
	}
	
	public int charToRoman(char a){
		if(a == 'I'){
			return 1;
		}else if(a == 'V'){
			return 5;
		}else if(a == 'X'){
			return 10;
		}else if(a == 'L'){
			return 50;
		}else if(a == 'C'){
			return 100;
		}else if(a == 'D'){
			return 500;
		}else if(a == 'M'){
			return 1000;
		}
		
		return -1;
	}
	
}
