package com.example

data class Game(var players: MutableList<Player>){
    var imageCards = mutableListOf<String>("hello this is an image card")
    var sentenceCards = mutableListOf<SentenceCard>()
    var status = false
    var code = ""
    //var mapOfPlayers: HashMap<String, Player> //{name: PlayerObj}
    var mapOfPlayers = players.associateBy{it.name} //takes listOfPlayers and makes it a map(it is a single object within the list) {name: PlayerObj}
    var winningPlayer = "hey winner!"
    //when is game over?? -> game needs to know
    fun checkIfWinner(): Boolean{
        for(player in players){
            if(player.score == 2){
                winningPlayer = player.name
                return true
            }
        }
        return false
    }

    // start the game
    // - deal the cards
    // - initial host is the host now for the first round
    // - create the first round
    // - execute the round
    // - check if there's a winner
    // deal out cards
    // - find a new host
    // repeat


    // round
    // pick a meme
    // all players (besides host) give the host a card
    // host picks favorite
    // return a winner -> give the winner the meme or update meme count

//    fun play(){
//        //while one player hasn't hit 5 points, keep running rounds, initialize a brand new round each time
//        while(!checkIfWinner()){ //top player doesn't have 5 points
//            //select an image card for the round -> you can pass this to round, but this way is better
//            println("ROUND")
//            val selectedImageCard = imageCards.removeLast()
//            //initialize a round
//            val round = Round(selectedImageCard, sentenceCards, players)
//            //round.setAllHostToFalse()
//            round.findHost()
//            round.dealOutCardsToPlayers()
//            val submittedCards = round.playersSubmitACard() //[(PlayerObj, "sentence")]
//            val winnerOfRound = round.hostPicksWinner(submittedCards) //(PlayerObj, "sentence")
//            println("The winning card is ${winnerOfRound.second} from ${winnerOfRound.first.name}")
//            //update the winning players score
//            mapOfPlayers[winnerOfRound.first.name]!!.score++ //ASK ABOUT NULL //associateby creates a nullable map
//            println(players)
//            round.resetHost()
//
//        }
//        println("You have finished the game! ${winningPlayer} is the winner!")
        //can then return whoever won the game
//    }

}