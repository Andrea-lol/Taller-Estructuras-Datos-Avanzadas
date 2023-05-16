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

##Explicación de la solucion

La clase CBTInserter implementa la funcionalidad requerida. Al inicializar un objeto de esta clase con el nodo raíz del árbol completo, se crea una cola queue que se utiliza para realizar un seguimiento de los nodos que deben ser insertados.

El método insert toma un valor val y lo inserta en el árbol manteniendo la completitud. Primero, se obtiene el primer nodo de la cola queue, que representa el padre del nuevo nodo a insertar. Si el padre no tiene un hijo izquierdo, se inserta el nuevo nodo como su hijo izquierdo. De lo contrario, se inserta como el hijo derecho y se elimina el padre de la cola queue. Luego, se agrega el nuevo nodo a la cola queue y se devuelve el valor del padre.

El método get_root simplemente devuelve el nodo raíz del árbol.

El método populate_queue se utiliza para inicializar la cola queue con los nodos del árbol completo. Recorre el árbol utilizando un recorrido por niveles y agrega los nodos que tienen al menos uno de sus hijos faltantes a la cola queue.

En la siguiente tabla se describe los pasos que se realizan:

Paso | Imagen | Descripción
:--: | :--: | -- |
1 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/1.jpg "Esta es una imagen de muestra.") | Creación del árbol binario completo. Comenzamos con el árbol vacío|
2 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/2.jpg "Esta es una imagen de muestra.") | Luego, agregamos los nodos hijos izquierdo y derecho. Este es el árbol binario completo inicial con altura 1.|
3 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/3.jpg "Esta es una imagen de muestra.") | Inserción de un nuevo nodo Dado que ya tenemos un árbol binario completo inicial, debemos seguir manteniendo la completitud al insertar un nuevo nodo. Supongamos que queremos insertar el valor 4. Según la regla de completitud, debemos insertar el nuevo nodo como hijo izquierdo del siguiente nodo disponible en el nivel más bajo y más a la izquierda. |
4 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/4.jpg "Esta es una imagen de muestra.") | En este caso, el nodo ? es el siguiente nodo disponible en el nivel más bajo y más a la izquierda. Ahora, para mantener la completitud, necesitamos agregar un nuevo nivel a la derecha: |
5 | ![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/310.%20Minimum%20Height%20Trees/img/5.jpg "Esta es una imagen de muestra.") | Resultado final. Continuamos insertando nuevos nodos siguiendo el mismo proceso hasta alcanzar el resultado final. Supongamos que queremos insertar el valor 5 |

## LeetCode
**[919. Complete Binary Tree Inserter]** de la **[LeetCode]**

[919. Complete Binary Tree Inserter]: https://leetcode.com/problems/complete-binary-tree-inserter/description/
[LeetCode]: https://leetcode.com
