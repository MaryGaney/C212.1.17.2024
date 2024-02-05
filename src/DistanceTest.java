import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {

    @org.junit.jupiter.api.Test
    void distance() {

        assertEquals(2.828, Distance.distance(2.3,3.5,4.3,5.5), 0.001);
    }
}