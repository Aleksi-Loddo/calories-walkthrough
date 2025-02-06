package com.example.walkthroughcalories

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.RadioButton
import com.example.caloriewalkthrough.R

@Composable
fun GenderChoices(male: Boolean, setGenderMale: (Boolean) -> Unit) {
    Column{
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = male,
                onClick = {setGenderMale(true)}
            )
            Text(text = stringResource(R.string.MaleOption))
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
            ) {
            RadioButton(
                selected = !male,
                onClick = {setGenderMale(false)}
            )
            Text(text = stringResource(R.string.FemaleOption))
        }
    }
}