package ar.edu.tp3.challengetp3.ui.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import ar.edu.tp3.challengetp3.ui.theme.BackgroundLight
import ar.edu.tp3.challengetp3.ui.theme.ChallengeTp3Theme
import ar.edu.tp3.challengetp3.ui.theme.PrimaryBlue
import ar.edu.tp3.challengetp3.ui.theme.TextPrimary
import ar.edu.tp3.challengetp3.ui.theme.TextSecondary
import androidx.compose.ui.text.input.PasswordVisualTransformation

@Composable
fun LoginScreen(
    onSignInClick: () -> Unit = {},
    onCreateAccountClick: () -> Unit = {},
    onForgotPasswordClick: () -> Unit = {}
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundLight)
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(72.dp))

        Text(
            text = "Login here",
            color = PrimaryBlue,
            fontWeight = FontWeight.Bold,
            fontSize = 34.sp
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Welcome back you've\nbeen missed!",
            color = TextPrimary,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp,
            lineHeight = 36.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(56.dp))

        AppTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = "Email",
            isFocused = true
        )

        Spacer(modifier = Modifier.height(24.dp))

        AppTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = "Password",
            isPassword = true
        )

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.CenterEnd
        ) {
            Text(
                text = "Forgot your password?",
                color = PrimaryBlue,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                modifier = Modifier.clickable { onForgotPasswordClick() }
            )
        }

        Spacer(modifier = Modifier.height(48.dp))

        AppButton(
            text = "Sign in",
            onClick = onSignInClick
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Create new account",
            color = TextSecondary,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            modifier = Modifier.clickable { onCreateAccountClick() }
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
            SocialButton(text = "G")
            SocialButton(text = "f")
            SocialButton(text = "")
        }

        Spacer(modifier = Modifier.height(56.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    ChallengeTp3Theme {
        LoginScreen()
    }
}