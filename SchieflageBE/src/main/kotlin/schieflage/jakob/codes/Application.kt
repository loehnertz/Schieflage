package schieflage.jakob.codes

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import schieflage.jakob.codes.plugins.configureHTTP
import schieflage.jakob.codes.plugins.configureRouting
import schieflage.jakob.codes.plugins.configureSecurity
import schieflage.jakob.codes.plugins.configureSockets

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module).start(wait = true)
}

fun Application.module() {
    configureSecurity()
    configureHTTP()
    configureSockets()
    configureRouting()
}
