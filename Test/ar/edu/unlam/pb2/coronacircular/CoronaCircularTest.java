package ar.edu.unlam.pb2.coronacircular;

import org.junit.Assert;
import org.junit.Test;

public class CoronaCircularTest {

	private static final double AREA_ESPERADA = 9.42;
	private static final double PERIMETRO_ESPERADO = 18.84;
	private static final Integer RADIO_EXTERIOR = 2;
	private static final Integer RADIO_INTERIOR = 1;

	// preparacion
	// ejecucion
	// contrastacion

	@Test
	public void alCrearUnaCoronaCircularSeInicializaConSuRadioInteriorYExterior() {
		CoronaCircular corona = cuandoCreoUnaCoronaCircular(RADIO_INTERIOR, RADIO_EXTERIOR);
		laCoronaCircularTieneRadioInteriorYExterior(corona);
	}

	private CoronaCircular cuandoCreoUnaCoronaCircular(Integer interior, Integer exterior) {

		return new CoronaCircular(interior, exterior);
	}

	private void laCoronaCircularTieneRadioInteriorYExterior(CoronaCircular corona) {
		// TODO Auto-generated method stub
		Assert.assertEquals(RADIO_INTERIOR, corona.getRadioInterior());
		Assert.assertEquals(RADIO_EXTERIOR, corona.getRadioExterior());
	}

	@Test
	public void alCrearUnaCoronaCircularConRadioInterior_1_YExterior_2_SuPerimetroEs_18con84() {
		CoronaCircular corona = dadoQueExisteCoronaCircular(RADIO_INTERIOR, RADIO_EXTERIOR);
		Double perimetroObtenido=cuandoObtengoElPerimetro(corona);
		entoncesSuPerimetroEs(perimetroObtenido, PERIMETRO_ESPERADO);
	}

	private CoronaCircular dadoQueExisteCoronaCircular(Integer radioInterior, Integer radioExterior) {
		// TODO Auto-generated method stub
		return new CoronaCircular(radioInterior, radioExterior);
	}

	private void entoncesSuPerimetroEs(Double perimetroObtenido, Double perimetro) {
		// TODO Auto-generated method stub
		Assert.assertEquals(perimetroObtenido, PERIMETRO_ESPERADO,0.01);
		
	}

	private Double cuandoObtengoElPerimetro(CoronaCircular corona) {
		return corona.getPerimetro();

	}
	@Test
	public void alCrearUnaCoronaCircularConRadioInterior_1_YExterior_2_SuAreaEs_X() {
		CoronaCircular corona = dadoQueExisteCoronaCircular(RADIO_INTERIOR, RADIO_EXTERIOR);
		Double areaObtenida=cuandoObtengoElArea(corona);
		entoncesSuAreaEs(areaObtenida, AREA_ESPERADA);
	}

	private void entoncesSuAreaEs(Double areaObtenida, double areaEsperada) {
		// TODO Auto-generated method stub
		Assert.assertEquals(areaObtenida, areaEsperada, 0.01);
	}

	private Double cuandoObtengoElArea(CoronaCircular corona) {
		// TODO Auto-generated method stub
		return corona.getArea();
	}

}
