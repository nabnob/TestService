package example.micronaut

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/address") // <1>
class AddressController {

    @Get// <2>
    @Produces(MediaType.TEXT_PLAIN) // <3>
    fun index() = "Hello World"
}
