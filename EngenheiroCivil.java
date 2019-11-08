package especialista;

import matematica.Retangulo;

public class EngenheiroCivil {
	 private static String nome = "Oscar Niemeyer";
	 private static int idade = 104;
	 
	 private static void exibir_dados_pessoais()
	 {
	 System.out.println( nome );
	 System.out.println( idade + " anos");
	 } 
	 public static void main(String[] args) {
		 exibir_dados_pessoais();
		 Retangulo.definir_lados(4.7, 8.2);
		 System.out.println(Retangulo.perimetro());
		 System.out.println( Retangulo.area());
	}

}
