# Tragos_Factory_Method
Primer Trabajo de Laboratorio de Programacion

**`Factory Method`**es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una superclase, mientras permite a las subclases alterar el tipo de objetos que se crearán.

Dominio es al “Preparación de distintos tipos de tragos en un Bar”, el problema del dominio es que a la hora  pasos de preparación e ingredientes de un trago son completamente diferentes para cada tipo de trago, además de que a la hora de agregar o quitar un trago al menú habría que modificar completamente el código del trago donde estaría implementado la mayoría del código, para solucionar este problema implementamos el patrón de diseño creacional **Factory Method.**

se utiliza un método *constructor* especial (`Tragos`), donde cada tipo de trago en particular (subclases) se crean siendo invocador por el método `Trago`.

cada clase de trago por ejemplo Mojito debe implementar la interfaz `PrepararTrago`, invocando `crearTrago` que declara los métodos llamados `ingredients()` y `preparation()` donde cada clase de trago diferente implementa los método de forma diferente.

---

1) El `PrepararTrago` declara la interfaz, que es común a todos los objetos que puede producir la clase `Trago`.

2) Las preparaciones de Tragos **Concretas (ej:`PrepararMojito`)** son distintas implementaciones de la interfaz de `PrepararTrago()`.

3) La clase `Trago` declara el métodos `ingredients()` y `preparation()` que devuelve las preparaciones de los tragos; como Factory Method es declarado como abstracto fuerza a todas las subclases (las distintas preparaciones de tragos) a implementar sus propias versiones de los metodos `ingredients()` y `preparation(`).

4) Los distintos tipos de tragos sobrescriben el Factory Method base, de modo que devuelva un tipo diferente de Preparación
