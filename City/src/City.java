
public class City {
	public static void main(String[] args) {
		City_ bj = new City_();
		bj.name = "Beijing";
		bj.latitude = 39.930;
		bj.longtitude = 116.401;
		System.out.println(bj.name);
		System.out.println("location:"+bj.latitude+","+bj.longtitude);
	}
}

class City_{
	public String name;
	public double latitude;
	public double longtitude;
}
