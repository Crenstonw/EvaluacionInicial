package paquete;

public class Batalla {
	Personaje jugador1;
	Personaje jugador2;
	
	public Personaje getJugador1() {
		return jugador1;
	}
	public void setJugador1(Personaje jugador1) {
		this.jugador1 = jugador1;
	}
	public Personaje getJugador2() {
		return jugador2;
	}
	public void setJugador2(Personaje jugador2) {
		this.jugador2 = jugador2;
	}
	
	public Batalla(Personaje jugador1, Personaje jugador2) {
		super();
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}
	
	public int golpear(Personaje personaje) {
		int golpe = (int)(Math.random()*(3-1+1)+1);
		return golpe * personaje.fuerza;
	}
	
	public boolean vidaBaja(Personaje personaje) {
		if (personaje.hp <=30) {
			return true;
		} else {
			return false;
		}
	}
}
