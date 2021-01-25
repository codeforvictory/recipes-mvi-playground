package org.codeforvictory.android.recipes.cesards.feature.ui.recipes

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Hello world!", Toast.LENGTH_LONG).show()
    }
}
