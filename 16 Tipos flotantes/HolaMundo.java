public class HolaMundo {
    public static void main(String[] args) {
        /*
            tipos de datos flotantes
        */
        float numeroFloat = (float) 3.4028236E38D;
        System.out.println(numeroFloat);
        System.out.println("Valor minimo: " + Float.MIN_VALUE);
        System.out.println("Valor máximo: " + Float.MAX_VALUE);

        double numeroDouble = (double) 1.7976931348623140E308D;
        System.out.println(numeroDouble);
        System.out.println("Valor minimo: " + Double.MIN_VALUE);
        System.out.println("Valor máximo: " + Double.MAX_VALUE);
    }
}
