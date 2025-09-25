package mx.quality.santander.calculadora.home.Operaciones;

public class Division {
	
	public double division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return (double) a / b;
    }

}
