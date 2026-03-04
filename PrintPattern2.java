import java.util.Scanner;

public class PrintPattern2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String total = "";
        String temp = "";
        String ones = "";
        boolean input_validity = false;
        System.out.print("Enter the size: ");
        String size = in.nextLine();

        while (input_validity == false){
            if (Integer.parseInt(size) < 1){
                System.out.println("too small!");
                System.out.print("Enter the size: ");
                size = in.nextLine();
            }
            else if (Integer.parseInt(size) > 5){
                System.out.println("too big!");
                System.out.print("Enter the size: ");
                size = in.nextLine();
            }
            else{
                input_validity = true;
            }
        }

        for (int i = 0; i < Integer.parseInt(size); i++){
            total += Integer.toString(i+1);
            temp += Integer.toString(Integer.parseInt(size)-i);
            ones += "11";
        }
        total += temp;
        boolean max_point = false;
        System.out.println(total);
        for (int i = 1; i < Integer.parseInt(size)*2-1; i++){
            int values = Integer.parseInt(total);
            if (max_point == true){
                values -= Integer.parseInt(ones);
                total = Integer.toString(values);
                System.out.println(values); 
            }
            else {
                values += Integer.parseInt(ones);
                total = Integer.toString(values);
                System.out.println(values); 
            }
            if (total.charAt(0) == size.charAt(0)){
                max_point = true;
                System.out.println(values);
            }
        }
        
    }
}