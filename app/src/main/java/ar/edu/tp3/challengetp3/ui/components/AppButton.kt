package ar.edu.tp3.challengetp3.ui.components
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import ar.edu.tp3.challengetp3.ui.theme.*

enum class ButtonType {
    PRIMARY,
    TEXT
}

@Composable
fun AppButton(
    text: String,
    type: ButtonType = ButtonType.PRIMARY,
    onClick: () -> Unit = {}
) {
    when (type) {
        ButtonType.PRIMARY -> {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .background(
                        color = PrimaryBlue,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .clickable { onClick() },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = text,
                    color = White,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }

        ButtonType.TEXT -> {
            Text(
                text = text,
                color = PrimaryBlue,
                modifier = Modifier.clickable { onClick() }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonPreview() {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        AppButton(text = "Login")
        AppButton(text = "Register", type = ButtonType.TEXT)
    }
}