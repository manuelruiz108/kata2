# kata2

## Objetivo
El objetivo de este proyecto ha sido diseñar y comprender un sistema
que recibe datos ya sea de un fichero, memoria o url y transformarlo
a un OutputStream como podría ser la terminal o un nuevo fichero. Además,
teniendo en cuenta que el diseño debe tener la posibilidad de en cualquier momento poder
cambiar entre InputStreams o OutputStreams con gran facilidad

## Compilación y ejecución
Para compilar el programa se puede realizar desde el botón de run
en el archivo main o mediante comandos. Si se desean cambiar los datos
lo único que hay que hacer es añadir otro fichero y cambiar el nombre del que
quieres leer en el main o lo mismo con la url

## Dependencias y versión del JDK
java 1.8.0
JDK 24.0.2

## Estructura de la entrega y clases principales
El proyecto está dividido en paquetes, los principales son io y model.
En model encontramos nuestra clase record Videogame que modela los objetos
de videojuegos con su nombre, plataforma, rating y género
Por otra parte tenemos el paquete io donde residen la gran mayoría de clases.
Las dos primeras y más importantes son las interfaces VideogameReader y SummaryWriter
que nos permiten tanto cargar como escribir datos aislando la responsabilidad de
los orígenes de los datos. Por último encontramos las clases FileVideogameReader,
URLVideogameReader y StreamSummaryWriter que usando las interfaces anteriores nos
permite adaptarnos a los tipos de datos específicos

## Repetición de la kata
Para llevar a cabo las tres repeticiones creamos una nueva rama llamada develop1
donde desarrollamos las iteraciones. Para cada práctica borramos todo el progreso anterior
y realizamos un commit especificando en cual de los 3 estados nos ubicamos.

## Evidencias
```text
    --- RESULTADOS DESDE LA URL ---
Videogame[name=The Legend of Zelda: Breath of the Wild, platform=Nintendo Switch, rating=9.7, genre=Aventura]
Videogame[name=The Witcher 3: Wild Hunt, platform=PC, rating=9.3, genre=RPG]
Videogame[name=Red Dead Redemption 2, platform=PS4, rating=9.7, genre=Accion]
Videogame[name=Minecraft, platform=PC, rating=9.0, genre=Supervivencia]
Videogame[name=Hollow Knight, platform=PC, rating=9.0, genre=Aventura]
Videogame[name=Elden Ring, platform=PS5, rating=9.6, genre=RPG]
Videogame[name=Super Mario Odyssey, platform=Nintendo Switch, rating=9.7, genre=Plataformas]
Videogame[name=God of War, platform=PS4, rating=9.4, genre=Accion]
Videogame[name=Celeste, platform=PC, rating=9.2, genre=Plataformas]
Videogame[name=Persona 5 Royal, platform=PS4, rating=9.5, genre=RPG]
Videogame[name=Bloodborne, platform=PS4, rating=9.2, genre=RPG]
Videogame[name=Hades, platform=PC, rating=9.3, genre=Accion]
Videogame[name=Stardew Valley, platform=PC, rating=8.9, genre=Supervivencia]
Videogame[name=Super Smash Bros. Ultimate, platform=Nintendo Switch, rating=9.3, genre=Accion]
Videogame[name=Cyberpunk 2077, platform=PC, rating=8.6, genre=RPG]
9,293
