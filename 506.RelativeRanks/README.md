# 506. Relative Ranks 💻

![Version 1.0](https://img.shields.io/badge/version-1.0.-blue.svg) 

## Descripción Y Contexto

Se le da una matriz de números enteros "score" de tamaño "n", donde "score[i]" es el puntaje del atleta en una competencia. Se garantiza que todas las puntuaciones son únicas. "ith"

Los atletas se colocan en función de sus puntajes, donde el atleta del lugar tiene el puntaje más alto, el atleta del lugar tiene el puntaje más alto, y así sucesivamente. La ubicación de cada atleta determina su rango: "1st", "2nd", "2nd"

* El lugar donde se encuentra el rango del atleta. 1st"Gold Medal"
* El lugar donde se encuentra el rango del atleta. 2nd"Silver Medal"
* El lugar donde se encuentra el rango del atleta. 3rd"Bronze Medal"
* Para el puesto del atleta del puesto, su rango es su número de puesto (es decir, el puesto del atleta del puesto es). "4th", "nth", "xth", "x"

Devuelve una matriz "answer" de tamaño ndonde "answer[i]" está el rango del atleta. "ith"

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
## Restricciones ⚠️	

* n == score.length
* 1 <= n <= 104
* 0 <= score[i] <= 106
* Todos los valores en scoreson únicos .

* Se realizarán como máximo ```bash 10^4``` llamadas a ```bash insert``` y ```bash get_root```.

## Explicación Gráfica:

![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/506.RelativeRanks/img/RUBRICA.png "Esta es una imagen de muestra.")

![Imagen de Evidencia](https://github.com/Andrea-lol/Taller-Estructuras-Datos-Avanzadas/blob/main/506.RelativeRanks/img/EJ%201.jpg "Esta es una imagen de muestra.")
    
## LeetCode
**[506. Relative Ranks]** de la **[LeetCode]**

[506. Relative Ranks]: https://leetcode.com/problems/relative-ranks/description/
[LeetCode]: https://leetcode.com
