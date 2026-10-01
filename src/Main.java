public class Main {

    public static void main(String[] args) {

        // 1. Eliminar elementos repetidos

        ListaSimple lista1 = new ListaSimple();

        lista1.agregar("A");
        lista1.agregar("B");
        lista1.agregar("A");
        lista1.agregar("C");
        lista1.agregar("B");
        lista1.agregar("D");

        System.out.println("1. Eliminar repetidos");
        System.out.println("Lista original:");
        lista1.mostrar();

        lista1.eliminarRepetidos();

        System.out.println("Lista sin repetidos:");
        lista1.mostrar();


        // 2. Rotar una posición a la derecha

        ListaSimple lista2 = new ListaSimple();

        lista2.agregar("A");
        lista2.agregar("B");
        lista2.agregar("C");
        lista2.agregar("D");

        System.out.println("\n2. Rotar a la derecha");
        System.out.println("Lista original:");
        lista2.mostrar();

        lista2.rotarDerecha();

        System.out.println("Lista rotada:");
        lista2.mostrar();


        // 3. Concatenar dos listas

        ListaSimple lista3 = new ListaSimple();

        lista3.agregar("A");
        lista3.agregar("B");
        lista3.agregar("C");
        lista3.agregar("D");

        ListaSimple lista4 = new ListaSimple();

        lista4.agregar("E");
        lista4.agregar("F");
        lista4.agregar("G");
        lista4.agregar("H");

        System.out.println("\n3. Concatenar dos listas");
        System.out.println("Lista 1:");
        lista3.mostrar();

        System.out.println("Lista 2:");
        lista4.mostrar();

        lista3.concatenar(lista4);

        System.out.println("Listas concatenadas:");
        lista3.mostrar();
    }
}