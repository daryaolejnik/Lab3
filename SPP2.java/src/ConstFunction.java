import java.util.List;

public class ConstFunction implements Function {
    private final double value;
    public static final ConstFunction ZERO = new ConstFunction(0);


    public ConstFunction(double value) {
        this.value = value;
    }

    @Override
    public double calculate(double x) {
        return value;
    }

    @Override
    public double derivative(double x) {
        return 0;
    }


}


