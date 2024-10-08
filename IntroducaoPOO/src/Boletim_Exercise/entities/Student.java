package Boletim_Exercise.entities;

public class Student {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double nota(){
        return nota1 + nota2 + nota3;

    }
    public double notaFinal(){
        if (nota() < 60.0){
            return  60.0 - nota();
        }
        else {
            return 0.0;
        }
    }
}
