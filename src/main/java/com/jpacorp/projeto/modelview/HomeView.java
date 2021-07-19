package com.jpacorp.projeto.modelview;

import java.util.ArrayList;
import java.util.List;

public class HomeView {
	public String getMensagem() {
		return "SEJA BEM VINDO/A A API DO SQUAD JPA DESCOMPLICADO! INTEGRANTES: GISELE PRICILA, GUILHERME NETO, JAISOM GUSMÃO, MARCO TULIO, PEDRO LIMA.";
	}
	
	public List<String> getEndpoints() {
		var lista = new ArrayList<String>();
		
		lista.add("/contas");
		lista.add("/contas/1");
		
		lista.add("/clientes");
		lista.add("/clientes/1");
		
		return lista;
	}

}
