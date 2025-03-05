package julia.com.github.Helloword

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity  //Usamos a AppCompatActivity

class MainActivity : AppCompatActivity() {  //A herança é de AppCompatActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Aqui é onde associamos a Activity ao layout XML
        setContentView(R.layout.activity_main)  // Usamos setContentView para associar o layout XML

        // Inicializando os componentes da interface
        val etName = findViewById<EditText>(R.id.etName)  // EditText para digitar o nome
        val tvHelloMessage = findViewById<TextView>(R.id.tvHelloMessage)  // TextView para mostrar a mensagem
        val btnUpdateMessage = findViewById<Button>(R.id.btnUpdateMessage)  // Botão para atualizar a mensagem

        // Definindo o comportamento do botão
        btnUpdateMessage.setOnClickListener {
            // Pegando o texto que o usuário digitou no EditText
            val name = etName.text.toString()

            // Atualizando o TextView com a mensagem desejada
            if (name.isNotBlank()) {
                tvHelloMessage.text = "Hello, $name!"  // Se o nome não estiver vazio, exibe "Hello, {nome}"
            } else {
                tvHelloMessage.text = "Hello World!"  // Caso o nome esteja vazio, exibe "Hello World!"
            }
        }
    }
}
