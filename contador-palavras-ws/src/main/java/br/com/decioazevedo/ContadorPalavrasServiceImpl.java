package br.com.decioazevedo;

import java.util.ArrayList;
import javax.jws.WebService;

@WebService
public class ContadorPalavrasServiceImpl {
	public ArrayList<PalavrasContadas> ContarPalavras(String frase) {
		return new PalavrasContadas().contaPalavrasRepetidas(frase);
	}
}