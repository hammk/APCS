package countries;

/** 
 * Only condition is no method signature changes. 
 * Fixes by author
 * @author humzahkha0143
 */

public class Countries {
  
  private String[] names;
  private double[] data;

  public Countries(String[] names, double[] data) {
    this.names = names;
    this.data = data;
  }

  public String getNames(int i) {
      return names[i];
  }

  public double getData(int i) {
    return data[i];
  }

  public String printData(String message) {
    String result = "";

    for (int index = 0; index <= names.length - 1; index++) {
      result += names[index] + ": " + data[index] + message + "\n";
    }

    return result;
  }
}