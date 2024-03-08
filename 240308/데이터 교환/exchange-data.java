public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int tempA;
        int tempB;
        int tempC;
        tempA = a;
        tempB = b;
        tempC = c;
        b = tempA;
        c = tempB;
        a = tempC;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}