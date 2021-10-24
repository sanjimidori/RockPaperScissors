package com.sanji.rock_paper_scissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sanji.rock_paper_scissors.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        val botPick = (1..3).random()
        var botChoosen:String?
        var yourChoosen:String?
        when(botPick){
            1 -> botChoosen = "Paper"
            2 -> botChoosen = "Rock"
            else -> botChoosen = "Scissors"
        }
        bindingClass.botChooseImage.visibility = View.VISIBLE
        bindingClass.paperButton.setOnClickListener {
            yourChoosen = "Paper"
            when(botChoosen){
                "Paper" -> bindingClass.botChooseImage.setImageResource(R.drawable.paper)
                "Rock" -> bindingClass.botChooseImage.setImageResource(R.drawable.rock)
                else -> bindingClass.botChooseImage.setImageResource(R.drawable.scissors)
            }
            bindingClass.winResultText.visibility = View.INVISIBLE
            bindingClass.loseResultText.visibility = View.INVISIBLE
            bindingClass.drawResultText.visibility = View.INVISIBLE
            bindingClass.yourChooseImage.setImageResource(R.drawable.paper)
            bindingClass.yourChooseImage.visibility = View.VISIBLE
            if (botChoosen == "Rock")
                bindingClass.winResultText.visibility = View.VISIBLE
            else if (botChoosen == "Paper")
                bindingClass.drawResultText.visibility = View.VISIBLE
            else
                bindingClass.loseResultText.visibility = View.VISIBLE
            val botPickNew = (1..3).random()
            when(botPickNew){
                1 -> botChoosen = "Paper"
                2 -> botChoosen = "Rock"
                else -> botChoosen = "Scissors"
            }
            yourChoosen = null
        }
        bindingClass.rockButton.setOnClickListener {
            yourChoosen = "Rock"
            when(botChoosen){
                "Paper" -> bindingClass.botChooseImage.setImageResource(R.drawable.paper)
                "Rock" -> bindingClass.botChooseImage.setImageResource(R.drawable.rock)
                else -> bindingClass.botChooseImage.setImageResource(R.drawable.scissors)
            }
            bindingClass.winResultText.visibility = View.INVISIBLE
            bindingClass.loseResultText.visibility = View.INVISIBLE
            bindingClass.drawResultText.visibility = View.INVISIBLE
            bindingClass.yourChooseImage.setImageResource(R.drawable.rock)
            bindingClass.yourChooseImage.visibility = View.VISIBLE
            if (botChoosen == "Rock")
                bindingClass.drawResultText.visibility = View.VISIBLE
            else if (botChoosen == "Paper")
                bindingClass.loseResultText.visibility = View.VISIBLE
            else
                bindingClass.winResultText.visibility = View.VISIBLE
            val botPickNew = (1..3).random()
            when(botPickNew){
                1 -> botChoosen = "Paper"
                2 -> botChoosen = "Rock"
                else -> botChoosen = "Scissors"
            }
            yourChoosen = null
        }
        bindingClass.scissorsButton.setOnClickListener {
            yourChoosen = "Scissors"
            when(botChoosen){
                "Paper" -> bindingClass.botChooseImage.setImageResource(R.drawable.paper)
                "Rock" -> bindingClass.botChooseImage.setImageResource(R.drawable.rock)
                else -> bindingClass.botChooseImage.setImageResource(R.drawable.scissors)
            }
            bindingClass.winResultText.visibility = View.INVISIBLE
            bindingClass.loseResultText.visibility = View.INVISIBLE
            bindingClass.drawResultText.visibility = View.INVISIBLE
            bindingClass.yourChooseImage.setImageResource(R.drawable.scissors)
            bindingClass.yourChooseImage.visibility = View.VISIBLE
            if (botChoosen == "Rock")
                bindingClass.loseResultText.visibility = View.VISIBLE
            else if (botChoosen == "Paper")
                bindingClass.winResultText.visibility = View.VISIBLE
            else
                bindingClass.drawResultText.visibility = View.VISIBLE
            val botPickNew = (1..3).random()
            when(botPickNew){
                1 -> botChoosen = "Paper"
                2 -> botChoosen = "Rock"
                else -> botChoosen = "Scissors"
            }
            yourChoosen = null
        }
        bindingClass.newGameButton.setOnClickListener {
            yourChoosen = null
            botChoosen = null
            bindingClass.winResultText.visibility = View.INVISIBLE
            bindingClass.loseResultText.visibility = View.INVISIBLE
            bindingClass.drawResultText.visibility = View.INVISIBLE
            bindingClass.yourChooseImage.visibility = View.INVISIBLE
            bindingClass.botChooseImage.visibility = View.INVISIBLE
            bindingClass.botChooseImage.setImageResource(R.drawable.qmark)
            val botPickNew = (1..3).random()
            when(botPickNew){
                1 -> botChoosen = "Paper"
                2 -> botChoosen = "Rock"
                else -> botChoosen = "Scissors"
            }
            bindingClass.botChooseImage.visibility = View.VISIBLE
        }
    }
}