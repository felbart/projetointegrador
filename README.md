# Sistema de Monitoramento de Ambientes Inteligentes

Este projeto foi desenvolvido como parte da disciplina **Projeto Integrador V** do curso de **Tecnologia em Análise e Desenvolvimento de Sistemas EaD** da **PUC Goiás**.

O objetivo é construir um protótipo funcional de **IoT doméstico**, capaz de monitorar variáveis ambientais como **temperatura**, **luminosidade** e **umidade do solo**, utilizando **Arduino** e uma interface simulada em **Java**.

---

## 🛠️ Tecnologias utilizadas

- Arduino UNO (via Tinkercad)
- Sensores:
  - TMP36 (temperatura)
  - LDR (luminosidade)
  - Sensor de umidade do solo
- LCD 16x2 com controle de contraste
- Linguagem C/C++ (Arduino IDE)
- Linguagem Java (simulação de leitura serial)
- Diagrama UML com base em classes Java

---

## 📦 Estrutura do projeto
projeto-ambiente-inteligente/
├── arduino/ # Código do Arduino (.ino)
├── java/ # Código Java (simulação de leitura)
├── uml/ # Diagrama de classes UML
├── docs/ # README e relatório
├── imagens/ # Prints do circuito e LCD
└── LICENSE # (opcional) Licença do projeto


---

## 🧪 Funcionalidades

- Leitura de temperatura (em °C) via TMP36
- Leitura de luz ambiente via LDR
- Monitoramento de umidade do solo
- Exibição das informações em tempo real no LCD 16x2
- Exibição de mensagens automáticas ao detectar mudanças
- Estrutura em Java simulando leitura serial dos dados
- Avaliação automatizada das condições para tomada de decisão:
  - Temperatura ideal / frio / calor
  - Luz suficiente ou baixa
  - Necessidade de regar plantas

---

## 🖥️ Simulação da interface Java

O código Java foi estruturado para simular a leitura dos dados recebidos via porta serial, utilizando classes como `SensorData` e `LeitorSerialSimulado`, com foco em **organização e lógica de negócios**. A execução real depende da instalação do JDK e da biblioteca `jSerialComm`, mas a estrutura está pronta para ser aplicada futuramente.

---

## 📷 Projeto no Tinkercad

🔗 [Ver simulação do circuito no Tinkercad](https://www.tinkercad.com/things/8pZLcZEpGAo-sensor-de-temperatura-luz-e-umidade-/editel?returnTo=https%3A%2F%2Fwww.tinkercad.com%2Fdashboard&sharecode=VVLLeiQSz8p7IVdY-tolIIAAr9fKbRth1e1pMGQSJUY)

---

## 👨‍🏫 Desenvolvido por

Felipe Leite
felbart@gmail.com

---

## 📄 Licença

Este projeto é de caráter educacional. Uso livre com atribuição. (Adicione uma licença formal se necessário)
