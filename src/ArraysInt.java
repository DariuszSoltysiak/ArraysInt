import java.util.Scanner;

public class ArraysInt {
    public static void main(String[] args) {
        boolean find = false;
        int[] arr = {15, -2, 304, 4844, -2255, 66, -777};

        System.out.println("Pass number");
        Scanner scan = new Scanner(System.in);
        int seek = scan.nextInt();


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == seek) {
                find = true;
                break;
            }
        }
        if (find) {
            System.out.println("Number has been found");
        } else {
            System.out.println("Number hasn`t been found, plese try again");
        }
    }
}

