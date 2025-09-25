package mx.quality.santander.calculadora.home.Operaciones;

public class RaizCuadrada {
	
    public double raiz(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);    
    }

}