
import java.util.Scanner;

public class BMI {
	static double BMI;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your weight(kg): "); // 打印提示
        double weight = scanner.nextDouble(); // 读取一行输入并获取字符串
        System.out.print("Input your height(cm|m): "); // 打印提示
        double height = scanner.nextDouble(); // 读取一行输入并获取整数
        
        if(height == (int)height) {
        	BMI = weight / Math.pow(height / 100, 2);
        	System.out.printf("你的体重指数（BMI）为%.2f%n", BMI);
        	A();
        }
        if(height != (int)height) {
        	BMI = weight / Math.pow(height,2);
        	System.out.printf("你的体重指数（BMI）为%.2f%n", BMI);
        	A();
        }
        
    }
    
    private static void A(){
    	if( BMI < 18.5 ) {
    		System.out.println("您的体重过轻了");
    	}
    	else if( 25 >= BMI && BMI>= 18.5 ){
    		System.out.println("您的体重正常");
    	}
    	else if( 28 >= BMI && BMI>= 25 ) {
    		System.out.println("您的体重过重");
    	}
    	else if( 32 >= BMI && BMI>= 28 ) {
    		System.out.println("您的身体属于肥胖");
    	}
    	else if( BMI>= 32 ) {
    		System.out.println("您非常肥胖");
    	}
    	
    }
}