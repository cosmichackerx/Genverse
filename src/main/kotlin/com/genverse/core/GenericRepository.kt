package main.kotlin.com.genverse.core

/** Generic Repository (Simulating Database/Cache Layer) */
class GenericRepository<T> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        println("Added item: $item")
        items.add(item)
    }

    fun getAll(): List<T> = items.toList()
}
