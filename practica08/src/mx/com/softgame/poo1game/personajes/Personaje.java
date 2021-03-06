/*
Nombre: Leonardo García Nieves
Hora de inicio: 7:40 a.m.
Hora de finalización: 11:03 a.m.
*/
package mx.com.softgame.poo1game.personajes;
public class Personaje{
	private String nombre;
	private int vida;
	public Personaje (String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
	}
	public Personaje (String nombre){
		this(nombre, 3);
	}
	public String getNombre(){
		return nombre;
	}
	public int getVida(){
		return vida;
	}
	public boolean setVida(int vida){
		if  (vida >= 0 && vida <= 100){
			this.vida = vida;
			return true;
		} else{
			return false;
		}
	}
	public void setNombre(String nombre){
		if (nombre.length() > 3 && nombre.length() < 10){
			this.nombre = nombre;
		}
	}
	public String getDetalle(){
		return nombre + "\t" + vida;
	}
	public void decVida(){
		decVida(1);
	}
	public void decVida(int resta){
		if ((vida - resta)>0) {
			vida = vida - resta;
		}
	}
}