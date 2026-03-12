# Buscador de Palabras en Java

Este mini proyecto implementa dos algoritmos clásicos de búsqueda sobre un diccionario de palabras:

- Búsqueda lineal
- Búsqueda binaria

El programa permite ingresar una palabra desde la consola y muestra si la palabra se encuentra en el diccionario, el índice donde fue encontrada y el número de comparaciones realizadas por cada algoritmo.

## Funcionamiento

1. El programa contiene un arreglo de palabras ordenadas alfabéticamente.
2. El usuario ingresa una palabra desde la consola.
3. El sistema ejecuta dos búsquedas:
   - búsqueda lineal
   - búsqueda binaria
4. Se muestran los resultados de cada algoritmo.

Ejemplo de salida:

[Lineal] Encontrado en índice 10 — 11 comparaciones

[Binaria] Encontrado en índice 10 — 4 comparaciones

Esto permite observar la diferencia de eficiencia entre ambos algoritmos.

## Por qué la búsqueda binaria necesita datos ordenados

La búsqueda binaria funciona dividiendo repetidamente el arreglo en dos mitades.

1. Se compara la palabra buscada con el elemento del medio.
2. Si la palabra es mayor, se descarta la mitad izquierda.
3. Si es menor, se descarta la mitad derecha.

Este proceso solo funciona si los elementos están **ordenados**, ya que el algoritmo decide qué mitad descartar basándose en el orden lexicográfico de las palabras.

## Complejidad de los algoritmos

| Algoritmo | Complejidad |
|----------|-------------|
| Búsqueda lineal | O(n) |
| Búsqueda binaria | O(log n) |

Por esta razón, la búsqueda binaria es mucho más eficiente en listas grandes.

## Tecnologías utilizadas

- Java
- Programación orientada a objetos
