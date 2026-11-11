import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    @Test
    void punchIn() {
        Employee emp1 = new Employee();

        emp1.punchIn(8);

        //assertEquals(8,emp1.startTime);
    }

    @Test
    void punchOut() {
        Employee emp2 = new Employee();

        emp2.punchIn(8);
        emp2.punchOut(12);

        assertEquals(4, emp2.getRegularHours());

    }
}