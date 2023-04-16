import java.util.Scanner;

public class ArraysInt {
    public static void main(String[] args) {

        int[] arr = {15, -2, 304, 4844, -2255, 66, -777};


        for (int i = 0; i <= arr.length; i++) {

            System.out.println("Pass number");
            Scanner scan = new Scanner(System.in);
            int seek = scan.nextInt();

            if (seek == arr[i]) {
                System.out.println("Number has been found");
                break;
            } else {
                System.out.println("Number hasn`t been found, plese try again");
            }
        }
    }
}



