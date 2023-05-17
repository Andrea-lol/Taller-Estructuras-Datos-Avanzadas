# 94. Binary Tree Inorder Traversal 💻

![Version 1.0](https://img.shields.io/badge/version-1.0.-blue.svg) 

## Descripción Y Contexto

Dados dos árboles binarios originales y clonados y dada una referencia a un objetivo de nodo en el árbol original.

El árbol clonado es una copia del árbol original.

Devuelve una referencia al mismo nodo en el árbol clonado.

Tenga en cuenta que no puede cambiar ninguno de los dos árboles o el nodo de destino y la respuesta debe ser una referencia a un nodo en el árbol clonado.

## Restricciones ⚠️	

```
* El número de nodos en el árbol está en el rango [1, 104].
* Los valores de los nodos del árbol son únicos.
* El nodo de destino es un nodo del árbol original y no es nulo.
```

## Ejemplo 1️

![e1](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/assets/80435721/5650e8b4-8e60-4a21-b473-4096aa1a4901)

Ejemplo 1:

```
Input: tree = [7,4,3,null,null,6,19], target = 3
Output: 3
Explanation: In all examples the original and cloned trees are shown. The target node is a green node from the original tree. The answer is the yellow node from the cloned tree.
```

## Ejemplo 2

![e2](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/assets/80435721/4035a799-1ad0-4349-9dea-dc491aa32539)

Ejemplo 2:

```
Input: tree = [7], target =  7
Output: 7
```

## Ejemplo 3

![e3](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/assets/80435721/c1e75191-e992-4fa9-8fe6-57be4e3ea533)

Ejemplo 3:

```
Input: tree = [8,null,6,null,5,null,4,null,3,null,2,null,1], target = 4
Output: 4
```

### Explicación de la solución

En esta solución, primero manejamos los casos base donde el árbol original o clonado es nulo. Si el nodo original es igual al nodo de destino, devolvemos el nodo clonado correspondiente.

De lo contrario, recorremos recursivamente los subárboles izquierdo y derecho de los árboles originales y clonados. Comprobamos si el nodo de destino se encuentra en el subárbol izquierdo haciendo una llamada recursiva a getTargetCopy con los hijos izquierdos de ambos árboles. Si se encuentra, devolvemos el resultado. De lo contrario, repetimos el proceso para el subárbol derecho.

Si el nodo de destino no se encuentra en ninguno de los subárboles, devolvemos nulo.

En la siguiente tabla se describe los pasos que se realizan:

Paso | Imagen | Descripción
:--: | :--: | -- |
1 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/94.%20Binary%20Tree%20Inorder%20Traversal/img/Paso1.png "Esta es una imagen de muestra.") | Comparamos el nodo actual del árbol original con el nodo objetivo. Si son iguales, devolvemos el nodo correspondiente en el árbol clonado. En este caso, el nodo actual es 7 y el objetivo es 3, por lo que no son iguales. |
2 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/94.%20Binary%20Tree%20Inorder%20Traversal/img/Paso2.png "Esta es una imagen de muestra.") | Recursivamente, llamamos a la función getTargetCopy para el subárbol izquierdo. En este caso, el subárbol izquierdo del nodo actual es el nodo 4 en el árbol original y el nodo 4 en el árbol clonado |
3 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/94.%20Binary%20Tree%20Inorder%20Traversal/img/Paso3.png "Esta es una imagen de muestra.") | Continuamos recursivamente hacia abajo en el subárbol izquierdo hasta que encontremos el nodo objetivo. En este caso, el nodo objetivo es 3 y no se encuentra en el subárbol izquierdo del nodo 4 en el árbol original. |
4 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/94.%20Binary%20Tree%20Inorder%20Traversal/img/Paso4.png "Esta es una imagen de muestra.") |Regresamos a la función anterior y llamamos a la función getTargetCopy para el subárbol derecho del nodo actual. El subárbol derecho del nodo actual es el nodo 3 en el árbol original y el nodo 3 en el árbol clonado. |
5 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/94.%20Binary%20Tree%20Inorder%20Traversal/img/Paso5.png "Esta es una imagen de muestra.") | Continuamos recursivamente hacia abajo en el subárbol derecho hasta encontrar el nodo objetivo. En este caso, el nodo objetivo es 3 y se encuentra en el subárbol derecho del nodo 3 en el árbol original. |
6 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/94.%20Binary%20Tree%20Inorder%20Traversal/img/Paso6.png "Esta es una imagen de muestra.") | Devolvemos la referencia al nodo 3 en el árbol clonado. |


## LeetCode
**[94. Binary Tree Inorder Traversal]** de la **[LeetCode]**

[94. Binary Tree Inorder Traversal]: https://leetcode.com/problems/binary-tree-inorder-traversal/
[LeetCode]: https://leetcode.com
