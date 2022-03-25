import java.util.Arrays;

public class MissingNumArray {
    public static void main(String[] args){
        byte temp = 1;
        byte [] arr = {1,5,7,4,9,2,8,10};
        Arrays.sort(arr);
        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] == temp)
                temp++;

            else {
                System.out.println("The missing number is " + temp);
                temp += 2;
            }
        }
    }
}
