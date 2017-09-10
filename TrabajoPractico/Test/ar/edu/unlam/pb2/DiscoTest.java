package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscoTest {

	@Test
	public void queCalculaPerimetroInterior(){
		Disco miDisco = new Disco(3.0,5.0);
		Double valorActual = miDisco.calculoPerimetroInterior();
		assertEquals(18.84, valorActual, 0.1);
	}

	@Test
	public void queCalculaPerimetroExterior(){
		Disco miDisco = new Disco(3.0,5.0);
		Double valorActual = miDisco.calculoPerimetroExterior();
		assertEquals(31.4, valorActual, 0.1);
	}
	
	@Test
	public void queCalculaSuperficie(){
		Disco miDisco = new Disco(3.0,5.0);
		Double valorActual = miDisco.calculoSuperficie();
		assertEquals(50.24, valorActual, 0.1);
	}
	
	@Test 
		public void queMuestraRadioInterior(){
		Disco miDisco = new Disco(3.0,5.0);
		Double valorActual = miDisco.getRadioInterior();
		assertEquals(3.0, valorActual, 0.1);
	}
	
	@Test 
		public void queMuestraPerimetroInterior(){
		Disco miDisco = new Disco(3.0,5.0);
		Double valorActual = miDisco.getPerimetroInterior();
		assertEquals(18.84, valorActual, 0.1);
	}
	
	@Test 
		public void queMuestraRadioExterior(){
		Disco miDisco = new Disco(3.0,5.0);
		Double valorActual = miDisco.getRadioExterior();
		assertEquals(5.0, valorActual, 0.1);
	}
	
	@Test 
		public void queMuestraPerimetroExterior(){
		Disco miDisco = new Disco(3.0,5.0);
		Double valorActual = miDisco.getPerimetroExterior();
		assertEquals(31.4, valorActual, 0.1);
	}
	
	@Test
		public void queMuestraSuperficie(){
		Disco miDisco = new Disco(3.0,5.0);
		Double valorActual= miDisco.getSuperficie();
		assertEquals(50.24, valorActual, 0.1);
	}
	
	@Test
		public void quePideNuevoRadioInterior(){
		Disco miDisco = new Disco(3.0,5.0);
		miDisco.nuevoRadioInterior(2.0);
		Double valorActual= miDisco.getRadioInterior();
		assertEquals(2.0, valorActual, 0.1);
	}
	
	@Test
		public void quePideNuevoRadioExterior(){
		Disco miDisco = new Disco(3.0,5.0);
		miDisco.nuevoRadioExterior(4.0);
		Double valorActual= miDisco.getRadioExterior();
		assertEquals(4.0, valorActual, 0.1);
	}


}
