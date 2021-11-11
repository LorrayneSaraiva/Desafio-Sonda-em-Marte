import java.util.Scanner; //biblioteca para usar a classe Scanner

public class Main {
	
	
	public static void main(String[] args) {
		
		//instancia do objeto sonda para a classe Sonda
		Sonda sonda = new Sonda(); 
		
		//instancia do objeto input para a classe Scanner
		Scanner input = new Scanner(System.in);
		
		//declarando a variável que irá "encontrar" a posição 4 da String strPosicaoInicial
		int posicaoIniDirecao = 4;

		
		//Coordenadas
		System.out.println("Informe a dimensão do planalto que a sonda irá pousar - Exemplo: 5 5");
		//Entrada de dados da String de coordenada
		String strCampo = input.nextLine();
		
		//Conversão das dimensões do campo(String) para array
		String[] arrCampo = strCampo.split(" ");
		
		//Converte as dimensões x e y do campo para Inteiros
		int coordenada_x = Integer.parseInt(arrCampo[0]);
		int coordenada_y = Integer.parseInt(arrCampo[1]);
		
		//Instância dos objetos relacionados a dimensão para o método set do objeto correspondente 
		sonda.setcoordenada_x(coordenada_x);
		sonda.setcoordenada_y(coordenada_y);
			
		//Posicao Inicial
		System.out.println("Informe as coordenadas da Sonda, sendo X, Y e N(norte),S(sul), E(East/Leste) ou W(Weste/Oeste) - Exemplo: 1 2 N");
		
		//Laço de repetição para corrigir a entrada de dados caso esteja incorreta
		boolean pontoscorretos = false;
		while (pontoscorretos != true) {
             //Entrada da String da Posição Inicial da Sonda
			 String strPosicaoInicial = input.nextLine();
			 //Conversão da Posição Inicial da Sonda (String) para Array
			 String[] arrPosicaoInicial = strPosicaoInicial.split(" ");
			 
			 //Conversão das posições iniciais para Inteiro
			 int xInicial = Integer.parseInt(arrPosicaoInicial[0]);
			 int yInicial = Integer.parseInt(arrPosicaoInicial[1]);
			 char direcao = strPosicaoInicial.charAt(posicaoIniDirecao);
			 
			 //Instância dos objetos relacionados a posição inicial para o método set do objeto correspondente
			 sonda.setDirecao(direcao);
			 sonda.setxInicial(xInicial);
			 sonda.setyInicial(yInicial);
			 
			 //estruturas de seleção para corrigir possíveis erros na entrada de dados
			 if ((xInicial > coordenada_x) || (yInicial > coordenada_y) || (xInicial > coordenada_x && yInicial > coordenada_y ) ) {
				  System.out.println("A coordenadas estão fora do limite do campo ou a direção está incorreta! Digite novamente...");
				  pontoscorretos = false;
			    } 
			 
			 else if ((direcao != 'N') && (direcao != 'S') && (direcao != 'W') && (direcao != 'E')) {
			     System.out.println("A coordenadas estão fora do limite do campo ou a direção está incorreta! Digite novamente...");
			     pontoscorretos = false;
			     
			   }
			  else 
				  pontoscorretos = true;
		}
			
		//Instrucoes
		System.out.println("Faça os movimentos da Sonda - Exemplo: LMLMLMLMM");
		System.out.println("M - Mover");
		System.out.println("L - Left(esquerda");
		System.out.println("R - Right(direita)");
		
		//entrada da String de movimentos da Sonda
		String strInstrucoes = input.nextLine();
		
		sonda.mover(strInstrucoes);
		
		System.out.println("Coordenada atual da Sonda: " + sonda.xacumulador + "(X)" + sonda.yacumulador + "(Y)" + sonda.direcao);
		System.out.println();
		
		//Estrutura que tentei fazer antes da saída de dados, para que corrigisse os erros de entrada de dados mas que não consegui concluir
		
		//for (int i=0; i<strInstrucoes.length(); i++) {
			   //ch = strInstrucoes.charAt(i);
			   
	    //boolean movimentosCorretos = false;
		//while (movimentosCorretos != true)
				   
			   //if ((ch != 'R') && (ch != 'L') && (ch != 'M')) 
				   //System.out.println("Apenas as letras M (mover), L (Left) e R (Right) são permitidas! Digite novamente...");	   
			   //else 
				   //movimentosCorretos = true;
	    //}
		
		
	}
}
