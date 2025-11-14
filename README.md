--- 
### 🧙‍♂️ Mini Mundo de Harry Potter – Desafio de POO em Java

Este projeto foi desenvolvido como uma prática de Programação Orientada a Objetos (POO) utilizando conceitos essenciais como abstração, herança, polimorfismo e encapsulamento, além da aplicação de uma arquitetura simples em camadas com uso de DTOs (Data Transfer Objects).

O objetivo é criar um pequeno sistema inspirado no universo de Harry Potter, onde diferentes tipos de bruxos executam feitiços específicos conforme sua casa em Hogwarts.

---
## 🏗️ Arquitetura do Projeto

O projeto segue uma estrutura organizada em camadas:
```
src/
 ├── model/   → Camada de domínio (Bruxos, Interface, Classes Filhas)
 ├── dto/     → Objetos de transferência de dados (Request / Response)
 └── app/     → Classe Main (execução do programa)
```
### 🧩 Requisitos do Desafio
#### ✔️ Camada model
##### 🧑‍🎓 Classe Base: Bruxo

- Atributos privados:

- nome (String)

- casa (String)

# -  Métodos :

- Construtor

- mostrarInformacoes() → Exibe nome e casa

- Getters e Setters

## ✨ Interface Magia

# - Método :

- lancarFeitico() → Exibe uma mensagem indicando o feitiço lançado

## 🦁 Classe BruxoGrifinoria

- Herda de Bruxo

- Implementa Magia

- Mensagem do feitiço:

- "Expelliarmus! - O bruxo da Grifinória lançou seu feitiço!"

## 🐍 Classe BruxoSonserina

- Herda de Bruxo

- Implementa Magia

- Mensagem do feitiço:

"Serpensortia! - O bruxo da Sonserina lançou seu feitiço!

---

## 📦 Camada DTO (Data Transfer Object)

### ✉️ BruxoRequestDTO

Usado para simular entrada de dados.

- nome

- casa

- Construtor vazio e completo

- Getters e Setters

## 📤 BruxoResponseDTO

Usado para exibir informações processadas.

- nome

- casa

- tipoMagia

- Construtor vazio e completo

- Getters e Setters

--- 

## 🖥️ Lógica da Aplicação (Main)

No método main, o fluxo é:

1. Criar objetos BruxoRequestDTO simulando entrada.

2. Converter DTOs em objetos reais do domínio (BruxoGrifinoria, BruxoSonserina).

3. Executar:

- mostrarInformacoes()

- lancarFeitico()

4. Criar um BruxoResponseDTO com os dados gerados.

5. Exibir as informações finais no console.

---
## ▶️ Como Executar
1. clone repositório:
```java html 
git clone https://github.com/SEU_USUARIO/NOME_DO_REPO.git
````
2. Abra no IntelliJ / Eclipse / VS Code com Java configurado.

3. Navegue até a pasta app e execute a classe Main.

---
## 📘 Tecnologias Utilizadas

- ☕ Java 17+

- 🧱 Arquitetura em camadas

- 🎯 DTO Pattern

- 🪄 Herança, Polimorfismo e Encapsulamento

---


``` vbnet java html json
📜 Exemplo de Saída
Nome do Bruxo: Harry Potter
Casa: Grifinória
Expelliarmus! - O bruxo da Grifinória lançou seu feitiço!

Nome do Bruxo: Draco Malfoy
Casa: Sonserina
Serpensortia! - O bruxo da Sonserina lançou seu feitiço!
```
---
## ⭐ Aprendizados

Este desafio reforça:

- Criação e organização de camadas

- Diferença entre RequestDTO e ResponseDTO

- Utilização de herança e interfaces

- Modelagem orientada a objetos de maneira limpa e profissional

---
