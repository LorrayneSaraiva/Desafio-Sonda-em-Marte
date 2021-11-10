import java.util.Scanner;

public class ExplorandoMarte {
	
	
	public static void main(String[] args) {
		
		Sonda sonda = new Sonda();
		Scanner input = new Scanner(System.in);
		System.out.println("Registrar nova sonda? ");
		String strnovaSonda = input.nextLine();
		int novaSonda = Integer.parseInt(strnovaSonda);
		
		while (novaSonda != 1) {
			//int  = Integer.parseInt(strnovaSonda);
			int posicaoIniDirecao = 4;
			//Ler as coordenadas
			System.out.println("Informe a dimensão do plano cartesiano (x, y) - Ex: 5 5");
			String strCoordenada = input.nextLine(); //Ex. 5 5
			
			//Ler a posicao inicial
			System.out.println("Informe as coordenadas da Sonda, sendo X, Y e N(norte),S(sul), E(East/Leste) ou W(Weste/Oeste) - Ex. 1 2 N");
			String strPosicaoInicial = input.nextLine();// Ex. 1 2 N
			
			//Ler as instrucoes
			System.out.println("Faça os movimentos da Sonda - Ex. LMLMLMLMM");
			System.out.println("M - Mover");
			System.out.println("L - Left(esquerda");
			System.out.println("R - Right(direita)");
			String strInstrucoes = input.nextLine();// Ex.LMLM
			
			String[] arrCoordenada = strCoordenada.split(","); //coordenadas da dimensao
			String[] arrPosicaoInicial = strPosicaoInicial.split(","); //variveis das movimentacoes
			
			//Conversao das dimensoes
			int coordenada_x = Integer.parseInt(arrCoordenada[0]); // não confundir o array da coordenada com o ponto inicial
			int coordenada_y = Integer.parseInt(arrCoordenada[1]);
			
			int xInicial = Integer.parseInt(arrPosicaoInicial[0]);
			int yInicial = Integer.parseInt(arrPosicaoInicial[1]);
			
			char direcao = strPosicaoInicial.charAt(posicaoIniDirecao);
			
			
			
			System.out.println("Coordenadas atuais: " + sonda.xacumulador + "(X)" + sonda.yacumulador + "(Y)" + sonda.direcao);
			System.out.print("Deseja registrar uma nova sonda ? s/n: ");
			
			
			
			
			
		}
	   
		
		
		
	}

}
