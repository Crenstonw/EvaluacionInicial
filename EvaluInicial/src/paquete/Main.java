package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner escaner = new Scanner(System.in);
		String aux;
		
		System.out.println("Indica el nombre del primer personaje:");
		aux = escaner.nextLine();
		Personaje personaje1 = new Personaje(aux);
		
		System.out.println("indica el nombre del segundo personaje:");
		aux = escaner.nextLine();
		Personaje personaje2 = new Personaje(aux);
		
		
		Batalla batalla = new Batalla(personaje1, personaje2);
		System.out.println("Estos son los stats de " + batalla.jugador1.nombre + ":");
		System.out.println(batalla.jugador1.toString());
		
		System.out.println("Estos son los stats de " + batalla.jugador2.nombre + ":");
		System.out.println(batalla.jugador2.toString());
		
		
		
		while (batalla.jugador1.hp > 0 && batalla.jugador2.hp > 0) {
			int dannoJugador1 = batalla.golpear(personaje1);
			int dannoJugador2 = batalla.golpear(personaje2);
			
			
			System.out.println(batalla.jugador1.nombre + " hace " + dannoJugador1 + " de daño");
			batalla.jugador2.hp -= batalla.golpear(personaje1);
			System.out.println(batalla.jugador2.nombre + " tiene " + batalla.jugador2.hp + " de vida");
			
			System.out.println(batalla.jugador2.nombre + " hace " + dannoJugador2 + " de daño");
			batalla.jugador1.hp -= batalla.golpear(personaje2);
			System.out.println(batalla.jugador1.nombre + " tiene " + batalla.jugador1.hp + " de vida");
		}
	}

}
