import java.util.Stack;

public class PilaEjemplo {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        // push: agregar elementos a la pila
        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println("Pila actual: " + pila);

        // peek: ver el elemento de arriba sin sacarlo
        System.out.println("Elemento en el tope: " + pila.peek());

        // pop: sacar el elemento de arriba
        int elementoSacado = pila.pop();
        System.out.println("Elemento sacado: " + elementoSacado);

        System.out.println("Pila despues del pop: " + pila);

        // isEmpty: verificar si esta vacia
        System.out.println("¿Esta vacia? " + pila.isEmpty());

        // size: cuantos elementos tiene
        System.out.println("Tamaño actual: " + pila.size());
    }
}