package br.com.decioazevedo;

import java.util.ArrayList;

public class PalavrasContadas {

	private String palavra;
	private Integer contagem;
	private Integer total;

	public PalavrasContadas() {
	}

	public PalavrasContadas(String palavra, Integer contagem, Integer total) {
		super();
		this.palavra = palavra;
		this.contagem = contagem;
		this.total = total;
	}

	public ArrayList<PalavrasContadas> contaPalavrasRepetidas(String frase) {

		
		
		String[] palavras = frase.trim().split("\\s+");

		ArrayList<PalavrasContadas> palavrasContadas = new ArrayList<PalavrasContadas>();

		Integer totalDePalavras = 0;

		for (String palavra : palavras) {
			if (contaElementoListArray(palavrasContadas, palavra) == 0) {
				PalavrasContadas palavraContada = new PalavrasContadas();
				palavraContada.setPalavra(palavra);
				palavraContada.setContagem(contaElementoArray(palavras, palavra));

				totalDePalavras += palavraContada.getContagem();
				palavraContada.setTotal(totalDePalavras);

				palavrasContadas.add(palavraContada);

			}
		}

		return palavrasContadas;
	}

	private static int contaElementoListArray(ArrayList<PalavrasContadas> palavras, String palavra) {
		int contador = 0;
		if (palavras != null) {
			for (PalavrasContadas item : palavras) {
				if (item != null && item.getPalavra().equals(palavra)) {
					contador++;
				}
			}
		}
		return contador;
	}

	private static int contaElementoArray(String[] palavras, Object valorProcurado) {
		int contador = 0;
		if (palavras != null) {
			for (Object item : palavras) {
				if (item != null && item.equals(valorProcurado)) {
					contador++;
				}
			}
		}
		return contador;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public Integer getContagem() {
		return contagem;
	}

	public void setContagem(Integer contagem) {
		this.contagem = contagem;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
}
