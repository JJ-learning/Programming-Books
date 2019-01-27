// Definimos la clase principal
class programa{
	
	public static void main(String args[])
		throws java.io.IOException{		     // Para poder obtener una entrada de datos

			char entrada;					 // Variables
			menu m1 = new menu();			// Creando Objetos
			creditos c1 = new creditos();
			piedrapapeltijeras juego1 = new piedrapapeltijeras();
			

			m1.menu();						// Invoca al objeto "m1"
			entrada = (char) System.in.read();	

			switch(entrada){
				
				case '1':

					c1.creditos();			// Invocacion
					break;
				
				case '2':

					juego1.piedrapapeltijeras();		//invocacion
					break;
			}
		}
}



class menu{
	void menu(){

			System.out.println("***********************************************");
			System.out.println("*                                             *");
			System.out.println("*                  MENU                       *");
			System.out.println("*     ---------------------------------       *");
			System.out.println("*     1. Info                                 *");
			System.out.println("*     2. Juego PiedraPapelTijeras             *");
			System.out.println("*     3. ----                                 *");
			System.out.println("*     4. ----                                 *");
			System.out.println("*                                             *");
			System.out.println("***********************************************");
	}
}

class creditos{
	void creditos(){

			System.out.println("***********************************************");
			System.out.println("*                                             *");
			System.out.println("*                  CREDITOS                   *");
			System.out.println("*     ---------------------------------       *");
			System.out.println("*     Aplicacion: ...............             *");
			System.out.println("*     Version: 0.1                            *");
			System.out.println("*     Autor: Xexuew                           *");
			System.out.println("*     e-mail: xexuew@gmail.com                *");
			System.out.println("*     Sitio web: http://xexuew.site90.com     *");
			System.out.println("*                                             *");
			System.out.println("***********************************************");

	}
}

class piedrapapeltijeras{
	void piedrapapeltijeras(){
			int a = 0; //Papel
			int b = 1; //Tijeras
			int c = 2; //Piedra
			int opcion2;

			int random = (int)(Math.random()*3);
					
			System.out.println("***********************************************");
			System.out.println("*                                             *");
			System.out.println("*  Elija :Papel = 0, Tijeras = 1, Piedra = 2  *");
			System.out.println("*                                             *");
			System.out.println("***********************************************");
			System.out.println(random);       //hay que quitarlo

					/*
					if (random == a ){ //La Maquina ha sacado Papel
					
						
								opcion2 = (int) System.in.read();

								if (opcion2 == 0){		//papel

									System.out.println("Has elegido papel");
									System.out.println("La Maquina ha elegido papel");
									System.out.println("Hay empate");


								}else if (opcion2 == 1){ //tijeras

									System.out.println("Has elegido tijeras");
									System.out.println("La Maquina ha elegido papel");
									System.out.println("Has ganado");

								}else if (opcion2 == 2){ //piedra

									System.out.println("Has elegido piedra");
									System.out.println("La Maquina ha elegido papel");
									System.out.println("Has perdido");
								}
						
					} else if (random == b){ //La maquina ha sacado tijeras
								
								opcion2 = (int) System.in.read();

								if (opcion2 == 0){ // Papel

									System.out.println("Has elegido papel");
									System.out.println("La Maquina ha elegido tijeras");
									System.out.println("Has perdido");

								}else if (opcion2 == 1){ //tijeras

									System.out.println("Has elegido tijeras");
									System.out.println("La Maquina ha elegido tijeras");
									System.out.println("Hay empate");

								}else if (opcion2 == 2){ //piedra

									System.out.println("Has elegido piedra");
									System.out.println("La Maquina ha elegido tijeras");
									System.out.println("Has ganado");
								}


					}else if (random == c){ // La maquina ha sacado piedra
								
								opcion2 = (int) System.in.read();

								if (opcion2 == 0){  // Papel

									System.out.println("Has elegido papel");
									System.out.println("La Maquina ha elegido piedra");
									System.out.println("Has ganado");

							    }else if (opcion2 == 1){ //tijeras

									System.out.println("Has elegido tijeras");
									System.out.println("La Maquina ha elegido piedra");
									System.out.println("Has perdio");

								}else if (opcion2 == 2){ //piedra

									System.out.println("Has elegido piedra");
									System.out.println("La Maquina ha elegido piedra");
									System.out.println("Hay empate");
								}
					}else {
						System.out.println("Introduce un valor correcto");
					}
								
							default:

								System.out.print("Opcion no encontrada");
							

							*/		
	}
}	