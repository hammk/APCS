package timeTester;

public class TTester {

	public static void main(String[] args) {

		Time tm = new Time();                  // no arguments, should return defaults.
		System.out.println(tm.getHours());
		System.out.println(tm.getMinutes());
		System.out.println(tm.getSeconds());
		System.out.println(tm.toString());
		
		Time tm2 = new Time(23, 62, 71);       // with arguments
		System.out.println(tm2.getHours());
		System.out.println(tm2.getMinutes());
		System.out.println(tm2.getSeconds());
		System.out.println(tm2.toString() + "\n");
		
		int hr = 7;
		int mn = 6;
		int sc = 5;
		
		tm.setHours(hr);
		System.out.println(tm.getHours());
		tm.setMinutes(mn);
		System.out.println(tm.getMinutes());
		tm.setSeconds(sc);
		System.out.println(tm.getSeconds());
		System.out.println(tm.toString());

	}

}
