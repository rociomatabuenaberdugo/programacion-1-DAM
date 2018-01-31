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
