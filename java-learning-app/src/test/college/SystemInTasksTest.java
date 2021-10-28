package test.college;

import org.junit.jupiter.api.Test;
import tasks.college.SystemInTasks;

import static org.junit.jupiter.api.Assertions.*;

class SystemInTasksTest {

    @Test
    void taskFourTest() {
//        given
        SystemInTasks systemInTasks = new SystemInTasks();
        int sum;

//        when
        sum = systemInTasks.getABSubstringSum("babablsab");

//        then
        assertEquals(3, sum);
        assertNotEquals(4, sum);

    }
}