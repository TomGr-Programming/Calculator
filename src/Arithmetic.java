public class Arithmetic {
    public double addition(double x, double y) {
        return x + y;
    }

    public double subtraction(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double division(double x, double y) {
        if(y == 0.0) {
            return 0;
        } else {
            return x / y;
        }
    }
}
