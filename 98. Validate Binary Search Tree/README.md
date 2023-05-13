# 98. Validate Binary Search Tree 💻

![Version 1.0](https://img.shields.io/badge/version-1.0.-blue.svg) 

## Descripción Y Contexto

Dada la ``` raíz``` de un árbol binario, determine si es un árbol de búsqueda binario (BST) válido.

Un BST válido se define de la siguiente manera:

* El subárbol izquierdo de un nodo contiene solo nodos con claves menores que la clave del nodo.
* El subárbol derecho de un nodo contiene solo nodos con claves mayores que la clave del nodo.
* Los subárboles izquierdo y derecho también deben ser árboles de búsqueda binarios.

## Ejemplos 📋

Ejemplo 1:

![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/98.%20Validate%20Binary%20Search%20Tree/img/lc-treeinsert.jpg "Esta es una imagen de muestra.")

```bash
    $ Input: root = [2,1,3]
    $ Output: true
```

Ejemplo 2

![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/98.%20Validate%20Binary%20Search%20Tree/img/tree2.jpg "Esta es una imagen de muestra.")

```bash
    $ Input: root = [5,1,4,null,null,3,6]
    $ Output: false
    $ Explication: El valor del nodo raíz es 5 pero el valor de su hijo derecho es 4.
```

## Restricciones ⚠️	

* El número de nodos en el árbol estará en el rango ```bash
        [1, 10^4].```

*  ```bash -231 <= Node.val <= 231 - 1```

## LeetCode
**[98. Validate Binary Search Tree]** de la **[LeetCode]**

[98. Validate Binary Search Tree]: https://leetcode.com/problems/validate-binary-search-tree/
[LeetCode]: https://leetcode.com
