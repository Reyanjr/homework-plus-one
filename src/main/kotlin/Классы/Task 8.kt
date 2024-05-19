package Классы

class `Task 8` {
    class Playlist(val name: String, val genre: String, val songs: Array<String>) {
        fun getPlaylistDetails(): String {
            val songsList = songs.joinToString("\n")
            return "Playlist: $name\nGenre: $genre\nSongs:\n$songsList"
        }
    }

    // Пример использования:
    fun main() {
        val songs = arrayOf("Song 1", "Song 2", "Song 3")
        val playlist = Playlist("My Favorite Playlist", "Pop", songs)
        println(playlist.getPlaylistDetails())
    }

}