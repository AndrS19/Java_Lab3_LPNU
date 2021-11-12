package Task4;

import java.lang.*;

    class A1 extends Thread {
        int i,j;
        A1(final int x, final int y) {
            i=x;
            j=y;
        }
        public void run()
        {
            System.out.println("THREAD A:: ARITHMETIC OPERATIONS");
            System.out.println("SUM = "+(i+j));
            System.out.println("SUBTRACTION = "+(i-j));
            System.out.println("MULTIPLICATION = "+(i*j));
            System.out.println("DIVISION = "+(i/j));
            System.out.println("POWER = "+Math.pow(i,j));
            System.out.println("END OF A");
    }
}
    class B1 extends Thread {
        double i;
        B1(final double x) {
            i=x;
        }
        public void run() {
            System.out.println("THREAD B:: TRIGONOMETRIC OPERATIONS");
            System.out.println("SINUS: "+i+""+Math.sin(i));
            System.out.println("COSINE: "+i+""+Math.cos(i));
            System.out.println("TAN: "+i+""+Math.tan(i));
            System.out.println("SQUARE ROOT OF: "+i+""+Math.sqrt(i));
            System.out.println("END OF B");
    }
}