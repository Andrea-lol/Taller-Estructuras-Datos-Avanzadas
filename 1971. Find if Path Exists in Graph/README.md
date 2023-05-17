# 1971. Find if Path Exists in Graph 💻

![Version 1.0](https://img.shields.io/badge/version-1.0.-blue.svg) 

## Descripción Y Contexto:

Hay un gráfico bidireccional "n" con vértices, donde cada vértice está etiquetado de "0" a "n - 1" ( inclusive ). Los bordes del gráfico se representan como una matriz de enteros 2D edges "edges", donde cada uno denota un borde bidireccional entre vértice y vértice . Cada par de vértices está conectado como máximo por una arista, y ningún vértice tiene una arista en sí mismo. "edges[i] = [ui, vi]" "ui" "vi".

Desea determinar si existe una ruta válida de vértice "source" a vértice "destination".

Dado "edges" y los enteros "n", "source" y "destination", devuelven "true" si hay una ruta válida de "source" a "destination", o "false" de lo contrario .

## Ejemplos 📋

Ejemplo 1:

![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/1971.%20Find%20if%20Path%20Exists%20in%20Graph/img/Ejemplo1.png "Esta es una imagen de muestra.")

```bash
Entrada: n = 3, aristas = [[0,1],[1,2],[2,0]], origen = 0, destino = 2 
Salida: verdadero
Explicación: Hay dos caminos desde el vértice 0 al vértice 2 : 
- 0 → 1 → 2 
- 0 → 2
```

Ejemplo 2:

![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/1971.%20Find%20if%20Path%20Exists%20in%20Graph/img/Ejemplo2.png "Esta es una imagen de muestra.")

```bash
Entrada: n = 6, aristas = [[0,1],[0,2],[3,5],[5,4],[4,3]], origen = 0, destino = 5 
Salida: falso
Explicación: No hay ruta desde el vértice 0 al vértice 5.
```

## Explicación:

* Se usa un arreglo de booleanos para poder verificar si los valores se encuentran en el grafo.
* Se usa el hashset para aplicar el bfs y poder recorrer el grafo por los "edges" (conexiones entre nodos).
* Se valida si hay un enlace "edge" para que retorne true.
* Se hace uso de colas, cuando se recorra todo el grafo y se verifique que cada nodo fue recorrido, se imprimirá si existe un camino desde el nodo inicial hasta el final, si existe conexión entre ellos, retornara true, si no, false.

## Restricciones ⚠️	

* 1 <= n <= 2 * 105
* 0 <= edges.length <= 2 * 105
* edges[i].length == 2
* 0 <= ui, vi <= n - 1
* ui != vi
* 0 <= source, destination <= n - 1
* No hay bordes duplicados.
* No hay bordes propios.
    
## LeetCode
**[919. Complete Binary Tree Inserter]** de la **[LeetCode]**

[919. Complete Binary Tree Inserter]: https://leetcode.com/problems/complete-binary-tree-inserter/description/
[LeetCode]: https://leetcode.com
