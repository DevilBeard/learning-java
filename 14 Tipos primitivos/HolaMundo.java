public class HolaMundo {
    public static void main(String[] args) {
        /*
            tipos primitivos
        */
        byte numeroByte = (byte) 129;
        System.out.println(numeroByte);
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor máximo byte: " + Byte.MAX_VALUE);

        short numeroShort = (short) 32769;
        System.out.println(numeroShort);
        System.out.println("valor minimo short: " + Short.MIN_VALUE);
        System.out.println("valor máximo short: " + Short.MAX_VALUE);

        int numeroInt = (int) 2147483648L;
        System.out.println(numeroInt);
        System.out.println("valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("valor máximo int: " + Integer.MAX_VALUE);

        long numeroLong = (long) 9223372036854775807L;
        System.out.println(numeroLong);
        System.out.println("valor minimo long: " + Long.MIN_VALUE);
        System.out.println("valor máximo long: " + Long.MAX_VALUE);
    }
}
