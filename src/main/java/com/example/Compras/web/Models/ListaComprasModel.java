package com.example.Compras.web.Models;

public class ListaComprasModel {

	private int id;
	private String nomeCompras;
	
	public ListaComprasModel(int id, String nomelist) {
   
		this.id = id;
		this.nomeCompras = nomelist;
	}

	public int getId() {
			
		return id;
	}
	
	public void setId(int id) {
		  
		this.id = id;
	}

	public String getNomeCompras() {
			
		return nomeCompras;	
	}
	
	public void setNomeCompras(String nomelist) {
		  
		this.nomeCompras = nomelist;
	}
}

