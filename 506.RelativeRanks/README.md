# 506. Relative Ranks 💻

![Version 1.0](https://img.shields.io/badge/version-1.0.-blue.svg) 

## Descripción Y Contexto

Un árbol binario completo es un árbol binario en el que todos los niveles, excepto posiblemente el último, están completamente llenos y todos los nodos están lo más a la izquierda posible.

Diseñe un algoritmo para insertar un nuevo nodo en un árbol binario completo manteniéndolo completo después de la inserción.

## Implemente la clase CBTInserter

* ```bash CBTInserter(TreeNode root)``` Inicializa la estructura de datos con la ```bash raíz``` del árbol binario completo.
* ```bash int insert(int v)``` Inserta un ```bash TreeNode``` en el árbol con el valor ```bash Node.val == val``` para que el árbol permanezca completo y devuelve el valor del padre del ```bash TreeNode``` insertado.
* ```bash TreeNode get_root()``` Devuelve el nodo raíz del árbol.


## Ejemplos 📋

![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/506.RelativeRanks/img/Imagen1.png "Esta es una imagen de muestra.")

Ejemplo 1:

```bash
   $ Input: score = [5,4,3,2,1]
   $ Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
   $ Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
```

Ejemplo 2:

```bash
   $ Input: score = [10,3,8,9,4]
   $ Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
   $ Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].
```

Explicación

```bash

```

## Restricciones ⚠️	

* n == score.length
* 1 <= n <= 104
* 0 <= score[i] <= 106
* Todos los valores en scoreson únicos .

* Se realizarán como máximo ```bash 10^4``` llamadas a ```bash insert``` y ```bash get_root```.
    
## LeetCode
**[919. Complete Binary Tree Inserter]** de la **[LeetCode]**

[919. Complete Binary Tree Inserter]: https://leetcode.com/problems/complete-binary-tree-inserter/description/
[LeetCode]: https://leetcode.com
