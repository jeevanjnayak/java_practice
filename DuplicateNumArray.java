
public class DuplicateNumArray {
    public static void main(String[] args) {
        byte[] arr = {1, 5, 7, 4, 9, 4, 7, 2, 8, 10};
        for (byte i = 0; i < arr.length; i++) {
            for (byte j = 1; j < arr.length - 1; j++) {
                if (i != j) {
                    if (arr[i] == arr[j])
                        System.out.println(arr[i] + " is the duplicate number");
                }
            }
        }
    }
}
