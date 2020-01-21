package `in`.creativelizard.springapidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.dynamicanimation.animation.SpringAnimation
import androidx.dynamicanimation.animation.SpringForce
import kotlinx.android.synthetic.main.activity_spring_animation.*

class SpringAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spring_animation)
        onActionPerform()
    }

    private val onActionPerform : () ->Unit = {
        val spAnim = SpringAnimation(imfAndroid, DynamicAnimation.TRANSLATION_Y, 0f)

        val springForce =  SpringForce()
        springForce.finalPosition = -100f
        springForce.stiffness = SpringForce.STIFFNESS_LOW
        springForce.dampingRatio = SpringForce.DAMPING_RATIO_HIGH_BOUNCY
        spAnim.spring = springForce
        spAnim.start()
    }
}
