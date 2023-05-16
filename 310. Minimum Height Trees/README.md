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

La solución utiliza un enfoque de eliminación de hojas iterativo para encontrar las raíces de los árboles de altura mínima. Comienza construyendo un grafo utilizando una lista de adyacencia y calculando los grados de los nodos. Luego, encuentra las hojas iniciales (nodos con un solo vecino) y las elimina iterativamente hasta que queden las raíces
En la siguiente tabla se describe los pasos que se realizan:

Paso | Imagen | Descripción
:--: | :--: | -- |
1 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/1.jpg "Esta es una imagen de muestra.") | Construcción del grafo. Primero, construimos el grafo utilizando una lista de adyacencia. Cada nodo se representa con una lista que contiene sus vecinos. En este caso, el grafo se vería así |
2 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/2.jpg "Esta es una imagen de muestra.") | Identificación de hojas iniciales. A continuación, identificamos las hojas iniciales, que son los nodos con un solo vecino. En este caso, los nodos 0 y 2 son hojas iniciales. Los colorearemos en azul: |
3 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/3.jpg "Esta es una imagen de muestra.") | Eliminación de hojas iterativamente. Luego, eliminamos iterativamente las hojas hasta que queden las raíces. Comenzamos eliminando las hojas iniciales y actualizamos los grados de los vecinos correspondientes. En este caso, eliminamos el nodo 2: |
4 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/4.jpg "Esta es una imagen de muestra.") | Después de la eliminación, el nodo 1 se convierte en una hoja. Lo coloreamos en azul y Continuamos eliminando la hoja restante, el nodo 1: Después de esta eliminación, ya no quedan hojas en el grafo. |
5 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/5.jpg "Esta es una imagen de muestra.") | Identificación de las raíces. Las raíces restantes en el conjunto de hojas son los árboles de altura mínima. En este caso, el nodo 1 es la única raíz. Lo coloreamos en rojo: Por lo tanto, la única raíz del árbol de altura mínima es el nodo 1. |

## LeetCode
**[94. Binary Tree Inorder Traversal]** de la **[LeetCode]**

[94. Binary Tree Inorder Traversal]: https://leetcode.com/problems/minimum-height-trees/
[LeetCode]: https://leetcode.com
