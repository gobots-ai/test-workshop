package ai.gobots.testworkshop

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class TestController(
    private val testService: TestService
) {

    @GetMapping
    fun test(@RequestBody text: String) = testService.oi() + text

}