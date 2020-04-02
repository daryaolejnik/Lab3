import static java.lang.Math.*;

public class FirstSol implements Function {
    private final Function a;
    private final Function b;

    public FirstSol(Function a, Function b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return 17.5*pow(tan(a.calculate(x)),2) - (b.calculate(x)/pow(sin(a.calculate(x)/b.calculate(x)),2));
    }

    @Override
    public double derivative(double x) {
        return a.derivative(x);
    }

   /* @Override
    public SomeFunction derivative() {
        return new SomeFunction(a.derivative(), b.derivative());
    }*/
}
