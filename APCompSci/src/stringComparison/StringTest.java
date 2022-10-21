package stringComparison;

public class StringTest {

	public static void main(String[] args) {

		String s1 = "Potato Sands";
		String s2 = "Potato Sandwich";
		String s3 = "Potato";
		System.out.println(StringSet.getFirst(s1, s2, s3));
		System.out.println(StringSet.getSecond(s1, s2, s3));
		System.out.println(StringSet.getThird(s1, s2, s3));

	}

}
