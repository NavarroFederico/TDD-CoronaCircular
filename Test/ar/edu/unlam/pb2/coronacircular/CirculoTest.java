package ar.edu.unlam.pb2.coronacircular;

import org.junit.Assert;
import org.junit.Test;

public class CirculoTest {

	private static final Integer RADIO = 1;

	@Test
	public void alCrearUnCirculoSeInicializaConSuRadio() {
		Circulo circulo = cuandoCreoUnCirculo(RADIO);
		elCirculoTieneRadio(circulo);
	}

	private void elCirculoTieneRadio(Circulo circulo) {
		Assert.assertEquals(RADIO, circulo.getRadio());
	}

	private Circulo cuandoCreoUnCirculo(int i) {
		return new Circulo(RADIO);
	}
}
