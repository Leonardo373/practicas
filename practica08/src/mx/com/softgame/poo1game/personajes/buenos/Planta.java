package mx.com.softgame.poo1game.personajes.buenos;
import mx.com.softgame.poo1game.personajes.*;
public class Planta extends Personaje{
	private char escudo;
	public char getEscudo(){
		return escudo;
	}
	public Planta(String nombre, int vida, char escudo){
		super(nombre, vida);
		this.escudo = escudo;
	}
	public Planta(String nombre, char escudo){
		this(nombre, 3, escudo);
	}
	public Planta(String nombre, int vida){
		this(nombre, vida, 'A');
	}
	public Planta(String nombre){
		this(nombre, 3, 'A');
	}
	public String getDetalle(){
		return super.getDetalle()+" "+escudo;
	}
	public void decVida(){
		if (escudo == 'A') {
			super.decVida(2);
		}else{
			super.decVida();
		}
	}
	public void decVida(int resta){
		if (escudo == 'A'){
			super.decVida(resta*2);
		}else{
			super.decVida(resta);
		}
	}
}