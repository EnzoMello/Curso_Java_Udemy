package Boletim_Exercise.application;

import Boletim_Exercise.entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.nome = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.nota());
        if (student.nota() < 60.0 ){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", student.notaFinal());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
