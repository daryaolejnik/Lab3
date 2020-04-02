import static java.lang.Math.*;

public class SecondSol implements Function {
    final double e = 2.71;
    private final Function a;
    private final Function b;

    public SecondSol(Function a, Function b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return b.calculate(x) *pow(e,-sqrt(b.calculate(x)))*cos(17.5*a.calculate(x)/b.calculate(x));
    }

    @Override
    public double derivative(double x) {
        return a.derivative(x);
    }
}
