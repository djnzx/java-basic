package a.code.variables;

public class VariablesConvertApp {
  public static void main(String[] args) {
    byte b = (byte) 253;
    System.out.println(b);
    int i = Byte.toUnsignedInt(b);
    System.out.println(i);
  }
}
