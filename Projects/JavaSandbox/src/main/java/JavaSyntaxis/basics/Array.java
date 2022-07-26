package JavaSyntaxis.Basics;

public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        int[] myArray2 = new int[]{1, 2, 3, 4};
        int[] myArray3 = {1, 2, 3, 4};

        int[] myArray4 = new int[5];
        myArray4[0] = 1;
        myArray4[1] = myArray4[2] = myArray4[3] = myArray4[4] = myArray4[0];

        int[] myArray5 = new int[10];
        for (int i = 0; i < myArray5.length; i++) {
            myArray5[i] = i;
        }

        for (int i : myArray5) {
            myArray5[i] = i;
        }
    }
}
