package ar.edu.unlam.pb2;

public class Disco {
	private Double radioInterior;
	private Double radioExterior;
	private Double perimetroInterior;
	private Double perimetroExterior;
	private Double superficie;

	public Disco(Double radioInterior, Double radioExterior){
		this.radioInterior=radioInterior;
		this.radioExterior=radioExterior;
		this.perimetroInterior=calculoPerimetroInterior();
		this.perimetroExterior=calculoPerimetroExterior();
		this.superficie=calculoSuperficie();
	}
	
	public Double calculoPerimetroInterior(){
		Double perimetroInterior = this.radioInterior * 2 * 3.14;
		return perimetroInterior;
	}
	
	public Double calculoPerimetroExterior(){
		Double perimetroExterior = this.radioExterior * 2 * 3.14;
		return perimetroExterior;
	}
	
	public Double calculoSuperficie(){
		Double superficie = this.radioExterior * this.radioExterior * 3.14 - this.radioInterior * this.radioInterior * 3.14;
		return superficie;
	}

	public void nuevoRadioInterior(Double radioInterior){
		this.radioInterior=radioInterior;
		this.perimetroInterior=calculoPerimetroInterior();
	}
	
	public void nuevoRadioExterior(Double radioExterior){
		this.radioExterior=radioExterior;
		this.perimetroExterior=calculoPerimetroExterior();
	}
	
	public Double getRadioInterior() {
		return radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}
	
	public Double getPerimetroInterior() {
		return perimetroInterior;
	}

	public Double getPerimetroExterior() {
		return perimetroExterior;
	}

	public Double getSuperficie() {
		return superficie;
	}
	
}
