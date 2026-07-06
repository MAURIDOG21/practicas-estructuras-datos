import java.util.LinkedList;
import java.util.Queue;

public class ColaEjemplo {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        // offer/add: agregar elementos a la cola
        cola.offer(1);
        cola.offer(2);
        cola.offer(3);

        System.out.println("Cola actual: " + cola);

        // peek: ver el primer elemento sin sacarlo
        System.out.println("Primer elemento: " + cola.peek());

        // poll: sacar el primer elemento (el mas antiguo)
        int elementoSacado = cola.poll();
        System.out.println("Elemento sacado: " + elementoSacado);

        System.out.println("Cola despues del poll: " + cola);

        // isEmpty: verificar si esta vacia
        System.out.println("¿Esta vacia? " + cola.isEmpty());

        // size: cuantos elementos tiene
        System.out.println("Tamaño actual: " + cola.size());
    }
}