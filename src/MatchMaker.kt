fun main() {
    var x = 0
    var y = 0
    while (x < 5) {
//        y = x - y         // Output: 00 11 21 32 42

//        y = y + x         // Output: 00 11 23 36 410

//        y = y + 3         // Output: 03 15 27 39 411
//        if (y > 4) y = y - 1

//        x = x + 2         // Output: 22 57
//        y = y + x

        if (y < 5) {      // Output: 03 26 39 412
            x = x + 1
            if (y < 3) x = x - 1
        }
        y = y + 3

        print("$x$y ")
        x++
    }
}