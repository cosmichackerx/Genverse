package main.kotlin.com.genverse.core

/** 1️⃣ Basic Generic Function */
fun <T> showItem(item: T) {
    println("Item: $item")
}

/** 2️⃣ Multiple Type Parameters */
fun <K, V> makePair(key: K, value: V): Pair<K, V> {
    return Pair(key, value)
}

/** 3️⃣ Type-Constrained Generic Function */
fun <T : Number> addNumbers(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

/** 4️⃣ Generic Function with Multiple Constraints */
fun <T> operate(item: T) where T : Number, T : Comparable<T> {
    println("Operating on number: $item (Comparable & Numeric)")
}

/** 5️⃣ Reified Generic Function (Runtime Type Check) */
inline fun <reified T> isOfType(value: Any): Boolean {
    return value is T
}
