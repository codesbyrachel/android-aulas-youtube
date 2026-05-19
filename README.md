# 📱 Aula 02 — Main Thread

Aprenda na prática por que travamentos acontecem no Android, como funciona a Main Thread e como usar Coroutines para manter sua UI fluida e responsiva.

> ⚠️ Este repositório é um material de apoio.  
> A explicação completa está no vídeo.

---

## 🎥 Assista no Youtube

👉Assista a aula completa: https://youtu.be/3BZLqjizkPE

---

## 🧠 Resumo da aula

Nesta aula você vai entender:

- O que é uma Thread no Android
- O papel da Main Thread (UI Thread)
- Por que bloquear a Main Thread trava o app
- O que é ANR (Application Not Responding)
- Como funciona a fila da UI e o Looper
- O que são operações pesadas
- Como mover trabalho pesado para background
- Como usar Coroutines e Dispatchers
- Como atualizar a UI com segurança

---

## 🧩 Estrutura do projeto

O projeto foi construído de forma progressiva seguindo os passos da aula:

- **step-01** → Criação do layout inicial
- **step-02** → Simulando bloqueio da Main Thread
- **step-03** → Corrigindo com Coroutines
- **step-04** → Utilizando UI em thread secundária
- **step-05** → Atualizando UI corretamente
- **step-06** → Mini desafio: processamento de imagem

---

## 🚀 Como usar este repositório

Você pode aprender de duas formas:

### 👉 1. Assistindo a aula

Siga o vídeo e acompanhe o código aqui.

### 👉 2. Navegando pelos commits

Cada etapa da aula foi separada em commits seguindo este padrão:

- feat(aula-02): step-01 create initial layout
- feat(aula-02): step-02 creating anr
- feat(aula-02): step-03 using coroutines
- feat(aula-02): step-04 using ui in secondary thread
- feat(aula-02): step-05 fix toast
- feat(aula-02): step-06 add mini challenge

Isso permite que você volte no histórico e acompanhe a evolução do código passo a passo.

---

## 🎯 Desafio

Tente implementar o mini desafio antes de ver a solução.
