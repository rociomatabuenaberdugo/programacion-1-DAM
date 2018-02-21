# Ejercicio 1

### ¿Cuáles serían los atributos de la clase PilotoDeFormula1? ¿Se te ocurren algunas instancias de esta clase?

##### Atributos:
nombre, apellidos, edad, nacionalidad, numTitulosGanados, escuderiaActual, historialDeEscuderia, numPoles, victorias, carrerasJugadas, numDePuntos, mejorTemporada

##### Ejemplos de objetos (instancias):
fernandoAlonso, lewisHamilton, carlosSainz, sebastianVettel...

# Ejercicio 2

### A continuación tienes una lista en la que están mezcladas varias clases con instancias de esas clases. Para ponerlo un poco más difícil, todos los elementos están escritos en minúscula. Di cuáles son las clases, cuáles las instancias, a qué clase pertenece cada una de estas instancias y cuál es la jerarquía entre las clases: paula, goofy, gardfiel, perro, mineral, caballo, tom, silvestre, pirita, rocinante, milu, snoopy, gato, pluto, animal, javier, bucefalo, pegaso, ayudante_de_santa_claus, cuarzo, laika, persona, pato_lucas.

##### Clases
perro, mineral, caballo, gato, animal, persona



##### Instancias
paula, goofy, gardfiel, pirita, tom, silvestre, rocinante, milu, snoope, pluto, javier, bucefalo, pegaso, ayudanteDeSantaClaus, cuarzo, laika, patoLucas



##### Relación
  Persona  --  paula, javier, ayudanteDeSantaClaus

  Perro  --  goofy, milu, snoopy, pluto
  
  Gato  --  gardfiel, tom, silvestre
  
  Caballo  --  rocinante, bucefalo, pegaso 
  
  Mineral  --  pirita, cuarzo



##### Relación (2)
Animal {Perro, Gato, Caballo} ;
Persona;
Mineral;

# Ejercicio 3

### ¿Cuáles serían los atributos de la clase Vivienda? ¿Qué subclases se te ocurren?

##### Atributos
catastro, metrosCuadrados, numeroDeHabitaciones, numeroDeBanos, direccion, precio, tipo, codPropietario...

##### Subclases
duplex, piso, chalet, atico, loft...

# Ejercicio 4

### Piensa en la liga de baloncesto, ¿qué 5 clases se te ocurren para representar 5 elementos distintos que intervengan en la liga?

##### Clases
arbitro, equipos, cancha, comentarista, partido.

# Ejercicio 5

### Haz una lista con los atributos que podría tener la clase caballo. A continuación haz una lista con los posibles métodos (acciones asociadas a los caballos).

##### Atributos
nombre, edad, color, sexo, raza, peso, propietario, identificacion,...

##### Métodos
rinchar, cabalgar, comer, saltar, correr,...

# Ejercicio 6

### Lista los atributos de la clase Alumno ¿Sería nombre uno de los atributos de la clase? Razona tu respuesta.

##### Atributos
nombreCompleto, edad, clase, curso,...




  Sí, nombre formaría parte de mis atributos.

# Ejercicio 7

### ¿Cuáles serían los atributos de la clase Ventana (de ordenador)? ¿cuáles serían los métodos? Piensa en las propiedades y en el comportamiento de una ventana de cualquier programa.

##### Atributos
anchura, altura, estado, colorDeFondo, redimensionar, tieneFoco, posicionX, posicionY, posicionZ, nombre...

##### Métodos
cerrar, nuevaPestaña, minimizar, maximizar, ampliar