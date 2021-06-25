package by.itechartgroup.exercises.task52;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class HeavenlyBodyTest {

    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem;
    private static Set<HeavenlyBody> planets;

    @BeforeEach
    public void setUp() {
        solarSystem = new HashMap<>();
        planets = new HashSet<>();
    }

    @Test
    void whenAnyHeavenlyBodyIsCreated_ThenItsInstanceShouldBeHeavenlyBody() {
        Planet earth = new Planet("Earth", 10);
        DwarfPlanet pluto = new DwarfPlanet("Pluto", 10);
        Moon moon = new Moon("Moon", 10);
        assertTrue(earth instanceof HeavenlyBody);
        assertTrue(pluto instanceof HeavenlyBody);
        assertTrue(moon instanceof HeavenlyBody);
    }

    @Test
    void whenMoonIsCreated_ThenItsEnumTypeShouldBeMoon() {
        HeavenlyBody moon = new Moon("Moon", 10);
        assertEquals(moon.getKey().getBodyType(), HeavenlyBody.BodyType.MOON);
    }

    @Test
    void whenPlanetIsCreated_ThenItsEnumTypeShouldBePlanet() {
        HeavenlyBody planet = new Planet("Earth", 10);
        assertEquals(planet.getKey().getBodyType(), HeavenlyBody.BodyType.PLANET);
    }

    @Test
    void whenDwarfPlanetIsCreated_ThenItsEnumTypeShouldBeDwarfPlanet() {
        HeavenlyBody dwarfPlanet = new DwarfPlanet("Pluto", 10);
        assertEquals(dwarfPlanet.getKey().getBodyType(), HeavenlyBody.BodyType.DWARF_PLANET);
    }

    @Test
    void whenPlanetIsNotInTheSet_ThenResultOfAddingShouldBeTrue() {
        Planet planet = new Planet("Planet", 10);
        assertTrue(planets.add(planet));
    }

    @Test
    void whenPlanetIsAlreadyInTheSet_ThenResultOfAddingShouldBeFalse() {
        Planet planet = new Planet("Planet", 10);
        planets.add(planet);
        assertFalse(planets.add(planet));
    }

    @Test
    void whenGivenPlanetsHaveSameNamesAndOrbitalPeriod_ThenResultShouldBeTrue() {
        Moon moon1 = new Moon("Moon", 10);
        Moon moon2 = new Moon("Moon", 10);
        assertTrue(moon1.equals(moon2));
    }

    @Test
    void whenGivenPlanetsHaveDifferentNamesOrOrbitalPeriod_ThenResultShouldBeFalse() {
        Planet planet1 = new Planet("Earth", 10);
        Planet planet2 = new Planet("Mars", 10);
        assertFalse(planet1.equals(planet2));
    }

}