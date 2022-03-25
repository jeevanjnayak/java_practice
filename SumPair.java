public class SumPair {
    public static void main(String[] args) {
        byte[] arr = {1, 5, 7, 4, 9, 3, 2, 8, 10};
        System.out.println("the pairs that adds to 11 are: \n");
        for (byte i = 0; i < arr.length; i++) {
            for (byte j = 1; j < arr.length - 1; j++)
                if (arr[i] + arr[j] == 11)
                    System.out.print(arr[i]+" and " +arr[j]+", ");

        }
        System.out.println();
    }
}
