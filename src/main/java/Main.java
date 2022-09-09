public class Main {
    public static int binaryToDecimal(int binary) {
        String[] binElements = String.valueOf(binary).split("");
        int result = 0;
        int length = binElements.length;
        for (int i = 0; i < length; i++) {
            result += Integer.parseInt(binElements[i]) * Math.pow(2, length - 1 - i);
        }
        return result;
    }
}
