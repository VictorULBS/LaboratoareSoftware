package lab5.advanced;

public class NewIntCalculator extends ACalculator{
    @Override
    public void init() {
        this.state = null;
    }

    public NewIntCalculator(int state){
        init();
        this.state = state;
    }

    public NewIntCalculator add(Integer a){
        state = a + (Integer) state;
        return this;
    }

    public NewIntCalculator multiply(Integer a){
        state = a * (Integer) state;
        return this;
    }

    public NewIntCalculator subtract(Integer a){
        state = (Integer) state - a;
        return this;
    }
}
