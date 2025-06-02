import java.io.File

fun main() {


    val file = File("example5.txt").also {
        if (!it.exists()) {
            it.createNewFile()
            it.writeText("Test")
        }
    }

    file.readLines().forEach {
        println(it)
    }

    val bufferedReader = file.bufferedReader()
    var line: String? = null
    bufferedReader.use {
        while (true) {
            println(line)
        }
    }

}