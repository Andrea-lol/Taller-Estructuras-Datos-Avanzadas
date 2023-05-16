# 1971. Find if Path Exists in Graph 💻

![Version 1.0](https://img.shields.io/badge/version-1.0.-blue.svg) 

## Descripción Y Contexto

Hay un gráfico bidireccional "n" con vértices, donde cada vértice está etiquetado de "0" a "n - 1" ( inclusive ). Los bordes del gráfico se representan como una matriz de enteros 2D edges, donde cada uno denota un borde bidireccional entre vértice y vértice . Cada par de vértices está conectado como máximo por una arista, y ningún vértice tiene una arista en sí mismo.edges[i] = [ui, vi]uivi

Desea determinar si existe una ruta válida de vértice sourcea vértice destination.

Dado edgesy los enteros n, sourcey destination, devuelven truesi hay una ruta válida de sourcea destination, o falsede lo contrario .

## Ejemplos 📋

![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/919.%20Complete%20Binary%20Tree%20Inserter/img/lc-treeinsert.jpg "Esta es una imagen de muestra.")

Ejemplo 1:

```bash
    $ Input 
    ["CBTInserter", "insert", "insert", "get_root"]
    [[[1, 2]], [3], [4], []]
    $ Output
    [null, 1, 2, [1, 2, 3, 4]]
```

Explicación

```bash
    CBTInserter cBTInserter = new CBTInserter([1, 2]);
    cBTInserter.insert(3);  // return 1
    cBTInserter.insert(4);  // return 2
    cBTInserter.get_root(); // return [1, 2, 3, 4]
```

## Restricciones ⚠️	

* El número de nodos en el árbol estará en el rango ```bash
        [1, 1000].```

*  ```bash
    0 <= Node.val <= 5000```

*  ```bash root``` es un árbol binario completo.

*  ```bash
    0 <= val <= 5000```

* Se realizarán como máximo ```bash 10^4``` llamadas a ```bash insert``` y ```bash get_root```.
    
## LeetCode
**[919. Complete Binary Tree Inserter]** de la **[LeetCode]**

[919. Complete Binary Tree Inserter]: https://leetcode.com/problems/complete-binary-tree-inserter/description/
[LeetCode]: https://leetcode.com
