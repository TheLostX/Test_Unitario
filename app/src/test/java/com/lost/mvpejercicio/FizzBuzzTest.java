package com.lost.mvpejercicio;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz SUT;

    @Before
    public void setup(){

        SUT = new FizzBuzz();
    }

    @Test
    public void dadoQueTengoUnUnoCuandoConviertoElValorEntoncesDevuelveUno(){
        String valor = SUT.convert(1);
        assertThat(valor).isNotNull();
    }

    @Test
    public void dadoQueTengoUnTresCuandoConviertoElValorEntoncesDevuelveFizz(){
        String valor = SUT.convert(3);
        assertThat(valor).isEqualTo("Fizz");
    }

    @Test
    public void dadoQueTengoUnCincoCuandoConviertoElValorEntoncesDevuelveBuzz(){
        String valor = SUT.convert(5);
        assertThat(valor).isEqualTo("Buzz");
    }

    @Test
    public void dadoQueTengoUnSeisCuandoConviertoElValorEntoncesDevuelveFizz(){
        String valor = SUT.convert(6);
        assertThat(valor).isEqualTo("Fizz");
    }

    @Test
    public void dadoQueTengoUnQuinceCuandoConviertoElValorEntoncesDevuelveFizzBuzz(){
        String valor = SUT.convert(15);
        assertThat(valor).isEqualTo("FizzBuzz");
    }


}
