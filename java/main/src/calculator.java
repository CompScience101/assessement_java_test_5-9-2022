package main.src;

public class calculator {
	public static int calc (int cost){
		int first =  ((cost- 50) * 1);
	    int second = ((cost- 100) * 1);
		if(first < 0){//account for less than 50 dollars spent
			first = 0;
		}
		if(second < 0){//account for less than 100 dollars spent
			second = 0;
		}
		int total = first + second;
		System.out.println("rewarded client "+total+" total points");
		if (total >= 1){
			return total;
		}
		return 0;
	}
}
