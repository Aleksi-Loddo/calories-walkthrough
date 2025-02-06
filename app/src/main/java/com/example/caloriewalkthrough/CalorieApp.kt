package com.example.caloriewalkthrough

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.SemanticsProperties.Heading
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.walkthroughcalories.Calculations
import com.example.walkthroughcalories.GenderChoices
import com.example.walkthroughcalories.Heading
import com.example.walkthroughcalories.IntensityList
import com.example.walkthroughcalories.WeightField


@Composable
fun CalorieApp(modifier: Modifier = Modifier) {
   var weightInput by remember { mutableStateOf("") }
    var weight = weightInput.toIntOrNull() ?: 0
    var male by remember { mutableStateOf(true) }
    var intensity by remember { mutableStateOf(1.3f) }
    var result by remember { mutableIntStateOf(0) }
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Heading(stringResource(R.string.Calories))
        WeightField(weightInput = weightInput, onValueChange = { weightInput = it})
        GenderChoices(male, setGenderMale = {male = it})
        IntensityList( onCLick ={ intensity = it})
        Text(
            text = result.toString(),
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 16.dp)
        )
        Calculations(
            male = male,
            weight = weight,
            intensity = intensity,
            setResult = {result = it}
        )
    }

}