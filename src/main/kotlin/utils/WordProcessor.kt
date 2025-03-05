package utils

object WordProcessor {

    fun formatResponse(chatGptResponse: String): String {
        // For example, remove newlines/spaces and ensure everything is comma-separated with no trailing commas
        return chatGptResponse
            .replace("\\s+".toRegex(), "") // Remove all whitespaces
            .replace(",+", ",") // collapse multiple commas
            .trim(',')
    }
}