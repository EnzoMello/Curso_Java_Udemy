// Instanciando data-hora

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args){
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formato padrão
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // formato padrão com horas

        LocalDate n01 = LocalDate.now(); // Data de agora na máquina
        LocalDateTime n02 = LocalDateTime.now(); // Data e horas de agora na máquina
        Instant n03 = Instant.now(); // Data-Hora global

        LocalDate n04 = LocalDate.parse("2022-07-20"); // converte texto para data
        LocalDateTime n05 = LocalDateTime.parse("2022-07-20T01:30:26"); // converte texto com hora para data
        Instant n06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant n07 = Instant.parse("2022-07-20T01:30:26-03:00");

        LocalDate n08 = LocalDate.parse("20/07/2022", fmt1); // Usa os formatos que passei antes
        LocalDateTime n09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate n10 = LocalDate.of(2022, 07, 20);
        LocalDateTime n11 = LocalDateTime.of(2022, 07, 20, 1, 30);

        System.out.println("n01 = " + n01.toString());
        System.out.println("n02 = " + n02.toString());
        System.out.println("n03 = " + n03.toString());
        System.out.println("n04 = " + n04.toString());
        System.out.println("n05 = " + n05.toString());
        System.out.println("n06 = " + n06.toString());
        System.out.println("n07 = " + n07.toString());
        System.out.println("n08 = " + n08.toString());
        System.out.println("n09 = " + n09.toString());
        System.out.println("n10 = " + n10.toString());
        System.out.println("n11 = " + n11.toString());

    }
}
