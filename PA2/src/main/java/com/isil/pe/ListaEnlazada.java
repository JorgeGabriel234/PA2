package com.isil.pe;


public class ListaEnlazada {

    private Nodo inicio;

    // 1. Recorrido completo de la lista
    public void recorrer() {
        Nodo actual = inicio;

        while (actual != null) {
            System.out.println(actual.herramienta);
            actual = actual.siguiente;
        }
    }

    // 2. Insercion al inicio
    public void insertarInicio(String herramienta) {
        Nodo nuevo = new Nodo(herramienta);

        nuevo.siguiente = inicio;
        inicio = nuevo;
    }

    // 3. Insercion al final
    public void insertarFinal(String herramienta) {
        Nodo nuevo = new Nodo(herramienta);

        if (inicio == null) {
            inicio = nuevo;
            return;
        }

        Nodo actual = inicio;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = nuevo;
    }

    // 4. Insercion despues de un nodo dado
    public void insertarDespues(String referencia,
                                String herramienta) {
        Nodo actual = inicio;

        while (actual != null &&
                !actual.herramienta.equals(referencia)) {
            actual = actual.siguiente;
        }

        if (actual == null) {
            System.out.println("Herramienta no encontrada.");
            return;
        }

        Nodo nuevo = new Nodo(herramienta);

        nuevo.siguiente = actual.siguiente;
        actual.siguiente = nuevo;
    }


    // 5. Busqueda de una herramienta
    public Nodo buscar(String herramienta) {
        Nodo actual = inicio;

        while (actual != null) {
            if (actual.herramienta.equals(herramienta)) {
                return actual;
            }

            actual = actual.siguiente;
        }

        return null;
    }

    // 6. Modificacion de una herramienta
    public boolean modificar(String herramientaActual,
                             String nuevaHerramienta) {
        Nodo encontrado = buscar(herramientaActual);

        if (encontrado != null) {
            encontrado.herramienta = nuevaHerramienta;
            return true;
        }

        return false;
    }

    // 7. Eliminacion de una herramienta
    public boolean eliminar(String herramienta) {
        if (inicio == null) {
            return false;
        }

        // Eliminar el primer nodo
        if (inicio.herramienta.equals(herramienta)) {
            inicio = inicio.siguiente;
            return true;
        }

        Nodo actual = inicio;

        while (actual.siguiente != null) {
            if (actual.siguiente.herramienta.equals(herramienta)) {
                actual.siguiente = actual.siguiente.siguiente;
                return true;
            }

            actual = actual.siguiente;
        }

        return false;
    }

}

