package com.example.gastoviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.gastoviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCauculate.setOnClickListener(this)
    }



    override fun onClick(view: View) {
        if (view.id == R.id.button_cauculate){
            calcula()
        }

    }
    private fun calcula() {
        val distancia = binding.editDistance.text.toString().toFloat()
        val preco = binding.editPrice.text.toString().toFloat()
        val autonomia = binding.editAutonomy.text.toString().toFloat()

        val totalValor = (distancia * preco) / autonomia
        val totalValorstr = "R$ ${"%.2f".format(totalValor)}"
        binding.editValue.text = totalValorstr


    }
}