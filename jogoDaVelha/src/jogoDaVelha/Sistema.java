package jogoDaVelha;

import java.util.Scanner;
import models.Tabuleiro;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Tabuleiro tabuleiro01 = new Tabuleiro();
		do {
			tabuleiro01.montarTabuleiro();
			tabuleiro01.jogada1();
			tabuleiro01.jogada2();
			tabuleiro01.jogada3();
			tabuleiro01.jogada4();
			tabuleiro01.jogada5();
			tabuleiro01.jogada6();
			tabuleiro01.jogada7();
			tabuleiro01.jogada8();
			tabuleiro01.jogada9();
			System.out.println("Fim de jogo - Velha");
			tabuleiro01.limparTela();
		} while (true);
	}

}
