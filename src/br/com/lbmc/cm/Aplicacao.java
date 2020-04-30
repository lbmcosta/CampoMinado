package br.com.lbmc.cm;

import br.com.lbmc.cm.modelo.Tabuleiro;
import br.com.lbmc.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(7, 7, 7);
		
		new TabuleiroConsole(tabuleiro);

	}

}
