📽️ Sistema de Recomendação de Filmes (Java)

Este é um projeto simples em Java que simula um sistema de recomendação de filmes baseado na preferência de gênero do usuário. O sistema utiliza princípios de Programação Orientada a Objetos (POO) e representação de conhecimento via lógica proposicional para sugerir filmes ao usuário.

📁 Estrutura do Projeto

/src
├── Main.java                 # Classe principal (ponto de entrada)
│
├── /models                  # Modelos de dados (Filme, Usuario, Genero)
│   ├── Filme.java
│   ├── Usuario.java
│   └── Genero.java (enum)
│
└── /services                # Serviço de recomendação
└── Recomendador.java


🧠 Lógica de Recomendação

A recomendação é feita com base em uma regra simples de lógica proposicional:

Se o gênero do filme é igual à preferência do usuário, então o filme é recomendado.

Esta regra é implementada na classe Recomendador, dentro da pasta services.

📦 Classes e Funções
✅ Main.java

Instancia filmes e um usuário.

Usa a classe Recomendador para verificar se o filme deve ser recomendado.

Exibe a mensagem: Recomendado ou Não recomendado.

✅ Filme.java

Armazena as informações de um filme:

private String titulo;
private Genero genero;


✅ Usuario.java

Armazena a preferência de gênero do usuário:

private Genero preferencia;

✅ Genero.java

Enum que define os gêneros disponíveis:
ACAO, COMEDIA, FICCAO, SUSPENSE

✅ Recomendador.java

Contém a lógica de recomendação:
return filme.getGenero() == usuario.getPreferencia();

✅ Exemplo de Execução

Com o usuário que gosta de Ação, e os seguintes filmes:

Vingadores: Ultimato – Ação

A Hora do Rush – Ação

Teddy – Comédia

O Abutre – Suspense

Alien – Ficção
A saída no console será:
Filme: Vingadores: Ultimato → Recomendado
Filme: A hora do rush → Recomendado
Filme: Teddy → Não recomendado
Filme: O Abutre → Não recomendado
Filme: Alien → Não recomendado


🚀 Como Executar

Compile os arquivos:
javac src/**/*.java


Execute a classe principal:
java src/Main


📚 Conceitos Aplicados

Programação Orientada a Objetos (POO)

Lógica Proposicional (Representação de Conhecimento em IA)

Boas práticas de organização de código

Uso de enum para evitar erros com strings

📜 Licença

Este projeto é licenciado sob a MIT License, com permissões limitadas para fins educacionais e não comerciais. A licença de estudante permite que você use, modifique e compartilhe este código em um ambiente educacional, desde que não haja fins lucrativos envolvidos.