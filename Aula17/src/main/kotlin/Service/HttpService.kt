package Service

import org.json.JSONObject

class HttpService {
    companion object {
        fun getJson(url: String): JSONObject {
            return khttp.get(url).jsonObject
        }
    }
}