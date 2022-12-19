package com.fatihcetiner.kotlincoroutines

import kotlinx.coroutines.*

fun main(){

    runBlocking {
        delay(2000)
        println("Run blocking")
        myFunction()
    }
}

suspend fun myFunction(){
    coroutineScope {
        delay(4000)
        println("Suspend Func")
    }
}