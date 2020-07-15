package ai.gobots.testworkshop

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean

@SpringBootTest
class TestControllerIntegrationTest {

    @Autowired
    private lateinit var testController: TestController

    @MockBean
    private lateinit var testService: TestService


    @BeforeEach
    fun setup() {
        `when`(testService.oi()).thenReturn("oi")

    }

    @AfterEach
    fun teardown() {

    }

    @Test
    fun `whenever ddd`() {

        val ret = testController.test("oi")

        assertThat(ret, `is`("oioi"))
        verify(testService, times(1)).oi()
    }
}