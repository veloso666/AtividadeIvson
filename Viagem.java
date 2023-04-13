package entities;

import java.util.Date;

public class Viagem {

	private Integer model;//atributos de viagem  
	private String transporte;
	private String desclocamento;
	private Integer quantidade;
	
	public Viagem() {
	}
	
	public Viagem(Integer model,String transporte, String desclocamento, Integer quantidade) {//construtor 
		this.model = model;
		this.transporte = transporte;
		this.desclocamento = desclocamento;
		this.quantidade = quantidade;
	}


	public Integer getModel() {
		return model;
	}

	public void setModel(Integer model) {
		this.model = model;
	}

	public String getTransporte() {
		return transporte;
	}

	public void setTransporte(String transporte) {
		this.transporte = transporte;
	}

	public String getDesclocamento() {
		return desclocamento;
	}

	public void setDesclocamento(String desclocamento) {
		this.desclocamento = desclocamento;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public double total(Integer model, Integer quantidade) {//operação para retornar o valor
		double num = 0.0;
		if(model == 1) {
			num = 1000 * quantidade; 
		}
		else if(model == 2) {
			num = 100 * quantidade;
		}
		else if(model == 3) {
			num = 500 * quantidade;
		}
		return num;
	}
	 
}
