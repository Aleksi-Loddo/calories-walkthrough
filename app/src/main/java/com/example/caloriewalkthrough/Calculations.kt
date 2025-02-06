package com.example.walkthroughcalories

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.caloriewalkthrough.R

@Composable
fun Calculations(male: Boolean,weight: Int, intensity: Float, setResult: (Int)-> Unit){

    Button(
        onClick = {
            if (male) {
                setResult (((879 + 10.2 * weight) * intensity).toInt())
            } else {
                setResult (((795 + 7.18 * weight) * intensity).toInt())
            }
        },
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = stringResource(R.string.calculate))
    }

}