# 1971. Find if Path Exists in Graph 💻

![Version 1.0](https://img.shields.io/badge/version-1.0.-blue.svg) 

## Descripción Y Contexto

Hay un gráfico bidireccional "n" con vértices, donde cada vértice está etiquetado de "0" a "n - 1" ( inclusive ). Los bordes del gráfico se representan como una matriz de enteros 2D edges "edges", donde cada uno denota un borde bidireccional entre vértice y vértice . Cada par de vértices está conectado como máximo por una arista, y ningún vértice tiene una arista en sí mismo. "edges[i] = [ui, vi]" "ui" "vi".

Desea determinar si existe una ruta válida de vértice "source" a vértice "destination".

Dado "edges" y los enteros "n", "source" y "destination", devuelven "true" si hay una ruta válida de "source" a "destination", o "false" de lo contrario .

## Ejemplos 📋

![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/919.%20Complete%20Binary%20Tree%20Inserter/img/lc-treeinsert.jpg "Esta es una imagen de muestra.")

Ejemplo 1:

```bash
   Entrada: n = 3, aristas = [[0,1],[1,2],[2,0]], origen = 0, destino = 2 
   Salida: verdadero
   Explicación: Hay dos caminos desde el vértice 0 al vértice 2 : 
   - 0 → 1 → 2 
   - 0 → 2
```

Ejemplo 2:

```bash
   Entrada: n = 6, aristas = [[0,1],[0,2],[3,5],[5,4],[4,3]], origen = 0, destino = 5 
   Salida: falso
   Explicación: No hay ruta desde el vértice 0 al vértice 5.
```

Explicación

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
