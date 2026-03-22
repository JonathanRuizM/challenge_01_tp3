package ar.edu.tp3.challengetp3.ui.screens.register
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ar.edu.tp3.challengetp3.ui.components.AppButton
import ar.edu.tp3.challengetp3.ui.components.AppTextField
import ar.edu.tp3.challengetp3.ui.components.SocialButton
import ar.edu.tp3.challengetp3.ui.theme.*

@Composable
fun RegisterScreen(
    onSignUpClick: () -> Unit = {},
    onLoginClick: () -> Unit = {}
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundLight)
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(72.dp))

        Text(
            text = "Create Account",
            color = PrimaryBlue,
            fontWeight = FontWeight.Bold,
            fontSize = 34.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Create an account so you can explore all the existing jobs",
            color = TextPrimary,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            lineHeight = 22.sp,
            modifier = Modifier.padding(horizontal = 12.dp)
        )

        Spacer(modifier = Modifier.height(48.dp))

        AppTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = "Email",
            isFocused = true
        )

        Spacer(modifier = Modifier.height(20.dp))

        AppTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = "Password",
            isPassword = true
        )

        Spacer(modifier = Modifier.height(20.dp))

        AppTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            placeholder = "Confirm Password",
            isPassword = true
        )

        Spacer(modifier = Modifier.height(40.dp))

        AppButton(
            text = "Sign up",
            onClick = onSignUpClick
        )

        Spacer(modifier = Modifier.height(28.dp))

        Text(
            text = "Already have an account",
            color = TextSecondary,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            modifier = Modifier.clickable { onLoginClick() }
        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = "Or continue with",
            color = PrimaryBlue,
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            SocialButton("G")
            SocialButton("f")
            SocialButton("")
        }

        Spacer(modifier = Modifier.height(56.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterPreview() {
    ChallengeTp3Theme {
        RegisterScreen()
    }
}