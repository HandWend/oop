package objectex;

public class HouseDog extends Dog {
	void sleep() {
		System.out.println(this.name + " zzz in the house");
		
	}
	
	void sleep(int hour) {
		System.out.println(this.name + " zzz in the house " + hour + "hours");
	}
}
