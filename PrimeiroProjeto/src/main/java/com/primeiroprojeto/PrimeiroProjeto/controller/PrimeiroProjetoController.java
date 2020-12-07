package com.primeiroprojeto.PrimeiroProjeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PrimeiroProjetoController {
	
	@GetMapping("/habilidade1")
	public String habilidade1() {
		return "A principal habilidade que tenho aprendido é o trabalho em equipe."
				+ "Acredito que aprender a trabalhar em equipe é algo muito"
				+ "importante em todos os aspectos da vida, pois pra quase tudo"
				+ "é necessário saber trabalhar com outras pessoas e respeitar"
				+ "o próximo. Sinto que tenho melhorado bastante essa habilidade.";
	}
	
	@GetMapping("/habilidade2")
	public String habilidade2() {
		return "Outra habilidade que temos usado bastante é a atenção aos detalhes."
				+ "Essa habilidade é extremamente importante para um desenvolvedor,"
				+ " pois é necessário atenção na realização dos códigos para"
				+ "que não hajam erros.";
				
	}
	
	@GetMapping("/mentalidade1")
	public String mentalidade1() {
		return "Uma mentalidade muito importante é a persistência. Como é um "
				+ "assunto novo, é necessário muita persistência para que sejam"
				+ " aprendidos todo os conteúdos. E mesmo com os erros, não se"
				+ " pode desistir para que o objetivo seja alcançado.";
				
	}
	
	@GetMapping("/mentalidade2")
	public String mentalidade2() {
		return "A segunda mentalidade é a de crescimento. Aprender algo novo "
				+ "abre muitos pensamentos para o crescimento pessoal. "
				+ "Quanto mais aprendemos, mais temos crescimento."; 
	}

}
