public class Calculadora {
    //metodo para sumar dos numeros
    public double suma(Numero a, Numero b) {
        return a.getValor() + b.getValor();
    }
    //metodo para restar dos numeros
    public double resta(Numero a, Numero b) {
        return a.getValor() - b.getValor();
    }
    //metodo para multiplicar dos numeros
    public double multiplicacion(Numero a, Numero b) {
        return a.getValor() * b.getValor();
    }
    //metodo para dividir dos numeros
    public double division(Numero a, Numero b) {
        if (b.getValor() == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a.getValor() / b.getValor();
    }
    //metodo para calcular la potencia de un numero
    public double potencia(Numero base, Numero exponente) {
        return Math.pow(base.getValor(), exponente.getValor());
    }
    //metodo para calcular la raiz cuadrada de un numero
    public double raizCuadrada(Numero a) {
        if (a.getValor() < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(a.getValor());
    }
}


