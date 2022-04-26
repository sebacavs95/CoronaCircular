package ar.unlam.coronacircular;

public class CoronaCircular {
	
	private Double radioInferior;
	private Double radioSuperior;
	private Double superficieActual;
	private Circulo circuloInterior;
	private Circulo circuloExterior;

	public CoronaCircular(Double radioInferior, Double radioSuperior) {
		this.setRadioInferior(radioInferior);
		this.setRadioSuperior(radioSuperior);
	}

	public CoronaCircular(Circulo circuloInterior, Circulo circuloExterior) {
		this.circuloInterior = circuloInterior;
		this.circuloExterior = circuloExterior;
		this.radioInferior = circuloInterior.getRadio();
		this.radioSuperior = circuloExterior.getRadio();
	}

	public void setRadioSuperior(Double radioSuperior) {
		this.radioSuperior = radioSuperior;
		
	}

	public void setRadioInferior(Double radioInferior) {
		this.radioInferior = radioInferior;
		
	}

	public void calcularLaSuperficie() {
		superficieActual = Math.PI*Math.pow(radioSuperior,2)-Math.PI*Math.pow(radioInferior,2);
	}

	public Double getSuperficieActual() {
		return superficieActual;
	}
	

}
