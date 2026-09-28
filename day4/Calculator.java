class Calculator {

    // Reference variables
    int num1 = 20;
    int num2 = 10;

    // Method 1
    // Non-parameterized | Non-return type
    void addnumbers() {
        int tot = num1 + num2;
        System.out.println("add: " + tot);
    }

    // Method 2
    // Parameterized | Non-return type
    void subnumbers(int a, int b) {
        int sub = a - b;
        System.out.println("sub: " + sub);
    }

    // Method 3
    // Non-parameterized | Return type
    int divnumbers() {
        int divd = num1 / num2;
        return divd;
    }

    // a = b+divnumbers()
    // divnumbers()=divd

    // Method 4
    // Parameterized | Return type
    int mulnumbers(int a) {
        int mul = num1 * a;
        System.out.println("mul: " + mul);
        return mul;
    }
}