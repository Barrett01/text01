import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        "hello".equals("abc");
        ArrayList ls = new ArrayList();
        int[] arr = {10, 8 ,2 ,0, 66, 56, -8, 92};
        Arrays.sort(arr);
        Scanner my = new Scanner(System.in);
        ls.bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            System.out.print(arr[i] + "\t");
            //            System.out.print(arr[i]+"\t");
        }
        System.out.println("结束。。");

    }
}