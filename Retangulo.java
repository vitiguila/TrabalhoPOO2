package matematica;

public class Retangulo {
	 private static String nome = "Oscar Niemeyer";
	 private static int idade = 104;
	 static double ladoH;
	 static double ladoV;
	 
	 public static void definir_lados(double valorH, double valorV) {
		 if (valorH > 0 && valorV > 0) {
		 ladoH = valorH;
		 ladoV = valorV;
		 }
		 else {
			 System.out.println("Valores invalidos");
		 }
	 }
	 
	 public static double area() {
		 return (ladoH * ladoV);
	 }
	 public static double perimetro() {
		 return ((ladoH*2)+(ladoV*2));
	 }
	 
	 private static void exibir_dados_pessoais(){
	 System.out.println( nome );
	 System.out.println( idade + " anos");
	 } 
}
