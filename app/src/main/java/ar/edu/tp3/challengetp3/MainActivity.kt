package ar.edu.tp3.challengetp3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ar.edu.tp3.challengetp3.navigation.AppNavGraph
import ar.edu.tp3.challengetp3.ui.theme.ChallengeTp3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ChallengeTp3Theme {
                AppNavGraph()
            }
        }
    }
}