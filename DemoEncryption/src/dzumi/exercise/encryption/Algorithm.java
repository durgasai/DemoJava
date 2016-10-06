package dzumi.exercise.encryption;

public class Algorithm {
	public static boolean isNguyenTo(int number){
		if(number == 0)
			return false;
		for(int i = 2; i <= (int) Math.sqrt(number); i++){
			if(number % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isDoiXung(int number){
		int temp = number;
		int doiXung = 0;
		while(temp != 0){
			doiXung = doiXung *10 + temp%10;
			temp/=10;
		}
		return doiXung == number;
	}
	
	public static boolean isNumberRelated(int number, int src){
		if(src == 0)
			return false;
		if(String.valueOf(number).contains(src+""))
			return true;
		return number % src == 0;
	}
	
	
}
