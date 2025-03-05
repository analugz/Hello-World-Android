package julia.com.github.Helloword

import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity  //Usamos a AppCompatActivity

class MainActivity : AppCompatActivity() {  //A herança é de AppCompatActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Aqui é onde associamos a Activity ao layout XML
        setContentView(R.layout.activity_main)  // Usamos setContentView para associar o layout XML

        //Acessando componentes do arquivo XML usando o findViewById
        //Todos os componentes são views
        val etName = findViewById<EditText>(R.id.etName)
        val tvHelloMessage = findViewById<TextView>(R.id.tvHelloMessage)

        // Listener para quando o usuário pressiona Enter (actionDone)
        etName.setOnEditorActionListener { textView, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                val name = textView.text.toString().trim()
                // Verifica se o nome foi digitado
                if (name.isNotEmpty()) {
                    tvHelloMessage.text = "Hello World, $name!"
                } else {
                    tvHelloMessage.text = "Hello World!"
                }
                true // Indica que consumimos o evento
            } else {
                false
            }
        }
    }
}