package JavaSyntaxis;

public class PrimitiveTypes {
    public static void main(String[] args) {
        byte myByte = 0;       // 1 byte | -128...127
        short myShort = 0;     // 2 byte | -32,768...32,767
        int myInt = 0;         // 4 byte | -2*10^9...2*10^9
        long myLong = 0L;      // 8 Byte | -9*10^18...9*10^18

        float myFloat = .0f;   // 4 byte | -10^38...10^38
        double myDouble = .0d; // 8 byte | -10^308...10^308

        boolean myBoolean = false; // 1 byte | true, false

        char myChar = '\u0000'; // 2 byte | 0...65,536
    }
}
