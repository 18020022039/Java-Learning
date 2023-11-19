
public class Pi {
	public static void main(String[] args){
		double pi = 0;
		for (int i=0; i<1000; i++) {
			double sym = Math.pow(-1, i);  //Math.pow属于double类,或者double sym = (i%2==0) ? 1 : -1;
			pi += sym * 4 / (i*2+1);
		}
		System.out.println(pi);
	}
}