package ru.fly.data

import com.fasterxml.jackson.databind.ObjectMapper

class Webhook(
    val appId: String,
    val token: String,

    ) {
    lateinit var content: WebhookContent

    fun json() : String {
        val objectMapper = ObjectMapper()
        val js = objectMapper.writeValueAsString(this.content)
        println(js)
        return js
    }


//    fun setContent(content: WebhookContent) {
//        this.content = content
//    }
//
//    fun getContent() : WebhookContent = this.content
}
