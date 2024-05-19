package Классы

class `Task 1` {
    class Movie(val title: String, val director: String, val releaseYear: Int) {
        fun getMovieInfo(): String {
            return "Фильм \"$title\", режиссер $director, год выпуска $releaseYear"
        }
    }


    fun main() {
        val movie = Movie("Побег из Шоушенка", "Фрэнк Дарабонт", 1994)
        println(movie.getMovieInfo())
    }
}