class Song(val title: String, val artist: String) {
    fun play() {
        println("Playing $title by $artist")
    }
    fun stop() {
        println("Stopping $title by $artist")
    }
}

fun main() {
    val song1 = Song("Song1", "Artist1")
    val song2 = Song("Song2", "Artist2")
    val song3 = Song("Song3", "Artist3")

    song2.play()
    song2.stop()
}
