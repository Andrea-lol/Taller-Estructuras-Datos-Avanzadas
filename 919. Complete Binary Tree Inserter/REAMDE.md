# 919. Complete Binary Tree Inserter 💻

![Version 1.0](https://img.shields.io/badge/version-1.0.-blue.svg) 

## Descripción Y Contexto

Un árbol binario completo es un árbol binario en el que todos los niveles, excepto posiblemente el último, están completamente llenos y todos los nodos están lo más a la izquierda posible.

Diseñe un algoritmo para insertar un nuevo nodo en un árbol binario completo manteniéndolo completo después de la inserción.

## Implemente la clase CBTInserter

* ***CBTInserter(TreeNode root)*** Inicializa la estructura de datos con la ***raíz*** del árbol binario completo.
* ***int insert(int v)*** Inserta un ***TreeNode*** en el árbol con el valor ***Node.val == val*** para que el árbol permanezca completo y devuelve el valor del padre del ***TreeNode*** insertado.
* ***TreeNode get_root()*** Devuelve el nodo raíz del árbol.


## Ejemplos 📋



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

* The number of nodes in the tree will be in the range ```bash
        [1, 1000]. ```

*  ```bash
    0 <= Node.val <= 5000
```

*  ```bash root is a complete binary tree.

    $ nums contiene valores distintos ordenados en orden ascendente.
```

```bash
    $ -10^4 <= objetivo <= 10^4
```

## LeetCode
**[35. Search Insert Position]** de la **[LeetCode]**

[35. Search Insert Position]: https://leetcode.com/problems/search-insert-position/description/
[LeetCode]: https://leetcode.com
