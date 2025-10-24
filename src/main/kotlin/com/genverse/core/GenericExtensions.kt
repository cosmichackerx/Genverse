package main.kotlin.com.genverse.core

/** 6️⃣ Extension Generic Function */
fun <T> List<T>.secondOrNull(): T? =
    if (size >= 2) this[1] else null

/** 7️⃣ Recursive Generic Function */
fun <T : Comparable<T>> maxOfTwo(a: T, b: T): T = if (a > b) a else b
