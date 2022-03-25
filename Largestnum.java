public class Largestnum {
    public static void main(String[] args) {
        byte max=0, min=127;
        byte[] arr = {8,1, 5, 7, 4, 9, 4, 7, 2, 8, 10};
        for (byte i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println("max is "+max+" and min is "+min);
    }
}
