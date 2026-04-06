package lab5.advanced;

public class DoubleCalculator extends ACalculator{
    @Override
    public void init() {
        this.state = null;
    }

    public DoubleCalculator(Double state) {
        init();
        this.state = state;
    }

    public DoubleCalculator add(Double a){
        state = (Double) state + a;
        return this;
    }

    public DoubleCalculator subtract(Double a){
        state = (Double) state - a;
        return this;
    }

    public DoubleCalculator multiply(Double a){
        state = (Double) state * a;
        return this;
    }
}
