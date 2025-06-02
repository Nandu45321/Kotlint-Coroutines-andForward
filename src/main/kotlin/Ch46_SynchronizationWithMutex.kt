import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

fun main(): Unit = runBlocking {

    val mutex = Mutex()

    launch {
        mutex.withLock {
            println("shared code block")
        }

    }



}

class BankAccount(
    private var balance: Int
) {
    val mutex = Mutex()

    suspend fun deposit(amount: Int){
        mutex.withLock {
            balance += amount
        }
    }
// Basically puts a lock and removes the lock after the execution
    suspend fun withDrawl(amount: Int){
        mutex.withLock {
            balance -= amount
        }
    }
}