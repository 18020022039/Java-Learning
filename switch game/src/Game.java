import java.util.Scanner;
import java.util.Random;


public class Game {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int choice;
		int randomNumber;
		String[] s = {"石头", "剪刀", "布"};
		while(true) {
			System.out.println("""
					1. 石头
					2. 剪刀
					3. 布
					请选择："""
			);
			choice = scanner.nextInt();
			if (choice < 1 || choice > 3) break;
			randomNumber = random.nextInt(3) + 1;
			switch (choice - randomNumber) {
			case 0 -> System.out.printf("我也出%s，平手！\n", s[randomNumber - 1]);
			case -1, 2 -> System.out.printf("我出%s，你赢了！\n", s[randomNumber - 1]);
			case 1, -2 -> System.out.printf("我出%s，你输了！\n", s[randomNumber - 1]);
			default -> System.out.println("出错了！");
			}
		}
	}
}
