package edu.danilotc.maratonajava.introducao.tiposprimitivos;

public class TiposPrimitivos01 {
    public static void main(String[] args) {
        // int, long, byte, short, double, float, char, boolean

        // tipos primitivos inteiros
        int numeroInt = 10;
        long numeroLong = 100000L;
        byte numeroByte = -128;
        short numeroShort = 10;

        // tipos primitivos reais (com casas decimais)
        double numeroDouble = 2000.0D;
        float numeroFloat = 2500.0F;

        // tipos primitivos lógicos
        boolean valorBooleanVerdadeiro = true;
        boolean valorBooleanFalso = false;

        // tipo primitivo caracter, aceita unicode ou ascii
        // unicode: '\u0041' para A
        // ascii: 87 para W, 65 para A
        char valorCharComCaracterUnico = '\u0041';

        System.out.println("numeroInt: "+numeroInt);
        System.out.println("numeroLong: "+numeroLong);
        System.out.println("numeroByte: "+numeroByte);
        System.out.println("numeroShort: "+numeroShort);
        System.out.println("numeroDouble: "+numeroDouble);
        System.out.println("numeroFloat: "+numeroFloat);
        System.out.println("valorBooleanVerdadeiro: "+valorBooleanVerdadeiro);
        System.out.println("valorBooleanFalso: "+valorBooleanFalso);
        System.out.println("valorCharComCaracterUnico: "+valorCharComCaracterUnico);
    }
}
