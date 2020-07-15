package ai.gobots.testworkshop

import org.junit.jupiter.api.Test
import org.springframework.test.util.AssertionErrors.fail

class TestModelUnitTest {

    @Test
    fun `on init given three country size, should throw exception`() {
        try {
            TestModel("name", "BRL")
            fail("dsada")
        } catch (e: Exception) {}
    }

    @Test
    fun `on init given two country size, should not throw exception`() {
        TestModel("name", "BR")
    }

}