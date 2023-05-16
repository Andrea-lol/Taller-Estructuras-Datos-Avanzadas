# 94. Binary Tree Inorder Traversal 💻

![Version 1.0](https://img.shields.io/badge/version-1.0.-blue.svg) 

## Descripción Y Contexto

Dada la raíz de un árbol binario, devuelve el recorrido en orden de los valores de sus nodos.

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
1 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/94.%20Binary%20Tree%20Inorder%20Traversal/img/1.png "Esta es una imagen de muestra.") | Se comienza por la raíz (valor 1) para luego dirigirse al lado izquierdo siguiendo el inorden|
2 | [Upload pdf file](#upload-pdf-file) | Luego de dirigirse al subárbol izquierdo se obtiene que este se encuentra vacío (null) |
3 | [Request a signature](#request-signature) |Por lo que se agrega el nodo raíz (1) a la pila y nos movemos al subárbol de la derecha, siguiendo el orden (inorden) |
4 | [Sign a document](#sign-document) | Se vuelve a dirigir al subárbol izquierdo del nodo (2) que se encuentra vacío (null) |
5 | [Generate pdf file](#generate-pdf-file) | Agregamos el nodo (2) a la pila y se dirige nodo de la derecha (3) |
6 | [List all signature requests approved](#list-signature-requests-approved) | Volvemos a dirigirnos tanto al lado izquierdo como el derecho del nodo (3) y ambos se encuentran vacios (null), por lo que agregamos el nodo (3) a la pila |
7 | [List all signature requests pending](#list-signature-requests-pending) | Como se ha llegado a un nodo sin hijo izquierdo ni derecho, se saca el nodo superior de la pila, que es el nodo (3), y lo agregamos a la lista de resultados |
8 | [List all of my pending signature requests](#list-pending-signature-requests) | Se saca el siguiente nodo de la pila, que es el nodo (2), y lo agregamos a la lista de resultados |
9 | [Signature history](#signature-history) | Se saca el siguiente nodo de la pila, que es el nodo 1, y lo agregamos a la lista de resultados. |
10 | [Logout](#logout) | Como se ha terminado de explorar el subárbol derecho del nodo (1) y la pila se encuentra vacía, hemos completado el recorrido inorder. Por lo que la lista de resultados quedaría [1, 3, 2] |


## LeetCode
**[94. Binary Tree Inorder Traversal]** de la **[LeetCode]**

[94. Binary Tree Inorder Traversal]: https://leetcode.com/problems/binary-tree-inorder-traversal/
[LeetCode]: https://leetcode.com
