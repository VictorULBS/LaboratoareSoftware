package lab5;

public class AdvancedCalculator extends IntCalculator {
    public AdvancedCalculator(int state) {
        super(state);
    }

    public AdvancedCalculator divide(int a) {
        state = state / a;
        return this;
    }

    public AdvancedCalculator pow(int a) {
        state = (int) Math.pow(state, a);
        return this;
    }

    public AdvancedCalculator root(int a) {
        state = (int) Math.pow(state, (double) 1/a);
        return this;
    }
}
