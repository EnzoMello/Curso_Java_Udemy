// converter data-hora para texto

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program2 {
    public static void main(String[] args){
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formato padrão
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // formato padrão com horas
        // with zone = específica qual horário pegar e ZoneId.systemDefault() = Pega horário da máquina
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        LocalDate n04 = LocalDate.parse("2022-07-20");
        LocalDateTime n05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant n06 = Instant.parse("2022-07-20T01:30:26Z");

        System.out.println("d04 = " + n04.format(fmt1)); // .format para escolher o tipo de formatação que eu quero
        System.out.println("d04 = " + fmt1.format(n04));
        System.out.println("d04 = " + n04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = " + n05.format(fmt1));
        System.out.println("d05 = " + n05.format(fmt2));
        System.out.println("d05 = " + n05.format(fmt4));

        System.out.println("d06 = " + fmt3.format(n06));
        System.out.println("d06 = " + fmt5.format(n06));
    }
}
