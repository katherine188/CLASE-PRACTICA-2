# Práctica 2 - Lista Simplemente Enlazada

## Descripción

Este proyecto implementa una lista simplemente enlazada utilizando Java.

La lista se construye mediante nodos enlazados, donde cada nodo almacena un dato y una referencia al siguiente nodo.

El proyecto desarrolla tres operaciones principales:

- Eliminar elementos repetidos.
- Rotar los elementos una posición hacia la derecha.
- Concatenar dos listas.

## Estructura del proyecto

El proyecto está compuesto por las siguientes clases:

- `Nodo.java`: representa cada nodo de la lista y contiene el dato y la referencia al siguiente nodo.
- `ListaSimple.java`: contiene la implementación de la lista y las operaciones solicitadas.
- `Main.java`: contiene las pruebas de las operaciones implementadas.

## Operaciones implementadas

### 1. Agregar elementos

Permite insertar nuevos elementos al final de la lista simplemente enlazada. 
Cada elemento se almacena dentro de un nuevo nodo que queda conectado al nodo anterior.

### 2. Mostrar la lista

Permite recorrer la lista desde el primer nodo hasta el último y mostrar en pantalla todos los elementos almacenados.

### 3. Eliminar elementos repetidos

Recorre la lista y compara los elementos para detectar aquellos que aparecen más de una vez. 
Cuando encuentra un elemento repetido, modifica los enlaces de los nodos para eliminarlo de la lista.

### 4. Rotar una posición hacia la derecha

Permite mover el último elemento de la lista hacia la primera posición.
Para realizarlo, se recorre la lista hasta encontrar el último nodo, se separa del final y se conecta delante del nodo que era la cabeza.

Ejemplo:

```text
Lista original:
A → B → C → D → null

Lista rotada:
D → A → B → C → null

### 5. Concatenar dos listas

Permite unir dos listas simplemente enlazadas.
Para realizarlo, se recorre la primera lista hasta encontrar su último nodo y se conecta ese nodo con la cabeza de la segunda lista.

Ejemplo:

Lista 1:
A → B → C → D → null

Lista 2:
E → F → G → H → null

Listas concatenadas:
A → B → C → D → E → F → G → H → null
