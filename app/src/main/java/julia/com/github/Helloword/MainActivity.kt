package julia.com.github.Helloword

import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {  //A herança é de ComponentActivity
    // Toda Activity irá herdar desse componente para receber seus comportamentos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Aqui é onde associamos a Activity ao layout XML
        setContentView(R.layout.activity_main)  // Usamos setContentView para associar o layout XML

        // Referências para os componentes do layout
        val etName = findViewById<EditText>(R.id.etName) //editor de texto
        val tvHelloMessage = findViewById<TextView>(R.id.tvHelloMessage) //texto a ser incrementado

        // Listener para quando o usuário pressiona Enter (actionDone)
        etName.setOnEditorActionListener { textView, actionId, _ ->

            //Constante do EditorInfo
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
