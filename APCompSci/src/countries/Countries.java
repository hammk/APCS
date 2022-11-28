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

  public String[] getNames() {
      return names;
  }

  public double[] getData() {
    return data;
  }

  public String printData(String message) {
    String result = "";

    for (int index = 0; index <= names.length - 1; index++) {
      result += names[index] + ": " + data[index] + message + "\n";
    }

    return result;
  }
}