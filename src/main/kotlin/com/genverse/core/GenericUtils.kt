package main.kotlin.com.genverse.core

/** 8️⃣ Generic Function Returning a Generic Collection */
fun <T> singletonList(item: T): List<T> = listOf(item)

/** 9️⃣ Higher-Order Generic Function */
fun <T> applyTwice(value: T, action: (T) -> T): T = action(action(value))

/** 🔟 Generic Transformation */
fun <A, B> transform(source: A, mapper: (A) -> B): B = mapper(source)
