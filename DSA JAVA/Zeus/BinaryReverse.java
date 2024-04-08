package Zeus;

public class BinaryReverse {
    public static void main(String[] args) {
        int input1 = 1;
        int input2 = 3;

        System.out.println("Input: " + input1 + " (" + formatBinary(input1) + "), Output: " + binaryReverse(input1)
                + " (" + formatBinary(binaryReverse(input1)) + ")");
        System.out.println("Input: " + input2 + " (" + formatBinary(input2) + "), Output: " + binaryReverse(input2)
                + " (" + formatBinary(binaryReverse(input2)) + ")");
    }

    public static int binaryReverse(int num) {
        int result = 0;

        for (int i = 0; i < 8; i++) {
            int bit = (num >> i) & 1;
            result |= bit << (7 - i);
        }

        return result;
    }

    public static String formatBinary(int num) {
        String binary = Integer.toBinaryString(num);
        return String.format("%8s", binary).replace(' ', '0');
    }
}
