import static java.lang.Math.*;

public class SecFunc implements Function {
    final double e = 2.71;
    public final double k;

    public SecFunc(double k) {
        this.k = k;
    }

    @Override
    public double calculate(double x) {
        return k * x;
    }
    @Override
    public double derivative(double x) {
        return 17.5*sin(17.5*x/k)/pow(e,k);
    }
}
