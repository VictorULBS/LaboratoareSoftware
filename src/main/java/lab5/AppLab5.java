package lab5;

public class AppLab5 {
    public static void main(String[] args) {
        IntCalculator calculator = new IntCalculator(9);
        int result = calculator.add(7).subtract(5).multiply(6).result();
        //(9 + 2) * 6 = 66
        System.out.println(result);

        AdvancedCalculator advancedCalculator = new AdvancedCalculator(9);
        result = advancedCalculator.pow(2).divide(3).root(2).result();
        // 81 / 3 = 27;  $27 ~ 5
        System.out.println(result);


    }
}
