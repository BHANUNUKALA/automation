package oopspack;
public class inher_2 extends Inher_1 {
	private String bike="r_15";
	public static void main(String[] args) {
		inher_2 mybike=new inher_2();
		
		System.out.println(mybike.brand+" "+mybike.bike);
		mybike.speed();
	}
}