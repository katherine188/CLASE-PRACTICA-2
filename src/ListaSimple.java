public class ListaSimple {

    private Nodo cabeza;

    public void agregar(String dato) {

        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        Nodo actual = cabeza;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = nuevo;
    }

    public void mostrar() {

        Nodo actual = cabeza;

        while (actual != null) {
            System.out.print(actual.dato + " → ");
            actual = actual.siguiente;
        }

        System.out.println("null");
    }

    public void eliminarRepetidos() {

        Nodo actual = cabeza;

        while (actual != null) {

            Nodo anterior = actual;
            Nodo siguiente = actual.siguiente;

            while (siguiente != null) {

                if (actual.dato.equals(siguiente.dato)) {
                    anterior.siguiente = siguiente.siguiente;
                } else {
                    anterior = siguiente;
                }

                siguiente = siguiente.siguiente;
            }

            actual = actual.siguiente;
        }
    }

    public void rotarDerecha() {

        if (cabeza == null || cabeza.siguiente == null) {
            return;
        }

        Nodo anterior = null;
        Nodo ultimo = cabeza;

        while (ultimo.siguiente != null) {
            anterior = ultimo;
            ultimo = ultimo.siguiente;
        }

        anterior.siguiente = null;

        ultimo.siguiente = cabeza;
        cabeza = ultimo;
    }

    public void concatenar(ListaSimple otraLista) {

        if (otraLista == null || otraLista.cabeza == null) {
            return;
        }

        if (cabeza == null) {
            cabeza = otraLista.cabeza;
            return;
        }

        Nodo actual = cabeza;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = otraLista.cabeza;
    }


}
