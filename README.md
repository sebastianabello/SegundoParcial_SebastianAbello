# Propuesta

## Descripción

Se puede usar el patron de diseño estrategia, ya que permite definir familias de algoritmos y encapsular cada uno, logrando ser intercambiables.
En este caso seria con los eventos de error en un archivo o en una base de datos.  

1. Primero definiremos una interfaz LogStrategy que tendrá un método logError.
2. Luego crearemos dos clases que implementen esta interfaz: FileLogStrategy y DatabaseLogStrategy. 
3. FileLogStrategy implementará la funcionalidad de registro de errores en un archivo mientras que DatabaseLogStrategy lanzará una excepción.

