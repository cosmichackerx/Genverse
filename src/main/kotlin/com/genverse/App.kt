package main.kotlin.com.genverse
// main/kotlin/com/genverse/core
import main.kotlin.com.genverse.core.*

/**
 * Welcome to Genverse 🌌
 * A showcase project demonstrating all types of Kotlin generics
 * from basics to reified, constraints, extensions, adapters, and more.
 *
 * Author: Muhammad Arslan
 * Created: 2025
 */
fun main() {

    println("🚀 Welcome to GENVERSE — The Kotlin Generic Universe 🌌\n")

    // 1️⃣ Basic Generic Function
    showItem("Hello, Kotlin Generics!")
    showItem(2025)

    // 2️⃣ Multiple Type Parameters
    val pair = makePair("Name", "Arslan")
    println("Created Pair: $pair")

    // 3️⃣ Type-Constrained Function
    val sum = addNumbers(10, 20)
    println("Sum of Numbers: $sum")

    // 4️⃣ Multiple Constraints
    operate(99)

    // 5️⃣ Reified Generic Function
    println(isOfType<String>("Genverse"))
    println(isOfType<Int>("Genverse"))

    // 6️⃣ Extension Generic Function
    val fruits = listOf("Apple", "Banana", "Cherry")
    println("Second fruit: ${fruits.secondOrNull()}")

    // 7️⃣ Recursive Generic
    println("Max value: ${maxOfTwo(45, 12)}")

    // 8️⃣ Generic Return Collection
    val singleList = singletonList("Galaxy")
    println("Singleton List: $singleList")

    // 9️⃣ Higher-Order Generic
    val doubled = applyTwice(5) { it * 2 }
    println("Value after applying twice: $doubled")

    // 🔟 Repository Generic
    val repo = GenericRepository<String>()
    repo.add("Arslan")
    println("From Repository: ${repo.getAll()}")

    // 11️⃣ Generic Class Example
    val response = ApiResponse.Success(data = "Data fetched successfully!")
    println("API Response: ${response.data}")

    // 12️⃣ Generic Adapter Simulation
    val adapter = GenericAdapter(listOf("Earth", "Mars", "Venus")) { item ->
        println("Binding planet: $item")
    }
    adapter.bindAll()

    // 13️⃣ Generic Transformation
    val result = transform(10) { it * it }
    println("Transformed Result: $result")

    println("\n✨ End of Genverse demonstration ✨")
}
