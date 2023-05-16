# 94. Binary Tree Inorder Traversal 💻

![Version 1.0](https://img.shields.io/badge/version-1.0.-blue.svg) 

## Descripción Y Contexto

Dada la raíz de un árbol binario, devuelve el recorrido en orden de los valores de sus nodos.

El código proporcionado busca resolver el problema de recorrer un árbol binario en orden inorder y obtener una lista con los valores de los nodos visitados. El algoritmo utilizado en el código es una solución iterativa que utiliza una pila (stack) para llevar un seguimiento de los nodos visitados. Comienza en la raíz del árbol y explora de manera iterativa los nodos en el siguiente orden: primero el subárbol izquierdo, luego el nodo actual y finalmente el subárbol derecho. Este proceso se repite hasta que se han visitado todos los nodos del árbol. Al finalizar, se devuelve la lista de valores inorder, que representa el recorrido en orden ascendente de los valores de los nodos.

## Restricciones ⚠️	

* El número de nodos en el árbol está en el rango ```bash
        [0, 100].```

*  ```bash -100 <= Node.val <= 100 ```

## Ejemplo 1️⃣

![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/94.%20Binary%20Tree%20Inorder%20Traversal/img/1.png "Esta es una imagen de muestra.")

Ejemplo 1:

```bash
    $ Input: root = [1,null,2,3]
    $ Output: [1,3,2]
```

### Explicación 

En este ejemplo se muestra cómo el algoritmo recorre el árbol en inorden (izquierdo, raíz, derecho), visitando los nodos en el siguiente orden: 1, 3, 2. La pila tiene como objetivo mantener un seguimiento de los nodos visitados y la lista de resultados se va construyendo a medida que se visitan los nodos en el orden correcto.

En la siguiente tabla se describe los pasos que se realizan:

Paso | Imagen | Descripción
:--: | :--: | -- |
1 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/94.%20Binary%20Tree%20Inorder%20Traversal/img/Paso1.png "Esta es una imagen de muestra.") | Se comienza por la raíz (valor 1) para luego dirigirse al lado izquierdo siguiendo el inorden|
2 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/94.%20Binary%20Tree%20Inorder%20Traversal/img/Paso2.png "Esta es una imagen de muestra.") | Luego de dirigirse al subárbol izquierdo se obtiene que este se encuentra vacío (null) |
3 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/94.%20Binary%20Tree%20Inorder%20Traversal/img/Paso3.png "Esta es una imagen de muestra.") | Por lo que se agrega el nodo raíz (1) a la pila y nos movemos al subárbol de la derecha, siguiendo el orden (inorden) |
4 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/94.%20Binary%20Tree%20Inorder%20Traversal/img/Paso4.png "Esta es una imagen de muestra.") |Se vuelve a dirigir al subárbol izquierdo del nodo (2) en donde se encuentra el nodo 3, como tanto el lado izquierdo como derecho del nodo 3 se encunetran vacios (null) se agrega (nodo 3) a la pila y se dirige al nodo de la derecha al nodo (2) |
5 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/94.%20Binary%20Tree%20Inorder%20Traversal/img/Paso5.png "Esta es una imagen de muestra.") | El lado derecho del nodo 2 se encuentra vacío (null) por lo que se agrega a la pila |
6 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/94.%20Binary%20Tree%20Inorder%20Traversal/img/Paso6.png "Esta es una imagen de muestra.") | Como se ha llegado a un nodo sin hijo izquierdo ni derecho, se saca el nodo superior de la pila, que es el nodo (2), y lo agregamos a la lista de resultados |
7 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/94.%20Binary%20Tree%20Inorder%20Traversal/img/Paso7.png "Esta es una imagen de muestra.") | Se saca el siguiente nodo de la pila, que es el nodo (3), y lo agregamos a la lista de resultados |
8 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/94.%20Binary%20Tree%20Inorder%20Traversal/img/Paso8.png "Esta es una imagen de muestra.") | Se saca el siguiente nodo de la pila, que es el nodo 1, y lo agregamos a la lista de resultados. |
9 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/94.%20Binary%20Tree%20Inorder%20Traversal/img/Paso9.png "Esta es una imagen de muestra.") | Como se ha terminado de explorar el subárbol derecho del nodo (1) y la pila se encuentra vacía, hemos completado el recorrido inorder. Por lo que la lista de resultados quedaría [1, 3, 2] |


## LeetCode
**[94. Binary Tree Inorder Traversal]** de la **[LeetCode]**

[94. Binary Tree Inorder Traversal]: https://leetcode.com/problems/binary-tree-inorder-traversal/
[LeetCode]: https://leetcode.com
