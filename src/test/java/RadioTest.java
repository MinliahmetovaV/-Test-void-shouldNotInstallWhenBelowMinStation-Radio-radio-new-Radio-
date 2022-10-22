import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void shouldNotInstallWhenBelowMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0,radio.getCurrentStation());
    }
    @Test
    void shouldInstallWhenMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
    }
}
