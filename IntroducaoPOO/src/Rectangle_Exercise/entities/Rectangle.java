package Rectangle_Exercise.entities;

public class Rectangle {
    // CRIANDO AS VARIÁVEIS BASE
    public double width;
    public double height;

    // CRIANDO AS FUNÇÕES
    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2 * width + 2 * height;
    }

    public double diagonal(){
        return Math.sqrt(width * width + height * height);

    }
}
