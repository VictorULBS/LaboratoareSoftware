package lab5.advanced;

public class Lab5Adv {
    public static void main(String[] args) {
        NewIntCalculator intCalculator = new NewIntCalculator(10);
        DoubleCalculator doubleCalculator = new DoubleCalculator(10.0d);

        Object res1 = intCalculator.add(5).subtract(3).multiply(2).result();
        Object res2 = doubleCalculator.add(5d).subtract(3.3d).multiply(2.2d).result();
        System.out.println(res1);
        System.out.println(res2);
    }
}
