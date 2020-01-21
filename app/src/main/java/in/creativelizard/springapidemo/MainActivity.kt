package `in`.creativelizard.springapidemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onActionPerform()
    }

    private val onActionPerform ={
        btnSpringPhysics.setOnClickListener {
            startActivity(Intent(baseContext,SpringAnimationActivity::class.java))
        }
    }

}
