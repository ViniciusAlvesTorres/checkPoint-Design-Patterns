# Biblioteca Universitária
Este repositório contém um projeto Java que demonstra a implementação de diferentes padrões de design, incluindo o Observer, Strategy, Singleton e Composite, em uma aplicação de biblioteca universitária. O projeto é dividido em três pacotes principais: controller, model, e view. Cada pacote contém classes relacionadas a diferentes aspectos da aplicação. Abaixo, você encontrará uma breve descrição de cada pacote e das principais classes.

# Controller
Neste pacote, você encontrará a classe Biblioteca, que atua como o controlador principal da aplicação de biblioteca. Esta classe é responsável por gerenciar observadores, adicionar e emprestar livros, e notificar os observadores sobre as ações realizadas.

# Model
O pacote model contém várias classes que implementam os diferentes padrões de design:

* Aluno: Implementa o padrão Observer e representa um aluno que recebe notificações sobre o status dos livros na biblioteca.
EstrategiaAltaPrioridade e EstrategiaBaixaPrioridade: Implementam o padrão Strategy e representam estratégias diferentes para a execução de tarefas com diferentes prioridades.
GerenciadorTarefas: Também implementa o padrão Strategy e permite definir uma estratégia para a execução de tarefas.
* Livro: Representa um livro na biblioteca e contém informações sobre o título, autor, ISBN e quantidade disponível.
* Observador: Define a interface para observadores que recebem notificações.
* SistemaTarefas: Implementa o padrão Singleton para fornecer uma única instância do sistema de tarefas.
* Tarefa e TarefaComplexa implementam o padrão Composite, permitindo a criação de tarefas simples e complexas.
View
O pacote view contém a classe Biblioteca_Universitaria, que serve como o ponto de entrada da aplicação. Nesta classe, você encontrará exemplos de como os diferentes padrões de design são utilizados na prática, incluindo a criação de alunos, registro de livros, empréstimos, devoluções, definição de estratégias de prioridade para tarefas e execução de tarefas simples e complexas.

# Como Executar
Para executar a aplicação, você pode utilizar uma IDE Java, como o IntelliJ IDEA ou o Eclipse. Basta criar um novo projeto Java e importar os arquivos do repositório. Em seguida, execute a classe Biblioteca_Universitaria como um programa Java para ver os padrões de design em ação.
O programa mostrará mensagens no console indicando quando um aluno empresta um livro, quando um aluno devolve um livro e a lista de livros disponíveis na biblioteca.

