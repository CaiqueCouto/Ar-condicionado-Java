import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		
		Arcondicionado lg = new Arcondicionado("LG", "LG001", 150, 36000);
		try (Scanner leia = new Scanner(System.in)) {
			int op;
			for(;;) {
				System.out.println("1. Ligar/Desligar");
				System.out.println("2. Mudar Operação");
				System.out.println("3. Aumentar Temperatura");
				System.out.println("4. Diminuir Temperatura");
				System.out.println("5. Mostrar Status");
				System.out.println("6. Ligar o Desumidificador");
				System.out.println("7. Sair");
				System.out.println("8. Ligar Aquecedor");
				System.out.println("Digite a opção: ");
				op = leia.nextInt();
				switch(op) {
				case 1:
					lg.ligarDesligar();
					break;
				case 2:
					lg.mudarOp();
					break;
				case 3:
					lg.aumentarT();
					break;
				case 4:
					lg.diminuirT();
					break;
				case 5:
					lg.status();
					break;
				case 6: 
					lg.mudarop();
					break;
				
				case 7:
					System.exit(0);
					break;
				case 8:
					lg.mudarOP();
				default:
					System.out.println("Opção Invalida!");			
				}			
			}
		}
	}
}

