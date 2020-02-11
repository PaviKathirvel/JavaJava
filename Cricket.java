import java.util.*;
import java.io.*;

public class Cricket{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);						//scanner to prompt the user for input
		System.out.print("INPUT : ");
		String input = scan.nextLine();								//stores the input
		char input_array[] = input.toCharArray();					//converts the input string into character array
		System.out.println();
		int score = 0;										
		int wickets = 0;
		int extras = 0;
		int ball = 0;
		int wrong_input = 0;
		int players[] = new int[12];								//array to store the individual's runs
		int strike = 1;												//player on strike
		int previous_out = 0;										//player who was the last out
		int opposite = 2;											//player on opposite strike
		
		for(int i=0;i<input_array.length;i++){						//traveres through the string or character array
			
			if(ball>5 && ball%6 == 0){
				int current = strike;
				strike = opposite;
				opposite = current;
			}														//changes the strike after each over
			
			if(input_array[i] == 'W' || input_array[i] == 'w'){
				wickets++;
				ball++;
				if(previous_out < opposite){
					previous_out=strike;
					if(strike > opposite){
						strike = strike+1;
					}
					else{
						strike = opposite+1;
					}
				}
				else{
					previous_out=strike;
					strike = previous_out+1;
				}
			}														//changes the strike after a wicket
			else if(input_array[i] == 'E' || input_array[i] == 'e'){
				extras++;
				score++;
			}														//counts for extras
			else if(input_array[i] == '.'){
				ball++;
			}														
			else if(input_array[i] == '1' || input_array[i] == '2' || input_array[i] == '3' || input_array[i] == '4' || input_array[i] == '6'){
				ball++;
				score = score+Character.getNumericValue(input_array[i]);
				int run = Character.getNumericValue(input_array[i]);
				players[strike] = players[strike] + run;
				if(input_array[i] == '1' || input_array[i] == '3'){
					int present_player = strike;
					strike = opposite;
					opposite = present_player;
				}
				else{
					strike = strike;
					opposite = opposite;
				}
			}														//changes the strike after each run and counts the runs for individual player
			else{
				System.out.println("Wrong Input");
				wrong_input = 1;
				break;
			}														//when there is a wrong input
			
		}
		if(wrong_input != 1){
			System.out.println("\n\t\tSCORE TABLE\n");
			System.out.println("Score	:	"+score);
			System.out.println("Wickets :	"+wickets);
			System.out.println("Extras  :	"+extras);
			System.out.println("Balls	:	"+ball);
			System.out.println("Overs	:	"+ball/6+"."+ball%6);
			System.out.println("Strike  :	"+strike);
			System.out.println("Opposite:	"+opposite);
			for(int player = 1;player<players.length;player++){
				System.out.println("player"+player+" :"+players[player]);
			}
			
		}
		
	}
}