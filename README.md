# 🎬 Watch Better - Java OOP Learning Project

## 📖 Descrição

**Watch Better** é um projeto desenvolvido em **Java** com fins **didáticos**, pensado para praticar e consolidar os principais conceitos da **Programação Orientada a Objetos (POO)**. A estrutura da aplicação segue boas práticas de codificação, com especial atenção à legibilidade, organização e padrões usados no mercado de trabalho.

## 🎯 Objetivos do Projeto

* Praticar os fundamentos da POO:

  * Classes e objetos
  * Atributos e métodos
  * Modificadores de acesso (**encapsulamento**)
  * **Herança** e **polimorfismo**
    
* Fortalecer a escrita de código limpo e padronizado:

  * Nomeação de variáveis e métodos em **inglês**
  * Separação de responsabilidades por classes
  * Boa organização de pastas e arquivos
* Criar uma base sólida para projetos maiores e profissionais

## 🛠️ Tecnologias e Recursos Utilizados

* **Java 24**
* Terminal ou VS Code como ambiente de desenvolvimento
* Conceitos de:

  * Tipos primitivos
  * Controle de fluxo (condições, loops)
  * Métodos e parâmetros
  * Orientação a Objetos
  * Encapsulamento com `private`, `public`, `protected`
  * Sobrescrita de métodos (`@Override`)

## 🧱 Estrutura do Projeto

```bash
WatchBetter/
│
├── src/
│   ├── Main.java
│   ├── Movie.java
│   ├── Series.java
│   └── CatalogManager.java
│
├── lib/
│   └── (bibliotecas externas, se necessário)
│
└── README.md
```

### Principais Classes

* `Main`: Classe principal para execução da aplicação.
* `Movie` e `Series`: Representam os itens do catálogo, utilizando herança.
* `CatalogManager`: Gerencia a exibição e adição de conteúdos.

## ✅ Funcionalidades

* Exibir catálogo de filmes e séries
* Adicionar novos conteúdos com seus respectivos atributos
* Utilizar herança para comportamentos comuns entre filmes e séries
* Exibir detalhes formatados com uso de sobrescrita de métodos

## 🚀 Como Executar

1. Clone ou baixe o repositório
2. Compile o projeto:

```bash
javac -d bin src/*.java
```

3. Execute o projeto:

```bash
java -cp bin Main
```

## 📌 Observações

* Todos os nomes de **variáveis**, **métodos** e **classes** estão em **inglês**, reforçando o padrão da indústria.
* A aplicação é simples e didática, mas projetada com atenção à escalabilidade e clareza.


