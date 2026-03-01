# GOF Design Patterns - Projeto Java

![Java](https://img.shields.io/badge/Java-17-blue) ![GitHub](https://img.shields.io/badge/GitHub-repositório-black)

## 📌 Descrição

Este projeto é uma implementação prática dos principais **Design Patterns** descritos no livro *"Gang of Four"* (GOF), desenvolvido em **Java 17**.  
O objetivo é demonstrar o uso de padrões como:

- **Singleton** – Controle de instâncias únicas.
- **Strategy** – Comportamento dinâmico de objetos.
- **Facade** – Simplificação da interação com subsistemas complexos.

O projeto simula cenários reais, como sistemas de CRM e APIs, sendo ideal para estudo, portfólio ou entrevistas técnicas.

---

## 🛠 Tecnologias e Ferramentas

- **Linguagem:** Java 17  
- **IDE Recomendada:** IntelliJ IDEA  
- **Controle de Versão:** Git  
- **Plataforma:** Desktop / Console  

---

## 📂 Estrutura do Projeto


src/
├── one/digitalinnovation/gof/
│ ├── Test.java # Classe principal para testar todos os padrões
│ ├── facade/Facade.java # Implementação do padrão Facade
│ ├── singleton/ # Implementações de Singleton
│ │ ├── SingletonEager.java
│ │ ├── SingletonLazy.java
│ │ └── SingletonLazyHolder.java
│ └── strategy/ # Implementações de Strategy
│ ├── Comportamento.java
│ ├── ComportamentoAgressivo.java
│ ├── ComportamentoDefensivo.java
│ ├── ComportamentoNormal.java
│ └── Robo.java
├── subsistema1/crm/CrmService.java # Simulação de CRM
└── subsistema2/cep/CepApi.java # Simulação de API de CEP


---

## 🚀 Executando o Projeto

1. Clone este repositório:

```bash
git clone https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git
cd NOME_DO_REPOSITORIO

Abra o projeto em IntelliJ IDEA ou outra IDE Java compatível.

Compile e execute a classe principal:

src/one/digitalinnovation/gof/Test.java

Observe no console:

Testes dos Singletons (instâncias únicas).

Testes do Strategy (mudança de comportamento do Robo).

Testes do Facade (integração com CRM e API de CEP).

💡 Exemplo de Saída
one.digitalinnovation.gof.singleton.SingletonLazy@15db9742
one.digitalinnovation.gof.singleton.SingletonLazy@15db9742
one.digitalinnovation.gof.singleton.SingletonEager@6d06d69c
one.digitalinnovation.gof.singleton.SingletonEager@6d06d69c
one.digitalinnovation.gof.singleton.SingletonLazyHolder@7852e922
one.digitalinnovation.gof.singleton.SingletonLazyHolder@7852e922
Movendo-se normalmente...
Movendo-se normalmente...
Movendo-se defensivamente...
Movendo-se agressivamente...
Movendo-se agressivamente...
Movendo-se agressivamente...
Cliente salvo no sistema de CRM:
Venilton
14801788
Araraquara
SP
🔑 Padrões Implementados
Padrão	Classe/Exemplo	Descrição
Singleton	SingletonEager / SingletonLazy / SingletonLazyHolder	Garante instância única de uma classe.
Strategy	Robo, Comportamento*	Permite alterar comportamento em tempo de execução.
Facade	Facade	Simplifica a interação com sistemas complexos (CRM + CEP).
📖 Observações

O projeto é 100% orientado a objetos e segue boas práticas de design Java.

Ideal para portfólio, estudo de padrões GOF e demonstração de habilidades em entrevistas.

Simula integração de subsistemas e aplicação de padrões sem dependências externas.

📌 Autor

Millena Nunes Isidro
GitHub
 | LinkedIn
