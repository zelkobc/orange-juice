package orange.juice;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import orange.juice.beans.*;


public class Application {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setUsername("dicks");
		String returner = user1.getUsername();
		System.out.println(user1);
		System.out.println("say something im giving up on you");
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLine());
		sc.close();
		Scanner sc2 = new Scanner(System.in);
		}
	}

