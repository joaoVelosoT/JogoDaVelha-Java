package jogoDaVelha;

import java.util.Scanner;

import models.Tabuleiro;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Tabuleiro tabuleiro01 = new Tabuleiro();

		tabuleiro01.montarTabuleiro();
		int jogadas = 0;

		while (true) {
			jogadas++;

			tabuleiro01.jogadaTesteX();
			if (tabuleiro01.verificarJogada() == true) {
				jogadas = 0;
			}

			tabuleiro01.jogadaTesteO();
			if (tabuleiro01.verificarJogada() == true) {
				jogadas = 0;
			}

			// Verificando Velha
			if (jogadas == 4) {
				tabuleiro01.limparTela();
				System.out.println("Fim de jogo - Velha");
				jogadas = 0;
				tabuleiro01.montarTabuleiro();
				continue;
			}

		}

	}

}
