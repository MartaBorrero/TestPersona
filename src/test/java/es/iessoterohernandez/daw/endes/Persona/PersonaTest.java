package es.iessoterohernandez.daw.endes.Persona;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class PersonaTest {

    private Persona persona;

    @BeforeEach
    public void setUp() {
        persona = new Persona("Maria", 25, 'M', 50, 1.60);
    }

    @Test
    public void testCalcularIMC_pesoIdeal() {
        assertEquals(Persona.PESO_IDEAL, persona.calcularIMC());
    }

    @Test
    public void testCalcularIMC_bajoPeso() {
        assertEquals(Persona.INFRAPESO, persona.calcularIMC());
    }

    @Test
    public void testCalcularIMC_sobrePeso() {
        assertEquals(Persona.SOBREPESO, persona.calcularIMC());
    }

    @Test
    public void testEsMayorDeEdad_mayorDeEdad() {
        assertFalse(persona.esMayorDeEdad());
    }

    @Test
    public void testEsMayorDeEdad_menorDeEdad() {
        assertFalse(persona.esMayorDeEdad());
    }

    @Test
    public void testToString() {
        String expected = "Informacion de la persona:\n" +
                "Nombre: Maria\n" +
                "Sexo: mujer\n" +
                "Edad: 25 años\n" +
                "Peso: 50.0 kg\n" +
                "Altura: 1.6 metros\n";
        assertEquals(expected, persona.toString());
    }
}