package additon;
public class Main {
	public static void main(String[] args) {
		Numbers o = new Numbers();
		 Add ob = new Add() {
			public int addition(Numbers obj) {
				return obj.x+obj.y;
			}
		};
		System.out.println(ob.addition(o));
		
	}

}
