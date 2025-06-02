import kotlin.reflect.KClass

class YourClass(val name: String) {
    fun yourFun(){
        println(name)
    }
}

fun main() {

    val kcls: KClass<YourClass> = YourClass::class
    val cls: Class<YourClass> = YourClass::class.java // for java

    val func = YourClass::yourFun

    func.name // you can just use it like this

}