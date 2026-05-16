package com.codesbyrachel.aula02_mainthread

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@Composable
fun MainThreadScreen(modifier: Modifier = Modifier) {

    var status by remember { mutableStateOf("Aguardando...") }
    var isLoading by remember { mutableStateOf(false) }

    val scope = rememberCoroutineScope()

    Column(
        modifier =
            modifier
                .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = status,
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 24.dp),
        )

        // Botão 1: Buscar dados
        Button(
            onClick = {
                scope.launch {
                    status = "Buscando dados ..."
                    isLoading = true

                    val result = fetchDataFromNetwork()
                    status = result

                    isLoading = false
                }
            },
            enabled = !isLoading,
        ) {
            Text("Buscar Dados")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                scope.launch {
                    status = "Processando..."
                    isLoading = true

                    val result = processImage()
                    status = result
                    isLoading = false
                }
            },
            enabled = !isLoading,
        ) {
            Text("Processar Imagem")
        }

        Spacer(modifier = Modifier.height(32.dp))

        if (isLoading) {
            CircularProgressIndicator()
        }
    }
}

suspend fun fetchDataFromNetwork(): String =
    withContext(Dispatchers.IO) {
        // simula busca de dados na rede
        delay(5000)
        "Dados recebidos com sucesso!"
    }

suspend fun processImage(): String =
    withContext(Dispatchers.IO) {
        // simula processamento pesado de imagem
        delay(4000)
        "Processamento de imagem concluído!"
    }