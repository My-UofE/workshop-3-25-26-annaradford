import java.util.Scanner;

public class PrintPattern1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        String size = in.nextLine();
        int total = 0;

        for (int i = 0; i < Integer.parseInt(size); i++){
            total = total * 10 + (i+1);
            System.out.println(total);
        }
    }
}