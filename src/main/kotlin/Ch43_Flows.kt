import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flowOf

fun simpleFlow() = flow {
    for (i in 1 .. 3) {
        emit(i)
    }
}

fun simpleFlow2() = flowOf(4, 5, 6)

fun simpleFlow3() = listOf(7, 8, 9).asFlow()

@OptIn(DelicateCoroutinesApi::class)
fun main() {

    runBlocking {

        simpleFlow().collect {
            println(it)
        }
        simpleFlow2().collect {
            println(it)
        }
        simpleFlow3().collect {
            println(it)
        }
    }


}