import java.util.Scanner;

/***
 * Eduardo Alvaez

 *
 */
public class TicketAcceso 
{


	public static void main(String[] args) 
	{

		//variables 
		String tipo_usuario="";
		int edad =0;
		boolean isMayor=false; //la edad mayoria
		boolean cuentaActiva=false; 

		// Creamos Scanner para recibir información del usuario
		Scanner entrada = new Scanner(System.in);


		// Solicitamos el nombre
		System.out.println("Ingresa tu nombre:");
		String nombre = entrada.nextLine();

		System.out.println("Bienvenido : "+nombre);
		//System.exit(1);

		// ========================================
		// PARTE 1: SWITCH
		// Identificar el tipo de usuario
		// ========================================

		// Solicitamos el tipo de usuario
		System.out.println("Selecciona tu tipo de usuario:");
		System.out.println("1. Administrador");
		System.out.println("2. Editor");
		System.out.println("3. Usuario");

		tipo_usuario = entrada.nextLine();
		switch(tipo_usuario) 
		{
		case "1" :
		{
			tipo_usuario="Administrador";
			break;
		}
		case "2" :
		{
			tipo_usuario="Editor";
			break;
		}
		case "3" :
		{
			tipo_usuario="Usuario";
			break;
		}
		default :
		{

			tipo_usuario="Acceso denegado";
			System.out.println("acceso denegado , cerrando aplicacion");
			System.exit(1);
		}
		}

		System.out.println("tu usuario es "+tipo_usuario);
		// System.exit(1);

		// Solicitamos la edad
		System.out.println("Ingresa tu edad:");
		edad = entrada.nextInt();

		System.out.println("Tu edad es "+edad);

		if(edad >= 18) 
		{
			isMayor=true;
		}

		// Preguntamos si la cuenta está activa
		System.out.println("¿Tu cuenta está activa?");
		System.out.println("1. Sí");
		System.out.println("2. No");


		int opcionCuenta = entrada.nextInt();
		if(opcionCuenta== 1) 
		{
			cuentaActiva=true;
		}



		// ========================================
		// PARTE 2: IF / ELSE
		// Validar acceso
		// ========================================
		
		if (isMayor && cuentaActiva) 
		{


			System.out.println("Acceso permitido.");


		} else 
		{


			System.out.println("Acceso denegado.");
		}

		
		// ========================================
		// PARTE 3: OPERADOR ||
		// Detectar situaciones que requieren revisión
		// ========================================

		if (!isMayor || !cuentaActiva) 
		{

			System.out.println(
					"Contacta al administrador para revisar tu acceso. --> "+nombre
					);
		}




		// Cerramos Scanner
		entrada.close();
	}
}
