package com.xth.ejemplo;

class equipos{
	char t1, t2, t3, t4;
	int r1, r2;
	char tf1, tf2;
	// t1 vs t2 ----> r1
	// t3 vs t4 ----> r2

	void showmenu() {

						System.out.println("Partidos");
						System.out.println(" 1. Espana vs Brasil");
						System.out.println(" 2. Rusia vs Holanda");
						System.out.println("Elige una opcion: (q para irse): ");
			}
}


public class semis{
	
	public static void main(String[] args) 
		throws java.io.IOException {

			equipos partido = new equipos();
			int g = '3',e = '1',p = '0';

			
			System.out.println("\n");
			System.out.println("/////////////////////////////////////////////////////");
			System.out.println("/////////////////////////////////////////////////////");
			System.out.println("//////// SIMULADOR MUNDIAL  FASE ALFA V.0.1 /////////");
			System.out.println("/////////////////////////////////////////////////////");
			System.out.println("/////////////////////////////////////////////////////");
			System.out.println("\n");

			System.out.println("/////////////////////////////////////////////////////");
			System.out.println("//////////////////// REGLAS /////////////////////////");
			System.out.println("/////////////////////////////////////////////////////");
			System.out.println("////////////// ???????????????????? /////////////////");
			System.out.println("/////////////////////////////////////////////////////");
			System.out.println("\n");
			System.out.println("/////////////////////////////////////////////////////");
			System.out.println("//////////////////// GRUPOS /////////////////////////");
			System.out.println("/////////////////////////////////////////////////////");
			System.out.println("/////// ?????????????????????????????????????? //////");
			System.out.println("/////////////////////////////////////////////////////");
			System.out.println("\n");


			partido.showmenu();

			partido.r1  = (char) System.in.read();

								if (partido.r1 == g){
									System.out.println("t1 ha ganado, pasa a la final");
									equipos fi = new equipos();
									return;
									}

								else if (partido.r1 == p){
									System.out.println("t2 ha ganado, pasa a la final");
									equipos fi2 = new equipos();
									}

			

			partido.r2	= (char) System.in.read();

								if (partido.r2 == g){
									System.out.println("t3 ha ganado, pasa a la final");
									equipos fi3 = new equipos();
									}

								else if (partido.r2 == p){ 
									System.out.println("t4 ha ganado, pasa a la final");
									equipos fi4 = new equipos();
									}


			System.out.println("esto siempre2");

	}
}
