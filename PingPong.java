import java.io.Console;

public class PingPong{
	public static void main(String[] args){
    Console myConsole = System.console();
    System.out.println("Give me a number.");
    Integer myNumber = Integer.parseInt(myConsole.readLine());

		for(Integer number = 1; number <= 100; number++){
			if(number % 15 == 0){
				System.out.println("Ping Pong");
			}else if(number % 3 == 0){
				System.out.println("Ping");
			}else if(number % 5 == 0){
				System.out.println("Pong");
			}else{
				System.out.println(number);
			}
		}
	}
}
