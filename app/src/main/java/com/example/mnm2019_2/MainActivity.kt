package com.example.mnm2019_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var segredo:TextView = findViewById(R.id.textView)
        var quantidadeDeErros:TextView = findViewById(R.id.textView2)
        var letra:EditText = findViewById(R.id.editText)
        var botao:Button = findViewById(R.id.button)
        var reiniciar:Button = findViewById(R.id.button2)

        var palavras = listOf<String>("preguica", "sono", "cama")
        var erros = 0
        var acertos = mutableListOf<String>()
        var palavra = " "

        reiniciar.setOnClickListener{
            var palavra = palavras.random()
            segredo.text = " _ ".repeat(palavra.count())
        }

        botao.setOnClickListener {
            var digito = letra.text.toString()
            var contemLetra = palavra.indexOf(digito)
            if (contemLetra > -1) {
                acertos.add(digito)
            }
            
            else {
                erros = erros + 1
                quantidadeDeErros.text = "Erros $erros"
            }
    }

//        var texto:TextView = findViewById(R.id.textView)
//        var texto2:TextView = findViewById(R.id.textView2)
//        var botao:Button = findViewById(R.id.button)
//        var input:EditText = findViewById(R.id.editText)
//
//        //texto.text = "Meu texto"
//
//        //var numero = 7.0
//        //var divisao = numero/2
//        //texto.text = divisao.toString()
//
//        //var meutexto = "MeuTexto"
//       // texto.text = meutexto.get(3).toString()
//
//       // var a = 1
//        texto2.text = "digite o numero" + a
//
//
//        botao.setOnClickListener {
//             texto.text = input.text
//            if ( a.toString() == input.text.toString() ) {
//                texto.text = "são iguais"
//                }
//            else {
//                texto.text = "não são iguais"
//
//            }
//
//        }





        //   var a = 1
        //   var b = "1"
        //   var saoIguais = a == b.toInt() //
        //   if (a == b.toInt()) {
        //        texto.text = "os numeros são iguais"
        //  }
        // else {
        //     texto.text = "os numeros não são igiuais"
        // }

        // texto.text = saoIguais.toString()


    //}
}
