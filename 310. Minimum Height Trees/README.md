# 310. Minimum Height Trees 💻

![Version 1.0](https://img.shields.io/badge/version-1.0.-blue.svg) 

## Descripción Y Contexto

Un árbol es un gráfico no dirigido en el que dos vértices cualesquiera están conectados exactamente por un camino. En otras palabras, cualquier gráfico conexo sin ciclos simples es un árbol.

Dado un árbol de n nodos etiquetados de 0 a n - 1, y una matriz de n - 1 aristas donde aristas[i] = [ai, bi] indica que hay una arista no dirigida entre los dos nodos ai y bi en el árbol , puede elegir cualquier nodo del árbol como raíz. Cuando selecciona un nodo x como raíz, el árbol resultante tiene una altura h. Entre todos los árboles enraizados posibles, aquellos con altura mínima (es decir, min (h)) se denominan árboles de altura mínima (MHT).

Devuelve una lista de las etiquetas raíz de todos los MHT. Puede devolver la respuesta en cualquier orden.

La altura de un árbol con raíces es el número de aristas en el camino descendente más largo entre la raíz y una hoja.

## Restricciones ⚠️	

* 1 <= n <= 2 * 104
* edges.length == n - 1
* 0 <= ai, bi < n
* ai != bi
* All the pairs (ai, bi) are distinct.

## Ejemplo 1

![e1](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/assets/80435721/fa6dcfbf-7791-4d2b-925b-b2c9b1d30fb3)

Ejemplo 1:

```
Input: n = 4, edges = [[1,0],[1,2],[1,3]]
Output: [1]
Explanation: As shown, the height of the tree is 1 when the root is the node with label 1 which is the only MHT.
```

## Ejemplo 2

![e2](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/assets/80435721/88385071-7eef-4495-8c4a-6d60cb168ee9)

Ejemplo 1:

```
Input: n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]
Output: [3,4]
```

### Explicación de la solucion

La clase CBTInserter implementa la funcionalidad requerida. Al inicializar un objeto de esta clase con el nodo raíz del árbol completo, se crea una cola queue que se utiliza para realizar un seguimiento de los nodos que deben ser insertados.

El método insert toma un valor val y lo inserta en el árbol manteniendo la completitud. Primero, se obtiene el primer nodo de la cola queue, que representa el padre del nuevo nodo a insertar. Si el padre no tiene un hijo izquierdo, se inserta el nuevo nodo como su hijo izquierdo. De lo contrario, se inserta como el hijo derecho y se elimina el padre de la cola queue. Luego, se agrega el nuevo nodo a la cola queue y se devuelve el valor del padre.

El método get_root simplemente devuelve el nodo raíz del árbol.

El método populate_queue se utiliza para inicializar la cola queue con los nodos del árbol completo. Recorre el árbol utilizando un recorrido por niveles y agrega los nodos que tienen al menos uno de sus hijos faltantes a la cola queue.

En la siguiente tabla se describe los pasos que se realizan:

Paso | Imagen | Descripción
:--: | :--: | -- |
1 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/1.jpg "Esta es una imagen de muestra.") | Se comienza por la raíz (valor 1) para luego dirigirse al lado izquierdo siguiendo el inorden|
2 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/2.jpg "Esta es una imagen de muestra.") | Luego de dirigirse al subárbol izquierdo se obtiene que este se encuentra vacío (null) |
3 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/3.jpg "Esta es una imagen de muestra.") | Por lo que se agrega el nodo raíz (1) a la pila y nos movemos al subárbol de la derecha, siguiendo el orden (inorden) |
4 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/4.jpg "Esta es una imagen de muestra.") |Se vuelve a dirigir al subárbol izquierdo del nodo (2) en donde se encuentra el nodo 3, como tanto el lado izquierdo como derecho del nodo 3 se encunetran vacios (null) se agrega (nodo 3) a la pila y se dirige al nodo de la derecha al nodo (2) |
5 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/5.jpg "Esta es una imagen de muestra.") | El lado derecho del nodo 2 se encuentra vacío (null) por lo que se agrega a la pila |

## LeetCode
**[94. Binary Tree Inorder Traversal]** de la **[LeetCode]**

[94. Binary Tree Inorder Traversal]: https://leetcode.com/problems/binary-tree-inorder-traversal/
[LeetCode]: https://leetcode.com
