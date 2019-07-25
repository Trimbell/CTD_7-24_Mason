fun main() {
    var wantToPlay = true
    println("Welcome to Rock Paper Scissors!")

    while (wantToPlay) {
        displayWelcomeMessage()
        val userInput = readLine()?.toIntOrNull() ?: 0
        val computerInput = (1..3).random()
        playGame(userInput, computerInput)
        wantToPlay = askPlayAgain()
    }
    println("Goodbye!")
}

// Explain how to use the program
fun displayWelcomeMessage() {
    println("Please enter one of the following numbers:")
    println("1 - Rock")
    println("2 - Paper")
    println("3 - Scissors")
}

// Determine winner of game
fun playGame(userChoice: Int, computerChoice: Int) {
    println("You chose ${userChoice.convertRPS()} and computer chose ${computerChoice.convertRPS()}.")
    val result = when (userChoice) {
        computerChoice -> "You tied!"
        1 -> if (computerChoice == 2) "You lost!" else "You won!"
        2 -> if (computerChoice == 3) "You lost!" else "You won!"
        3 -> if (computerChoice == 1) "You lost!" else "You won!"
        else -> "ERROR - INVALID ENTRY"
    }
    println(result)
}

// Converts 1, 2, or 3 inputs to "rock", "paper", "scissors" strings
fun Int.convertRPS(): String {
    return when (this) {
        1 -> "rock"
        2 -> "paper"
        3 -> "scissors"
        else -> "invalid"
    }
}

// Ask user if they would like to play again
fun askPlayAgain(): Boolean {
    println("Would you like to play again? [Y/n] ")
    val userInput = readLine()?.toLowerCase()

    return if (userInput.isNullOrBlank()) true
    else userInput.startsWith('y')
}

// 1. How to play
// 2. Get user input
// 3. Get computer input
// 4. Actually play game/compare inputs
// 5. Display results
// 6. Want to play again?