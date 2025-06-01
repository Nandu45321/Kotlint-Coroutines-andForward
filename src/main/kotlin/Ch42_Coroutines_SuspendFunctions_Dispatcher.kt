import kotlinx.coroutines.*


@OptIn(DelicateCoroutinesApi::class)
fun main() {



    val job = runBlocking {
        launch {
            delay(1000L) // api calling
            println("Api fetched")

            println("Thread: ${Thread.currentThread()}")
        }

        println("After launch")

        launch(Dispatchers.IO) {
            delay(1000L) // api calling
            println("Api fetched")

            println("IO Thread: ${Thread.currentThread()}")
        }



        val job1 = launch(Dispatchers.IO) {
            delay(1000L) // api calling
            println("Api 1 fetched")
        }
        job1.cancel()

        val job2 = async(Dispatchers.IO) {
            delay(1000L) // api calling
            println("Async Api fetched")
            5
        }

        val data = job2.await()
        println(data)

        suspend fun test(){
            delay(1000L)
        }



    }
}