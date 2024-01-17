package rol;

enum tipoMazmorra{
	RUINAS,
	CEMENTERIO,
	PANTANO,
	CIUDAD
}
enum dificultad{
	FACIL,
	NORMAL,
	DIFICIL
}

public class Mazmorra {

	private int tamaño;
	private tipoMazmorra tipo;
	private dificultad dificultad;
	
	public Mazmorra( tipoMazmorra tipo, dificultad dificultad) {
		
		 this.tamaño = setTamañoAleatorio();
		setTipo(tipo);
		setDificultad(dificultad);
		
		
		
	}

	public int getTamaño() {
		return tamaño;
	}

	private int setTamañoAleatorio() {
        return (int) Math.floor(Math.random() * 10 + 1);
    }

	public tipoMazmorra getTipo() {
		return tipo;
	}

	public void setTipo(tipoMazmorra tipo) {
		this.tipo = tipo;
	}

	public dificultad getDificultad() {
		return dificultad;
	}

	public void setDificultad(dificultad dificultad) {
		this.dificultad = dificultad;
	}
	
	@Override
	public String toString() {
	    return "tamaño: " + tamaño + " tipo: "+ tipo + " dificultad: " + dificultad;
	}
	
	
}