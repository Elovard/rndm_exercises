package by.itechartgroup.exercises.task47;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void whenSavedValuesOfPlayerAreEmpty_ThenResultShouldBeFalse() {
        Player player = new Player("player", 1, 1);
        ArrayList<String> values = new ArrayList<>();
        assertFalse(player.read(values));
    }

    @Test
    void whenSavedValuesPlayerAreNotEmpty_ThenResultShouldBeTrue() {
        Player player = new Player("player", 1, 1);
        assertTrue(player.read(player.write()));
    }

    @Test
    void whenPlayerIsCreated_ThenHisValuesShouldBeReturned() {
        Player player = new Player("player", 1, 1);
        assertNotEquals(player.write(), null);
    }

}