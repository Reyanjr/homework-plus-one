package Классы

class `Task 2` {
    class LibraryBook(val isbn: String, val title: String, val author: String) {
        fun getBookDetails(): String {
            return "ISBN: $isbn, Название: $title, Автор: $author"
        }
    }

    fun main() {
        val book = LibraryBook("978-5-389-11111-1", "Преступление и наказание", "Фёдор Достоевский")
        println(book.getBookDetails())
    }

}