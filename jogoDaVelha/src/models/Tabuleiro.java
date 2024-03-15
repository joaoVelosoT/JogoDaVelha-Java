package models;

import java.util.Scanner;

public class Tabuleiro {

	Scanner sc = new Scanner(System.in);
	private String tabuleiro[][] = new String[3][3];

	public String[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(String[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public void montarTabuleiro() {
		System.out.println("JOGO DA VELHA");
		System.out.println("-------------------------");
		System.out.println("   0  1  2");

		for (int i = 0; i < this.tabuleiro.length; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < this.tabuleiro[1].length; j++) {
				this.tabuleiro[i][j] = "[_]";
				System.out.print(this.tabuleiro[i][j]);
			}
			System.out.println("");
		}
	}

	public void mostrarTabuleiro() {
		System.out.println("   0  1  2");
		for (int i = 0; i < this.tabuleiro.length; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < this.tabuleiro[1].length; j++) {
				System.out.print(this.tabuleiro[i][j]);
			}
			System.out.println("");
		}
	}

	public void limparTela() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

	public void verificarJogada() {

		// LINHA

		if (this.tabuleiro[0][0] == "[X]" && this.tabuleiro[0][1] == "[X]" && this.tabuleiro[0][2] == "[X]") {
			System.out.println("X GANHOU");
			System.out.println("");
			montarTabuleiro();
			sc.nextLine();
			// limparTela();
		}
		if (this.tabuleiro[1][0] == "[X]" && this.tabuleiro[1][1] == "[X]" && this.tabuleiro[1][2] == "[X]") {
			System.out.println("X GANHOU");
			System.out.println("");
			montarTabuleiro();
			sc.nextLine();
			// limparTela();
		}
		if (this.tabuleiro[2][0] == "[X]" && this.tabuleiro[2][1] == "[X]" && this.tabuleiro[2][2] == "[X]") {
			System.out.println("X GANHOU");
			System.out.println("");
			montarTabuleiro();
			sc.nextLine();
			// limparTela();
		}

		// COLUNA

		if (this.tabuleiro[0][0] == "[X]" && this.tabuleiro[1][0] == "[X]" && this.tabuleiro[2][0] == "[X]") {
			System.out.println("X GANHOU");
			System.out.println("");
			montarTabuleiro();
			sc.nextLine();
			// limparTela();
		}

		if (this.tabuleiro[0][1] == "[X]" && this.tabuleiro[1][1] == "[X]" && this.tabuleiro[2][1] == "[X]") {
			System.out.println("X GANHOU");
			System.out.println("");
			montarTabuleiro();
			sc.nextLine();
			// limparTela();
		}

		if (this.tabuleiro[0][2] == "[X]" && this.tabuleiro[1][2] == "[X]" && this.tabuleiro[2][2] == "[X]") {
			System.out.println("X GANHOU");
			System.out.println("");
			montarTabuleiro();
			sc.nextLine();
			// limparTela();
		}

		// DIAGONAL

		if (this.tabuleiro[0][0] == "[X]" && this.tabuleiro[1][1] == "[X]" && this.tabuleiro[2][2] == "[X]") {
			System.out.println("X GANHOU");
			System.out.println("");
			montarTabuleiro();
			sc.nextLine();
			// limparTela();
		}

		if (this.tabuleiro[0][2] == "[X]" && this.tabuleiro[1][1] == "[X]" && this.tabuleiro[2][0] == "[X]") {
			System.out.println("X GANHOU");
			System.out.println("");
			montarTabuleiro();
			sc.nextLine();
			// limparTela();
		}

		// LINHA

		if (this.tabuleiro[0][0] == "[O]" && this.tabuleiro[0][1] == "[O]" && this.tabuleiro[0][2] == "[O]") {
			System.out.println("BOLINHA GANHOU");
			System.out.println("");
			montarTabuleiro();
			sc.nextLine();
			// limparTela();
		}
		if (this.tabuleiro[1][0] == "[O]" && this.tabuleiro[1][1] == "[O]" && this.tabuleiro[1][2] == "[O]") {
			System.out.println("BOLINHA GANHOU");
			System.out.println("");
			montarTabuleiro();
			sc.nextLine();
			// limparTela();
		}
		if (this.tabuleiro[2][0] == "[O]" && this.tabuleiro[2][1] == "[O]" && this.tabuleiro[2][2] == "[O]") {
			System.out.println("BOLINHA GANHOU");
			System.out.println("");
			montarTabuleiro();
			sc.nextLine();
			// limparTela();
		}

		// COLUNA

		if (this.tabuleiro[0][0] == "[O]" && this.tabuleiro[1][0] == "[O]" && this.tabuleiro[2][0] == "[O]") {
			System.out.println("BOLINHA GANHOU");
			System.out.println("");
			montarTabuleiro();
			sc.nextLine();
			// limparTela();
		}

		if (this.tabuleiro[0][1] == "[O]" && this.tabuleiro[1][1] == "[O]" && this.tabuleiro[2][1] == "[O]") {
			System.out.println("BOLINHA GANHOU");
			System.out.println("");
			montarTabuleiro();
			sc.nextLine();
			// limparTela();
		}

		if (this.tabuleiro[0][2] == "[O]" && this.tabuleiro[1][2] == "[O]" && this.tabuleiro[2][2] == "[O]") {
			System.out.println("BOLINHA GANHOU");
			System.out.println("");
			montarTabuleiro();
			sc.nextLine();
			// limparTela();
		}

		// DIAGONAL

		if (this.tabuleiro[0][0] == "[O]" && this.tabuleiro[1][1] == "[O]" && this.tabuleiro[2][2] == "[O]") {
			System.out.println("BOLINHA GANHOU");
			System.out.println("");
			montarTabuleiro();
			sc.nextLine();
			// limparTela();
		}

		if (this.tabuleiro[0][2] == "[O]" && this.tabuleiro[1][1] == "[O]" && this.tabuleiro[2][0] == "[O]") {
			System.out.println("BOLINHA GANHOU");
			System.out.println("");
			montarTabuleiro();
			sc.nextLine();
			// limparTela();
		}

	}

	public void jogada1() {

		boolean verificar = false;
		boolean verificarLinha = false;
		boolean verificarColuna = false;
		int linha = 0;
		int coluna = 0;

		while (verificar == false) {
			while (verificarLinha == false) {
				System.out.println("Digite a linha");
				try {
					linha = sc.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("Digite a Coluna");
				try {
					coluna = sc.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("[_]")) {
				this.tabuleiro[linha][coluna] = "[X]";
				mostrarTabuleiro();
				verificarJogada();
				verificar = true;
			} else {
				System.out.println("Esse campo ja foi usado");
			}

		}
	}

	public void jogada2() {

		boolean verificar = false;

		while (verificar == false) {
			boolean verificarLinha = false;
			boolean verificarColuna = false;
			int linha = 0;
			int coluna = 0;

			while (verificarLinha == false) {
				System.out.println("Digite a linha");
				try {
					linha = sc.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("Digite a Coluna");
				try {
					coluna = sc.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("[_]")) {
				this.tabuleiro[linha][coluna] = "[O]";
				mostrarTabuleiro();
				verificarJogada();
				verificar = true;
			} else {
				System.out.println("Esse campo ja foi usado");

				sc.nextLine();

			}

		}
	}

	public void jogada3() {

		boolean verificar = false;

		while (verificar == false) {
			boolean verificarLinha = false;
			boolean verificarColuna = false;
			int linha = 0;
			int coluna = 0;

			while (verificarLinha == false) {
				System.out.println("Digite a linha");
				try {
					linha = sc.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("Digite a Coluna");
				try {
					coluna = sc.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("[_]")) {
				this.tabuleiro[linha][coluna] = "[X]";
				mostrarTabuleiro();
				verificarJogada();
				verificar = true;
			} else {
				System.out.println("Esse campo ja foi usado");

				sc.nextLine();

			}

		}
	}

	public void jogada4() {

		boolean verificar = false;

		while (verificar == false) {
			boolean verificarLinha = false;
			boolean verificarColuna = false;
			int linha = 0;
			int coluna = 0;

			while (verificarLinha == false) {
				System.out.println("Digite a linha");
				try {
					linha = sc.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("Digite a Coluna");
				try {
					coluna = sc.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("[_]")) {
				this.tabuleiro[linha][coluna] = "[O]";
				mostrarTabuleiro();
				verificarJogada();
				verificar = true;
			} else {
				System.out.println("Esse campo ja foi usado");

				sc.nextLine();

			}

		}
	}

	public void jogada5() {

		boolean verificar = false;

		while (verificar == false) {
			boolean verificarLinha = false;
			boolean verificarColuna = false;
			int linha = 0;
			int coluna = 0;

			while (verificarLinha == false) {
				System.out.println("Digite a linha");
				try {
					linha = sc.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("Digite a Coluna");
				try {
					coluna = sc.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("[_]")) {
				this.tabuleiro[linha][coluna] = "[X]";
				mostrarTabuleiro();
				verificarJogada();
				verificar = true;
			} else {
				System.out.println("Esse campo ja foi usado");

				sc.nextLine();

			}

		}
	}

	public void jogada6() {

		boolean verificar = false;

		while (verificar == false) {
			boolean verificarLinha = false;
			boolean verificarColuna = false;
			int linha = 0;
			int coluna = 0;

			while (verificarLinha == false) {
				System.out.println("Digite a linha");
				try {
					linha = sc.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("Digite a Coluna");
				try {
					coluna = sc.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("[_]")) {
				this.tabuleiro[linha][coluna] = "[O]";
				mostrarTabuleiro();
				verificarJogada();
				verificar = true;
			} else {
				System.out.println("Esse campo ja foi usado");

				sc.nextLine();

			}

		}
	}

	public void jogada7() {

		boolean verificar = false;

		while (verificar == false) {
			boolean verificarLinha = false;
			boolean verificarColuna = false;
			int linha = 0;
			int coluna = 0;

			while (verificarLinha == false) {
				System.out.println("Digite a linha");
				try {
					linha = sc.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("Digite a Coluna");
				try {
					coluna = sc.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("[_]")) {
				this.tabuleiro[linha][coluna] = "[X]";
				mostrarTabuleiro();
				verificarJogada();
				verificar = true;
			} else {
				System.out.println("Esse campo ja foi usado");

				sc.nextLine();

			}

		}
	}

	public void jogada8() {

		boolean verificar = false;

		while (verificar == false) {
			boolean verificarLinha = false;
			boolean verificarColuna = false;
			int linha = 0;
			int coluna = 0;

			while (verificarLinha == false) {
				System.out.println("Digite a linha");
				try {
					linha = sc.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("Digite a Coluna");
				try {
					coluna = sc.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("[_]")) {
				this.tabuleiro[linha][coluna] = "[O]";
				mostrarTabuleiro();
				verificarJogada();
				verificar = true;
			} else {
				System.out.println("Esse campo ja foi usado");

				sc.nextLine();

			}

		}
	}

	public void jogada9() {

		boolean verificar = false;

		while (verificar == false) {
			boolean verificarLinha = false;
			boolean verificarColuna = false;
			int linha = 0;
			int coluna = 0;

			while (verificarLinha == false) {
				System.out.println("Digite a linha");
				try {
					linha = sc.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("Digite a Coluna");
				try {
					coluna = sc.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("Digite um valor de 0 a 2");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.err.println("Digite um valor numerico");
					sc.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("[_]")) {
				this.tabuleiro[linha][coluna] = "[X]";
				mostrarTabuleiro();
				verificar = true;
				verificarJogada();
			} else {
				System.out.println("Esse campo ja foi usado");

				sc.nextLine();

			}

		}
	}

}