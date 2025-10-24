package main.kotlin.com.genverse.core

/** 11️⃣ Generic Class to Wrap API Responses */
sealed class ApiResponse<T>(
    val data: T? = null,
    val error: String? = null
) {
    class Success<T>(data: T) : ApiResponse<T>(data)
    class Error<T>(error: String) : ApiResponse<T>(error = error)
}
