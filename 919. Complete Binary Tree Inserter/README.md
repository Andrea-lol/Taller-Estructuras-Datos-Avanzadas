# 919. Complete Binary Tree Inserter 💻

![Version 1.0](https://img.shields.io/badge/version-1.0.-blue.svg) 

## Descripción Y Contexto

Un árbol binario completo es un árbol binario en el que todos los niveles, excepto posiblemente el último, están completamente llenos y todos los nodos están lo más a la izquierda posible.

Diseñe un algoritmo para insertar un nuevo nodo en un árbol binario completo manteniéndolo completo después de la inserción.

## Implemente la clase CBTInserter

* ```bash CBTInserter(TreeNode root)``` Inicializa la estructura de datos con la ```bash raíz``` del árbol binario completo.
* ```bash int insert(int v)``` Inserta un ```bash TreeNode``` en el árbol con el valor ```bash Node.val == val``` para que el árbol permanezca completo y devuelve el valor del padre del ```bash TreeNode``` insertado.
* ```bash TreeNode get_root()``` Devuelve el nodo raíz del árbol.


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
