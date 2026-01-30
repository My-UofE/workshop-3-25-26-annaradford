// Add your code below
public class DemoIncrement {
    public static void main(String[] args) {
        // Demonstration of the increment operator
        int a = 3;
        int b = a++ + 5;
        int x = 3;
        int y = ++x + 5;
        int p = 3;
        ++p;
        int q = p + 5; 
        int r = 3;
        r++;

        System.out.print("a: " + a);
        System.out.print(", b: " + b);
        System.out.print(", x: " + x);
        System.out.print(", y: " + y);
        System.out.print(", p: " + p);
        System.out.print(", q: " + q);
        System.out.println(", r: " + r);

        // Replace the xxxxx in the following with the correct term
        System.out.println("i++ means i is returned and then increment by 1");
        System.out.println("++i means i is increment by 1 then returned ");
    }
}
// prediction a = 4, b = 8 , x = 4, y = 9, p = 4, q = 9, r = 4

