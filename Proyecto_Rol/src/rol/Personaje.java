package rol;

//Enumeración para las  clases de personajes
enum ClasePersonaje {
 MAGO,
 GUERRERO,
 BARDO,
 ASESINO
}

public class Personaje {
 // Atributos
 private String nombre;
 private double nivel;  
 private int puntosDeVida;
 private int puntosDeAtaque;
 private String competencia;
 private ClasePersonaje clase;

 // Constructor
 public Personaje(String nombre, ClasePersonaje clase) {
     this.nombre = nombre;
     this.nivel = 1.0; // Nivel por defecto
     this.clase = clase;

     // Inicializar puntos de vida, ataque y competencias según la clase elegida
     inicializarAtributosSegunClase();
 }

 // Métodos Getter y Setter
 public String getNombre() {
     return nombre;
 }

 public double getNivel() {
     return nivel;
 }

 public int getPuntosDeVida() {
     return puntosDeVida;
 }

 public void setPuntosDeVida(int puntosDeVida) {
     this.puntosDeVida = puntosDeVida;
 }

 public int getPuntosDeAtaque() {
     return puntosDeAtaque;
 }

 public void setPuntosDeAtaque(int puntosDeAtaque) {
     this.puntosDeAtaque = puntosDeAtaque;
 }

 public String getCompetencia() {
	return competencia;
}

public void setCompetencia(String competencia) {
	this.competencia = competencia;
}

public ClasePersonaje getClase() {
     return clase;
 }
@Override
public String toString() {
    return "Usted es: "+ nombre + 
           
            " y su clase es: " + clase ;
}


 // Método para inicializar puntos de vida, ataque y competencia según la clase elegida
 private void inicializarAtributosSegunClase() {
     switch (clase) {
         case MAGO:
             puntosDeVida = 55;
             puntosDeAtaque = 20;
             competencia="varita";
             break;
         case GUERRERO:
             puntosDeVida = 110;
             puntosDeAtaque = 30;
             competencia="espadaL";
             break;
         case BARDO:
             puntosDeVida = 70;
             puntosDeAtaque = 25;
             competencia="instrumento";
             break;
         case ASESINO:
             puntosDeVida = 80;
             puntosDeAtaque = 35;
             competencia="arco";
             break;
         default:
             // Manejo para un caso no esperado
             System.out.println("Clase de personaje no válida");
             break;
     }
 }


}
