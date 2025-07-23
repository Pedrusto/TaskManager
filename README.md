# TaskManager

Um gerenciador de tarefas simples em Java para terminal, criado para fins de portfólio e aprendizado.

## Descrição

O TaskManager é uma aplicação de linha de comando que permite adicionar, listar, marcar como concluídas e remover tarefas. O projeto foi desenvolvido com boas práticas de orientação a objetos, código limpo e inclui um exemplo básico de teste.

## Funcionalidades

- Adicionar uma nova tarefa com descrição
- Listar todas as tarefas (pendentes e concluídas)
- Marcar tarefas como concluídas
- Remover tarefas por ID

## Como usar

### Pré-requisitos

- Java 8 ou superior

### Execução

Clone este repositório e compile os arquivos:

```bash
javac Main.java TaskManager.java Task.java
```

Execute o programa:

```bash
java Main
```

Siga as instruções do menu para gerenciar suas tarefas.

### Testes

O projeto inclui um teste simples em `TaskManagerTest.java` para validar as principais operações:

```bash
javac TaskManagerTest.java TaskManager.java Task.java
java TaskManagerTest
```

Se tudo estiver correto, você verá a mensagem:

```
Todos os testes passaram!
```

## Estrutura dos arquivos

- `Main.java`: interface de linha de comando
- `Task.java`: classe que representa uma tarefa
- `TaskManager.java`: classe responsável pela lógica de gerenciamento das tarefas
- `TaskManagerTest.java`: testes básicos para o TaskManager

## Possíveis melhorias

- Persistência das tarefas em arquivos
- Interface gráfica (Swing, JavaFX)
- Filtros de pesquisa e ordenação
- Suporte a datas e prazos

## Licença

Este projeto está sob a licença MIT. Sinta-se livre para usar, modificar e compartilhar!
