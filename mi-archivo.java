public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo desde Java!");
        saludar("nombre");
        sumar(5, 3);
    }
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + ". ¡Bienvenida al ejercicio de Git y GitHub!");
    }
    public static void sumar(int a, int b) {
        int resultado = a + b;
        System.out.println("La suma de " + a + " + " + b + " es: " + resultado);
    }
}

//Debido a la diferencia de lenguaje entre el código que viene en la presentación (Java), 
// y el archivo que se pedía crear (Javascript), decidí cambiar el archivo a .java 
// para mantener la coherencia con el lenguaje del código proporcionado.