public class Project1 {
    public static void main(String[] args) {
        // Overloaded Methods :: Methods that share the same name with different Parameters
        int a = 5;
        int b = 6;
        int c = 7;
        System.out.printf(add(a, b) + "%d", a);
    } v
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c) {
        return a+b+c;
    }
}
