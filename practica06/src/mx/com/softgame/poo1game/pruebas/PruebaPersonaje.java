package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.*;
public class PruebaPersonaje{
	public static void main(String[] args){
		Personaje per01 = new Personaje("Aline");
		per01.setEdad(200);
		Personaje per02 = new Personaje("Erick");
		per02.setEdad(10);
		Personaje per03 = new Personaje("Alan");
		per03.setEdad(1);
		Personaje per04 = new Personaje("Lesly");
		per04.setEdad(-10);
		Personaje per05 = new Personaje("Brian");
		per05.setEdad(500);
		System.out.println(per01.getDetalle());
		System.out.println(per02.getDetalle());
		System.out.println(per03.getDetalle());
		System.out.println(per04.getDetalle());
		System.out.println(per05.getDetalle());
		Personaje per06 = per05;
		Personaje per07 = per04;
		Personaje per08 = per03;
		Personaje per09 = per02;
		Personaje per10 = per01;
		per06.setNombre("Jorge Eduardo");
		per08.setNombre("Yosselin");
		per10.setNombre("Ana");
		int rand1 = (int)(Math.random()*100);
		int rand2 = (int)(Math.random()*100);
		per07.setEdad(rand1);
		per09.setEdad(rand2);
		System.out.println("================");
		System.out.println(per01.getDetalle());
		System.out.println(per02.getDetalle());
		System.out.println(per03.getDetalle());
		System.out.println(per04.getDetalle());
		System.out.println(per05.getDetalle());
	}
}