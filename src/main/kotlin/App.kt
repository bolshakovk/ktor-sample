import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.*
import io.ktor.client.features.get
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import java.net.HttpURLConnection
import java.net.URL




suspend fun main() {
    val client = HttpClient(CIO)
    val URL = URL("https://www.nytimes.com/")
    val response: HttpResponse = client.request("https://www.nytimes.com/"){
        method = HttpMethod.Get
    }
    val response: HttpResponse = client.get("https://www.nytimes.com/")
    client.close()

}
class App {
}