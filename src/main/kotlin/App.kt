import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import org.json.JSONObject
import java.net.URL

suspend fun main() {
    val client = HttpClient(CIO)
    val urlString = URL("https://api.openweathermap.org/data/2.5/weather?q=Moscow&appid=34a4801037bcd9496bca871a0688a1d6")
    val response: HttpResponse = client.get(urlString)
    println(response.readText())

    val jsObject = JSONObject(response.readText())

    println("Город: ${jsObject.getString("name")}, \nТемпература: ${jsObject.getJSONArray("weather")}")

    client.close()
}
class App {
}