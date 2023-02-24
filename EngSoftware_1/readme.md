# Engenharia de Software 1
## Professor Giuliano Bertoti

- [Jakob's Ten Usability Heuristics](https://media.nngroup.com/media/articles/attachments/Heuristic_Summary1_A4_compressed.pdf)

*We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play.   On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.*

Podemos concluir com esta passagem que *Engenharia de Software* é a forma "empresarial-corporativa" de *programação* (entendido como o ato de construir projetos à partir de linguagens de programação, porém de maneira menos estruturada). 
Ela descreva a forma com que produtos de software são criados dentro de organizações que precisam se preocupar com tempo, demanda, escalabilidade, levando todos estes pontos em consideração para pesar os prós e contras de cada decisão. Como estas decisões irão afetar mais pessoas, precisam também ser tomadas com mais cuidado lembrando da magnitude de suas consequências.

Assim, Engenharia de Software também é programação, porém programação não é necessariamente Engenharia de Software.

*[...] Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.*

Referências: Titus Winters. [**What Is Software Engineering?**](https://abseil.io/resources/swe-book/html/ch01.html)

- O que é Engenharia de Software?
  
- O que são requisitos?
*requisitos* são elementos necessários ao sistema/aplicação/produto de software que está sendo construído para que este atenda às necessidades dos clientes ou usuários.
  
  - 2.1 O que são requisitos funcionais?
    Dentre os requisitos citados acima, os funcionais são aqueles indispensáveis ao funcionamento do produto. Se pensarmos em um software como o Telegram, enviar e receber mensagens são requisitos funcionais.

  - 2.2 O que são requisitos não-funcionais?
    São elementos que não se referem diretamente às funcionalidades do software, porém podem ser decisivos para seu bom funcionamento e para uma melhor experiência do usuário. Em geral estes requisitos se referem ao desempenho, usabilidade, confiabilidade, segurança, disponibilidade, manutenção e tecnologias envolvidas.
    No exemplo anterior podemos apontar como requisitos não funcionais: a rapidez na inicialização do aplicativo e no envio de mensagens; ter uma interface intuitiva e customizável; 

- Escreva dois exemplos de *trade-offs* envolvendo requisitos não funcionais.

1. A escolha entre memória e velocidade: uma maneira comum de tornar diversas operações e programas mais rápidos é temporariamente armazenar resultados em memória para não ter que procurá-los novamente. Porém o preço desta escolha é um maior gasto de memória. Com o avanço das tecnologias de hardware, hoje em dia em geral não é um problema gastar alguns megabytes a mais de memória. Porém a economia de memória pode ser uma prioridade caso estejamos desenvolvendo software para dispositivos que têm limitações deste recurso.

2. A escolha entre velocidade e precisão: na escolha de banco de dados para nossas aplicações temos diversas opções de bancos relacionais ou não relacionais. Normalmente para tomar a decisão de qual tecnologia usar, precisamos primeiro entender se para a finalidade específica deste software é mais importante ter velocidade ou precisão absoluta, já que bancos noSQL como o MongoDB alcançam maiores velocidades de busca, porém sacrificando a precisão, o que pode ser um grave problema para bancos de dados sensíveis como os de bancos e outras intituições financeiras. 