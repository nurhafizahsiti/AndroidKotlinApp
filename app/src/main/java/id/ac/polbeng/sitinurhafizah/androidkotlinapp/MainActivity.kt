package id.ac.polbeng.sitinurhafizah.androidkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvCounter: TextView
    private lateinit var btnAddNumber: Button
    private lateinit var btnSubtractNumber: Button
    private lateinit var btnResetNumber: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi TextView dan Button
        tvCounter = findViewById(R.id.tvCounter)
        btnAddNumber = findViewById(R.id.btnAddNumber)
        btnSubtractNumber = findViewById(R.id.btnSubtractNumber)
        btnResetNumber = findViewById(R.id.btnResetNumber)

        // Set nilai awal tvCounter
        tvCounter.text = "1"
    }

    // Fungsi untuk menambah angka
    fun addNumber(v: View){
        val currVal = tvCounter.text.toString().toInt()
        val nextVal = currVal + 1
        tvCounter.text = nextVal.toString()
    }

    // Fungsi untuk mengurangi angka
    fun subtractNumber(v: View){
        val currVal = tvCounter.text.toString().toInt()
        if (currVal > 0) {  // Agar nilai tidak menjadi negatif
            val nextVal = currVal - 1
            tvCounter.text = nextVal.toString()
        }
    }

    // Fungsi untuk mereset angka ke nol
    fun resetNumber(v: View) {
        tvCounter.text = "0"
    }
}
