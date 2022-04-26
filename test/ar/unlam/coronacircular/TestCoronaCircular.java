package ar.unlam.coronacircular;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCoronaCircular {

	@Test
	public void queSePuedaCrearunaCoronaCircularConUnRadioExternoYUnRadioInterno() {
		Double radioInterno = 3.0;
		Double radioExterno = 8.0;
		
		CoronaCircular corona = new CoronaCircular (radioInterno, radioExterno);
		
		assertNotNull(corona);
	}
	
	@Test
	public void queSePuedaCrearUnCirculoDeLaCorona() {
		Double radio = 3.0;
		
		Circulo circuloNuevo = new Circulo (radio);
		
		assertNotNull(circuloNuevo);
		
	}
	
	@Test
	public void queSePuedaCrearUnaCoronaCircularConDosCirculos() {
		Double radio = 3.0;
		Double radioExterior = 8.0; 
		
		Circulo circuloInterior = new Circulo (radio);
		Circulo circuloExterior = new Circulo (radioExterior);
		
		CoronaCircular coronaCircular = new CoronaCircular (circuloInterior, circuloExterior);
		
		assertNotNull(coronaCircular);
		
	}
	
	@Test
	public void queSePuedaObtenerLaSuperficieDeLaCoronaCirucularConRadio() {
		Double radioInterno = 3.0;
		Double radioExterno = 8.0;
		
		CoronaCircular corona = new CoronaCircular (radioInterno, radioExterno);
		
		corona.calcularLaSuperficie();
		Double superficieActual;
		
		Double ve = Math.PI*Math.pow(radioExterno,2)-Math.PI*Math.pow(radioInterno,2);
		Double vo = corona.getSuperficieActual();
		assertEquals(ve, vo, 0.01);
	}
	
	@Test
	public void queSePuedaObtenerLaSuperficieDeLaCoronaCirucularConCirculos() {
		Double radio = 3.0;
		Double radioExterior = 8.0; 
		
		Circulo circuloInterior = new Circulo (radio);
		Circulo circuloExterior = new Circulo (radioExterior);
		
		CoronaCircular coronaCircular = new CoronaCircular (circuloInterior, circuloExterior);
		
		coronaCircular.calcularLaSuperficie();
		Double superficieActual;
		
		Double ve = Math.PI*Math.pow(radioExterior,2)-Math.PI*Math.pow(radio,2);
		Double vo = coronaCircular.getSuperficieActual();
		assertEquals(ve, vo, 0.01);
	}

}
