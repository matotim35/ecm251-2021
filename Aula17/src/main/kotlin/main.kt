fun main() {
    val r = khttp.get("https://viacep.com.br/ws/09080510/json/")
    println(r.statusCode)
// 200
    println(r.headers["Content-Type"])
// "application/json; charset=utf-8"
    println(r.text)
// """{"type": "User"..."""
    println(r.jsonObject["logradouro"])
// org.json.JSONObject
}