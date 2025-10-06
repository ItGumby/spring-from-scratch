package io.github.itgumby;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class JPAExampleTest {

    @Disabled
    @Test
    public void shouldFetchRecordFromTable() {
        Meet meet = new Meet(); // how???
        Assertions.assertEquals(meet.getName(), "Liberty Bell");
    }
}