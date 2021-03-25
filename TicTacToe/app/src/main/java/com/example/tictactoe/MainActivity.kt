package com.example.tictactoe

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var reset = findViewById(R.id.reset_button) as Button
    }




    fun cubeClick(view: View) {
        val cubeSelected = view as Button
        var cubeID = 0
        when (cubeSelected.id) {
            R.id.first_cube -> cubeID = 1
            R.id.second_cube -> cubeID = 2
            R.id.third_cube -> cubeID = 3
            R.id.fourth_cube -> cubeID = 4
            R.id.fifth_cube -> cubeID = 5
            R.id.sixth_cube -> cubeID = 6
            R.id.seventh_cube -> cubeID = 7
            R.id.eighth_cube -> cubeID = 8
            R.id.ninth_cube -> cubeID = 9
        }
        playGame(cubeID, cubeSelected)
    }

    var firstPlayer = ArrayList<Int>()
    var secondPlayer = ArrayList<Int>()

    var activePlayer = 1

    private fun playGame(cubeID: Int, cubeSeleced: Button) {
        if (activePlayer == 1) {
            Toast.makeText(this,"Player 1",Toast.LENGTH_SHORT).show()
            cubeSeleced.setText("X")
            firstPlayer.add(cubeID)
            activePlayer = 2
        } else {
            Toast.makeText(this,"Player 2",Toast.LENGTH_SHORT).show()
            cubeSeleced.setText("O")
            secondPlayer.add(cubeID)
            activePlayer = 1
        }

        cubeSeleced.isEnabled = false
        checkWinner()
    }

    private fun checkWinner() {
        var winner = -1
        if (firstPlayer.contains(1) && firstPlayer.contains(2) && firstPlayer.contains(3)) {
            winner = 1
        }

        if (secondPlayer.contains(1) && secondPlayer.contains(2) && secondPlayer.contains(3)) {
            winner = 2
        }

        if (firstPlayer.contains(4) && firstPlayer.contains(5) && firstPlayer.contains(6)) {
            winner = 1
        }

        if (secondPlayer.contains(4) && secondPlayer.contains(5) && secondPlayer.contains(6)) {
            winner = 2
        }

        if (firstPlayer.contains(7) && firstPlayer.contains(8) && firstPlayer.contains(9)) {
            winner = 1
        }

        if (secondPlayer.contains(7) && secondPlayer.contains(8) && secondPlayer.contains(9)) {
            winner = 2
        }

        if (firstPlayer.contains(1) && firstPlayer.contains(4) && firstPlayer.contains(7)) {
            winner = 1
        }

        if (secondPlayer.contains(1) && secondPlayer.contains(4) && secondPlayer.contains(7)) {
            winner = 2
        }

        if (firstPlayer.contains(3) && firstPlayer.contains(6) && firstPlayer.contains(9)) {
            winner = 1
        }

        if (secondPlayer.contains(3) && secondPlayer.contains(6) && secondPlayer.contains(9)) {
            winner = 2
        }

        if (firstPlayer.contains(1) && firstPlayer.contains(4) && firstPlayer.contains(7)) {
            winner = 1
        }

        if (secondPlayer.contains(1) && secondPlayer.contains(4) && secondPlayer.contains(7)) {
            winner = 2
        }

        if (firstPlayer.contains(2) && firstPlayer.contains(5) && firstPlayer.contains(8)) {
            winner = 1
        }

        if (secondPlayer.contains(2) && secondPlayer.contains(5) && secondPlayer.contains(8)) {
            winner = 2
        }

        if (firstPlayer.contains(3) && firstPlayer.contains(6) && firstPlayer.contains(9)) {
            winner = 1
        }

        if (secondPlayer.contains(3) && secondPlayer.contains(6) && secondPlayer.contains(9)) {
            winner = 2
        }

        if (winner != -1) {
            if (winner == 1) {
                Toast.makeText(this, "The first player won the game", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "The second player won the game", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}
