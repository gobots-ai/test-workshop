package ai.gobots.testworkshop

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class TestControllerUnitTest {

    private val testService = mock(TestService::class.java)
    private val testController =  TestController(testService)

    @Test
    fun test1() {
        `when`(testService.oi()).thenReturn("oi")

        val ret = testController.test("samuel")
        assertThat(ret, `is`("oisamuel"))
        verify(testService, times(1)).oi()
    }
}