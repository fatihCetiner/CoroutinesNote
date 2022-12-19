package com.fatihcetiner.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Light Weightness
        /*

        GlobalScope.launch {
            repeat(100000){
                launch {
                    println("Android")
                }
            }
        }


         */

        // Scope
        // Global Scope, runBlocking, CoroutineScope

        /*
        // runBlocking
        println("Run blocking start")
        runBlocking {
            launch {
                delay(5000)
                println("Run Blocking")
            }
        }
        println("Run Blocking end")

         */

        /*
        println("Global Scope Start")
        GlobalScope.launch {
            delay(5000)
            println("Global Scope")
        }
        println("Global Scope end")

         */

        /*
        // Context
        // CoroutineScope
        println("Coroutine Scope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("Coroutine Scope")
        }
        println("Coroutine Scope end")

        // -> Global Scope da tüm uglumada çalışırken Coroutine Scope da hangi theread de çalışacağı belirlenir


         */




    }
}