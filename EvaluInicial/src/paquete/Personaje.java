package paquete;

import java.util.Arrays;
import java.util.Objects;

public class Personaje {
	String nombre;
	int hp;
	int puntos;
	int fuerza;
	String[] mochila = new String[10];
	
	public Personaje() {}

	public Personaje(String nombre) {
		super();
		this.nombre = nombre;
		this.hp = 100;
		this.puntos = 0;
		this.fuerza = (int)(Math.random()*(5-1+1)+1);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public String[] getMochila() {
		return mochila;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(mochila);
		result = prime * result + Objects.hash(hp, nombre, puntos);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return hp == other.hp && Arrays.equals(mochila, other.mochila) && Objects.equals(nombre, other.nombre)
				&& puntos == other.puntos;
	}
	
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", hp=" + hp + ", puntos=" + puntos + ", fuerza=" + fuerza + ", mochila="
				+ Arrays.toString(mochila) + "]";
	}

	public String agregarPocion() {
		boolean agregar = false;
		for ( String mochila : mochila) {
			if (mochila == "" && !agregar) {
				mochila = "pocion";
				agregar = true;
			}
		}
		
		if (agregar) {
			return "Poción agregada correctamente";
		} else {
			return "Inventario lleno";
		}
	}
	
	public int recibirDanno(int danno) {
		return hp-danno;
	}
	
	public String botiquin() {
		boolean botiquin = false;
		for (String mochila : mochila) {
			if (mochila == "botiquin") {
				botiquin = true;
			}
		}
		
		if (botiquin) {
			hp += 10;
		} else {
			return "lo siento, pero no tienes ninguna poción de botiquín";
		}
		
		return "te has curado";
	}
}
