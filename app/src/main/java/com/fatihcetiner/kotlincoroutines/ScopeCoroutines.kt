package com.fatihcetiner.kotlincoroutines

import kotlinx.coroutines.*

fun main(){

    runBlocking {

        launch {
            delay(5000)
            println("Run Blocking")
        }

        coroutineScope {
            launch {
                delay(3000)
                println("Coroutine Scope")
            }
        }
    }

}