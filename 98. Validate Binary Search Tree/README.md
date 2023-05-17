# 98. Validate Binary Search Tree 💻

![Version 1.0](https://img.shields.io/badge/version-1.0.-blue.svg) 

## Descripción Y Contexto

Dada la ```raíz``` de un árbol binario, determine si es un árbol de búsqueda binario (BST) válido.

Un BST válido se define de la siguiente manera:

* El subárbol izquierdo de un nodo contiene solo nodos con claves menores que la clave del nodo.
* El subárbol derecho de un nodo contiene solo nodos con claves mayores que la clave del nodo.
* Los subárboles izquierdo y derecho también deben ser árboles de búsqueda binarios.

## Restricciones ⚠️	

* El número de nodos en el árbol estará en el rango ```bash
        [1, 10^4].```

*  ```bash -231 <= Node.val <= 231 - 1```

## Ejemplo 📋

Ejemplo 1

![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/98.%20Validate%20Binary%20Search%20Tree/img/tree2.jpg "Esta es una imagen de muestra.")

```bash
    $ Input: root = [5,1,4,null,null,3,6]
    $ Output: false
    $ Explication: El valor del nodo raíz es 5 pero el valor de su hijo derecho es 4.
```

## Explicación

En este ejemplo se proporciona una descripción paso a paso de cómo construir un árbol a partir de una lista de valores y verificar si cumple con las propiedades de un árbol de búsqueda binario válido.

En la siguiente tabla se describe los pasos que se realizan:

Paso | Imagen | Descripción
:--: | :--: | -- |
1 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/98.%20Validate%20Binary%20Search%20Tree/img/Paso1.png "Esta es una imagen de muestra.") | Se comienza con el nodo raíz, que es el número 5.|
2 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/98.%20Validate%20Binary%20Search%20Tree/img/2.png "Esta es una imagen de muestra.") | El siguiente valor en la lista es el 1. Este menor que 5, por lo que se coloca como el hijo izquierdo del nodo raíz |
3 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/98.%20Validate%20Binary%20Search%20Tree/img/3.png "Esta es una imagen de muestra.") | El siguiente en la lista es el 4. Este es mayor que 1, por lo que lo colocamos como el hijo derecho del nodo con valor 1 |
4 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/98.%20Validate%20Binary%20Search%20Tree/img/4.png "Esta es una imagen de muestra.") | Sigue el valor en la lista que es null, lo que indica un nodo vacío. Por lo que, no hay más nodos para agregar en el subárbol derecho del nodo con valor 4 |
5 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/98.%20Validate%20Binary%20Search%20Tree/img/5.png "Esta es una imagen de muestra.") | Se regresa al nodo raíz con valor 5 y avanzamos al subárbol derecho |
6 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/98.%20Validate%20Binary%20Search%20Tree/img/6.png "Esta es una imagen de muestra.") | Le sigue el valor 3. Este es menor que 5, por lo que lo colocamos como el hijo izquierdo del nodo con valor 4 |
7 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/98.%20Validate%20Binary%20Search%20Tree/img/7.png "Esta es una imagen de muestra.") | Sigue en la lista el valor 6. Es mayor que 5, por lo que lo colocamos como el hijo derecho del nodo raíz |
8 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/98.%20Validate%20Binary%20Search%20Tree/img/8.png "Esta es una imagen de muestra.") | El siguiente valor en la lista es null. Por lo que, no hay más nodos para agregar en el subárbol derecho del nodo con valor 6 |
9 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/98.%20Validate%20Binary%20Search%20Tree/img/9.png "Esta es una imagen de muestra.") | Luego de explorar todos los nodos se puede ver que hay una violación de la propiedad del árbol de búsqueda binario. El nodo raíz tiene un valor de 5, pero su hijo derecho tiene un valor de 4, lo que no cumple con la propiedad de que todos los nodos en el subárbol derecho deben tener valores mayores |

## LeetCode
**[98. Validate Binary Search Tree]** de la **[LeetCode]**

[98. Validate Binary Search Tree]: https://leetcode.com/problems/validate-binary-search-tree/
[LeetCode]: https://leetcode.com
