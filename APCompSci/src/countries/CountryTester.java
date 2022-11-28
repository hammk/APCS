package countries;
    
public class CountryTester {
  public static void main(String[] args) {

    String[] names = {"Australia", "Canada", "China", "France", "Haiti", "India",
                         "Jamaica", "Mexico", "United Kingdom", "United States"};
    
    double[] internetUsage = {86.55, 91, 54.3, 82.04, 32.47, 34.45, 55.07, 65.77, 94.9, 87.27};

    Countries countriesData = new Countries(names, internetUsage);

    for(int index = 0; index <= names.length - 1; index++) {
        System.out.println("Countries: " + countriesData.getNames(index));
        System.out.println("Percent Using the Internet: " + countriesData.getData(index) + "\n");
    }

    System.out.println(countriesData.printData("% using the Internet"));
    
  }
}