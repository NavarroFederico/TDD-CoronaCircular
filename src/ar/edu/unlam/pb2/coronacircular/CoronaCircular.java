package ar.edu.unlam.pb2.coronacircular;

public class CoronaCircular {

	private Integer radioInterior;
	private Integer radioExterior;

	private Circulo circuloInterior;
	private Circulo circuloExterior;
	public CoronaCircular(Integer radioInterior, Integer radioExterior) {
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
	}

	public Integer getRadioInterior() {
		// TODO Auto-generated method stub
		return this.radioInterior;
	}

	public Integer getRadioExterior() {
		// TODO Auto-generated method stub
		return this.radioExterior;
	}

	public Double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*(this.getRadioInterior() +this.getRadioExterior());
	}

	public Double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*(Math.pow(this.getRadioExterior(),2)-Math.pow(this.getRadioInterior(),2));
	}

}
