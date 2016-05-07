package main;

public class RomanoToDecimal {
	public int romanoDecimal(String roman){
		int suma = 0;
		for(int i = 0; i<roman.length();i++){
			if(roman.charAt(i) == 'I'){
				suma+=1;
			}
		}
		return suma;
	}
	
}
