package javaPrimerosPasos;

public class tipoVariables 
{
	public static void main(String[] args) 
	{
		int edad = 21;
		System.out.println(edad);
		
		edad = 18;
		System.out.println(edad);
		
		System.out.println("Mi edad es: " + edad);
		
		double sueldo;
		sueldo = 140000.54;
		double mitadSueldo = sueldo / 2;
		
		System.out.println("Mi sueldo es: " + sueldo);
		System.out.println("La mitad de mi sueldo es: " + mitadSueldo);
		
		// For convert one type to another we can use cast like c#
		
		long numLargo = 122222222222222L; // The L at the end is 100% required
		short numCorto = 21212;
		byte numDiminuto = 15;
		float numCortoConComa = 12.5F; // The F at the end is 100% required
		
		char caracter = 'a';
		caracter = 70; // This use the id of the ASCII table
		caracter = 86 - 30; // This will make the subtraction and then use the id in the ASCII table
		
		System.out.println("La letra es: " + caracter);
		
		String oracion = "Hola mundo";
		
		System.out.println(oracion);
	}
}
