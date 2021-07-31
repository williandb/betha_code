package ExercicioInterface;

public class FiguraGeometricaMain {
    public static void main(String[] args) {
        FiguraGeometrica quadrado = new Quadrado(10);
        System.out.println("Área do "+quadrado.getNomeFigura()+" = "+ quadrado.getArea());
        System.out.println("Perímetro do "+quadrado.getNomeFigura()+" = "+ quadrado.getPerimetro());

        FiguraGeometrica triangulo = new Triangulo(4, 6, 4, 6, 8);
        System.out.println("Área do "+triangulo.getNomeFigura()+" = "+ triangulo.getArea());
        System.out.println("Perímetro do "+triangulo.getNomeFigura()+" = "+ triangulo.getPerimetro());
    }
}
