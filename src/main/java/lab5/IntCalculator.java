package lab5;

public class IntCalculator {
    int state;
    public IntCalculator(int state) {
        this.state = state;
    }

    public IntCalculator add(int a) {
        state = state + a;
        return this;
    }

    public IntCalculator subtract(int a) {
        state = state - a;
        return this;
    }

    public IntCalculator multiply(int a) {
        state = state * a;
        return this;
    }

    public int result(){
        return state;
    }

    public void clear(){
        state = 0;
    }
}
