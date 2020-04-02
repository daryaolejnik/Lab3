import static java.lang.Math.*;

public class FirstFunc implements Function {
    public final double param;

    public FirstFunc(double param) {
        this.param = param;
    }

    @Override
    public double calculate(double x) {
        return param * x;
    }

    @Override
    public double derivative(double x) {
        return param*(2*pow(tan(x),2)+2)*tan(x)+(param*cos(x/5)/pow(sin(x/5),3));
    }

}
