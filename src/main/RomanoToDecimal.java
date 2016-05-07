package main;

public class RomanoToDecimal {
	public int romanoDecimal(String roman){
		int suma = 0;
		for(int i = 0; i<roman.length();i++){
			if(roman.charAt(i) == 'I'){
				suma+=1;
			}
			if(roman.charAt(i) == 'V'){
				if(i > 0 && roman.charAt(i-1) == 'I'){
					suma-=2;
					suma+=5;
				}else{
					suma+=5;
				}
				
			}
		}
		return suma;
	}
	
}
