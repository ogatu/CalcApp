package jp.techacademy.tsuyoshi.calcapp
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.support.design.widget.Snackbar
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        val intent = Intent(this, SecondActivity::class.java)
        var text = editText1.text.toString()
        var text2 = editText2.text.toString()
        if (text.equals("")||text2.equals("")){
            Snackbar.make(v, "数値を入力して下さい", Snackbar.LENGTH_LONG)
                .setAction("戻る", null).show()
            return
        }

        val num = text.toDouble()
        val num2 = text2.toDouble()
        var result = 0.0

        if (v.id == R.id.button1) {
            result = num + num2

        } else if (v.id == R.id.button2) {
            result = num - num2

        } else if (v.id == R.id.button3) {
            result = num * num2

        } else if (v.id == R.id.button4) {
            result = num / num2
        }

             intent.putExtra("result", result)

             startActivity(intent)

         }
         }



