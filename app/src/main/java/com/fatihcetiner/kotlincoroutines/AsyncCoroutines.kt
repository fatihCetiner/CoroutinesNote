package com.fatihcetiner.kotlincoroutines

import kotlinx.coroutines.*

fun main(){

    var userName = ""
    var userAge = 0

    runBlocking {

        val downloadedName = async {
            downloadName()
        }
        val downloadedAge = async {
            downloadAge()
        }

        userName = downloadedName.await()
        userAge = downloadedAge.await()

        println("${userName} ${userAge}")

    }

}

suspend fun downloadName(): String{
    delay(2000)
    val username = "Fatih"
    println("Username download")
    return username
}

suspend fun downloadAge(): Int{
    delay(4000)
    val userAge = 21
    println("userAge download")
    return userAge

}