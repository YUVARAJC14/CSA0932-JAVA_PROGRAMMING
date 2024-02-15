public class BinaryToCoolDecimal {
    public static void main(String[] args) {
        String binaryString = "101";
        int decimalValue = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char digit = binaryString.charAt(i);
            if (digit == '1') {
                decimalValue += (int) Math.pow(2, i);
            }
        }
        System.out.println( binaryString + " in decimal is " + decimalValue);
    }
}
