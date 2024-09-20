class NewtonMethod1{
    public void run() {
        double xsub0 = 1.0; // Initial guess
        double tolerance = 1e-6;
        int max = 1000;
        double xsubn = xsub0;

        for (int i = 0; i < max; i++) {
            double fxsubn = f(xsubn);
            double fpxsubn = fp(xsubn);
            double xsubnext = xsubn - (fxsubn / fpxsubn);

            if (Math.abs(xsubnext - xsubn) < tolerance) {
                System.out.printf("Approximate root: %.6f%n", xsubnext);
                break;
            }
            xsubn = xsubnext;
        }
    }

    public static double f(double x) {
        return Math.pow(x, 3) - 2 * x - 2;
    }

    public static double fp(double x) {
        return 3 * Math.pow(x, 2) - 2;
    }
}
 class NewtonMethod2{
    public void run() {
        double xsub0 = 1.0; // Initial guess
        double tolerance = 1e-6;
        int max = 1000;
        double xsubn = xsub0;

        for (int i = 0; i < max; i++) {
            double fxsubn = f(xsubn);
            double fpxsubn = fp(xsubn);
            double xsubnext = xsubn - (fxsubn / fpxsubn);

            if (Math.abs(xsubnext - xsubn) < tolerance) {
                System.out.printf("Approximate root: %.6f%n", xsubnext);
                break;
            }
            xsubn = xsubnext;
        }
    }

    public static double f(double x) {
        return Math.exp(x) + x - 7;
    }

    public static double fp(double x) {
        return Math.exp(x) + 1;
    }
}

class NewtonMethod3{
    public void run() {
        double xsub0 = 1.0; // Initial guess
        double tolerance = 1e-6;
        int max = 1000;
        double xsubn = xsub0;

        for (int i = 0; i < max; i++) {
            double fxsubn = f(xsubn);
            double fpxsubn = fp(xsubn);
            double xsubnext = xsubn - (fxsubn / fpxsubn);

            if (Math.abs(xsubnext - xsubn) < tolerance) {
                System.out.printf("Approximate root: %.6f%n", xsubnext);
                break;
            }
            xsubn = xsubnext;
        }
    }

    public static double f(double x) {
        return Math.exp(x) + Math.sin(x) - 4;
    }

    public static double fp(double x) {
        return Math.exp(x) + Math.cos(x);
    }
}

public class main{
    public static void main(String[] args) {
        
    //writing this has made me wish we had math notation in programming    
    NewtonMethod1 first = new NewtonMethod1();
    NewtonMethod2 second = new NewtonMethod2();
    NewtonMethod3 third = new NewtonMethod3();
    
    first.run();
    second.run();
    third.run();
    }
}
