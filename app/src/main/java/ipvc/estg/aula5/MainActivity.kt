package ipvc.estg.aula5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeName(view: View){
        val editText = findViewById<EditText>(R.id.et1)
        val textView=findViewById<TextView>(R.id.tv1)

        if(editText.text.toString()=="") {
            Toast.makeText(this, "please, write your name!", Toast.LENGTH_SHORT).show()
        }else {
            textView.setText(editText.text)
        }

    }

    fun goToNextPage(view: View) {
        val intent = Intent(this, DashboardActivity::class.java)
        startActivity(intent)





    }
}