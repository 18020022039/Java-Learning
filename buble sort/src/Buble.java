import java.util.Arrays;

public class Buble {
	public static void main(String[] args) {
		int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		//排序前
		System.out.println(Arrays.toString(ns));
		for (int i=0; i<ns.length-1; i++) {    // 排序轮次
			for (int j=0; j<ns.length-1-i; j++) {    // 每轮次将最大的数送到最后，所以只需要遍历前len-i个数
				if (ns[j] > ns[j+1]) {    //如果前面的更大，就交换到后一位，这样可以把最大值送到当前轮次最后面
					int temp = ns[j];
					ns[j] = ns[j+1];
					ns[j+1] = temp;
				}
			}
		}
		//排序后
		System.out.println(Arrays.toString(ns));
	}
}
