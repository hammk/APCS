package countries;

/** 
 * Fix by 
 * @author humzahkha0143
 */

public class Countries {
  
  private String[] names;
  private double[] data;

  public Countries(String[] names, double[] data) {
    this.names = names;
    this.data = data;
  }

  public String[] getNames(int index) {
    return names[index];
  }

  public double[] getData(int index) {
    return data;
  }

  public String printData(String message) {
    String result = "";
    int index = 0;

    while (index <= names.length - 1) {
      result += names[index] + ": " + data[index] + message + "\n";

      index += 1;
    }

    return result;
  }
}