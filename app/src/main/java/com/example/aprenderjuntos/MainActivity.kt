package com.example.aprenderjuntos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.aprenderjuntos.ui.theme.AprenderJuntosTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AprenderJuntosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                ComposeArticulosApp()
                }
            }
        }
    }
}

@Composable
fun ComposeArticulosApp(){
    TextoVista(
        titulo = stringResource(R.string.titulo_text),
        parrafo1 = stringResource(R.string.parrafo1_text),
        parrafo2 = stringResource(R.string.parrafo2_text),
        Imagen = painterResource(R.drawable.bg_compose_background))
}

@Composable
fun TextoVista (
    titulo:String,
    parrafo1:String,
    parrafo2:String,
    Imagen : Painter,
    modifier: Modifier = Modifier
) {
    Column (modifier = modifier) {
        Image(
            painter = Imagen,
            contentDescription = "Imagen con diversos diseños"
        )
        
        Text(text = titulo,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp,
                )
        )

        Text(text = parrafo1,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp
                ),
            textAlign = TextAlign.Justify
        )

        Text(text = parrafo2,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                ),
            textAlign = TextAlign.Justify
        )

    }

}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    AprenderJuntosTheme {
        ComposeArticulosApp()
    }
}