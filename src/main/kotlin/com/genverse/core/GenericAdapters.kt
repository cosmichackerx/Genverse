package main.kotlin.com.genverse.core

/** 12️⃣ Generic Adapter (like a simplified RecyclerView Adapter) */
class GenericAdapter<T>(
    private val items: List<T>,
    private val bind: (T) -> Unit
) {
    fun bindAll() {
        println("🔧 Binding all items...")
        items.forEach { bind(it) }
    }
}
