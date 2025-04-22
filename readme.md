# 💬 Chat Client em Java (Terminal)

Este é um **cliente de chat em Java** que se conecta a um servidor via socket e permite a troca de mensagens em tempo real entre múltiplos usuários conectados. A comunicação acontece via terminal, com leitura e escrita de mensagens de forma síncrona.

> ⚠️ Este cliente foi desenvolvido para funcionar em conjunto com o [Servidor de Chat Java](https://github.com/beno1234/SocketService)

---

## 🚀 Como executar

### Pré-requisitos

- Java instalado (`JDK 8+`)
- Servidor de chat em execução na porta `8089`

### Execução

1. **Compile o código:**

```bash
javac Main.java
```

2. **Execute o cliente:**

```bash
java Main
```

3. **Digite seu nome e interaja com outros usuários conectados ao servidor.**
   - Para sair, digite `sair`.

---

## 🛠️ Funcionalidades

- Conexão via socket com o servidor de chat.
- Leitura de mensagens recebidas em tempo real através de `Thread`.
- Envios de mensagens pelo terminal.
- Saída do chat com comando `sair`.

---

## 📁 Estrutura do Projeto

```
Chat-Client-Java/
│
├── Main.java
├── README.md
```

---

## 📚 Tecnologias Utilizadas

- Java (`java.net.Socket`, `BufferedReader`, `PrintWriter`, `Scanner`)
- Threads para comunicação assíncrona com o servidor

---

## 🧠 Conceitos Envolvidos

- Comunicação cliente-servidor via TCP/IP
- Manipulação de entrada e saída de dados no terminal
- Programação concorrente com Threads

---

## ✍️ Autor

Desenvolvido por Beno Lopes Dias(https://github.com/beno1234) 😊
