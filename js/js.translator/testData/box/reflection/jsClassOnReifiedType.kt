// DONT_TARGET_EXACT_BACKEND: JS_IR
// DONT_TARGET_EXACT_BACKEND: JS_IR_ES6
// EXPECTED_REACHABLE_NODES: 1318
package foo

@Suppress("DEPRECATION_ERROR")
inline fun <reified T : Any> foo(): JsClass<T> {
    val T = 1
    return jsClass<T>()
}

@Suppress("DEPRECATION_ERROR")
fun box(): String {
    check(jsClass<A>(), foo<A>())
    check(jsClass<B>(), foo<B>())
    check(jsClass<O>(), foo<O>())
    check(jsClass<E>(), foo<E>())

    return "OK"
}
