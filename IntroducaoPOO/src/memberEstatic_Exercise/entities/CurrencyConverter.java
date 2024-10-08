package memberEstatic_Exercise.entities;

public class CurrencyConverter {
    public static final double IOF = 6.0;

    public static double converter(double dolar, double quantidade){
        double valorConvertido = dolar * quantidade;
        return valorConvertido += valorConvertido * IOF/100;

    }

}
