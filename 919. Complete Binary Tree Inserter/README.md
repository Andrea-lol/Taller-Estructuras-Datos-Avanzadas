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

En la siguiente tabla se describe los pasos que se realizan:

Paso | Imagen | Descripción
:--: | :--: | -- |
1 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/1.jpg "Esta es una imagen de muestra.") | Se comienza por la raíz (valor 1) para luego dirigirse al lado izquierdo siguiendo el inorden|
2 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/2.jpg "Esta es una imagen de muestra.") | Luego de dirigirse al subárbol izquierdo se obtiene que este se encuentra vacío (null) |
3 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/3.jpg "Esta es una imagen de muestra.") | Por lo que se agrega el nodo raíz (1) a la pila y nos movemos al subárbol de la derecha, siguiendo el orden (inorden) |
4 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/4.jpg "Esta es una imagen de muestra.") |Se vuelve a dirigir al subárbol izquierdo del nodo (2) en donde se encuentra el nodo 3, como tanto el lado izquierdo como derecho del nodo 3 se encunetran vacios (null) se agrega (nodo 3) a la pila y se dirige al nodo de la derecha al nodo (2) |
5 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/5.jpg "Esta es una imagen de muestra.") | El lado derecho del nodo 2 se encuentra vacío (null) por lo que se agrega a la pila |

## LeetCode
**[919. Complete Binary Tree Inserter]** de la **[LeetCode]**

[919. Complete Binary Tree Inserter]: https://leetcode.com/problems/complete-binary-tree-inserter/description/
[LeetCode]: https://leetcode.com
