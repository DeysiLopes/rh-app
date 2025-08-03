# Uso de IA Generativa no Projeto `rh-app`

Este documento registra como a IA Generativa (Gemini) foi utilizada como uma ferramenta de aprendizado e desenvolvimento durante a criação do projeto `rh-app`.

## Ferramentas Utilizadas
- **Gemini Advanced (CLI):** Utilizado como um "professor" para guiar o desenvolvimento, explicar conceitos de arquitetura, e ajudar na estruturação do raciocínio técnico.

## Histórico e Decisões Influenciadas pela IA

### 1. Desconstrução da Arquitetura Hexagonal
**Contexto**: O desenvolvimento começou com a necessidade de entender profundamente a Arquitetura Hexagonal, usando um projeto anterior (`hex`) como base de estudo.

**Interação com a IA**:
- **Prompt Inicial**: "crie um passo a passo de como implementar o hexagonal usando esse codigo como exemplo".
- **Evolução**: A IA foi instruída a detalhar os "porquês" e "comos" das decisões de design, fazendo paralelos com padrões de projeto (GoF) e explicando a função das Portas (Entrada/Saída) e Adaptadores.
- **Resultado**: A IA gerou um documento (`ARQUITETURA_HEXAGONAL.md`) que evoluiu iterativamente com base no feedback. Um ponto de virada foi a solicitação de um diagrama Mermaid para visualizar o fluxo de uma requisição, o que solidificou o entendimento.

**Decisão Influenciada pela IA**: A compreensão do fluxo de controle na Arquitetura Hexagonal foi significativamente acelerada pela visualização com o diagrama Mermaid, uma sugestão que emergiu da dificuldade de entender a teoria abstrata.

### 2. Distinção entre Arquitetura Hexagonal e DDD
**Contexto**: Ao iniciar o `rh-app`, surgiu a dúvida se a adoção da Arquitetura Hexagonal garantia automaticamente a aplicação de Domain-Driven Design (DDD).

**Interação com a IA**:
- **Prompt**: "estar usando hexagonal ja garante que estou usando ddd? se nao, pq?".
- **Resultado**: A IA forneceu uma explicação conceitual detalhada, diferenciando as duas abordagens:
    - **Hexagonal**: Foco na separação de camadas e inversão de dependência (o "como" a aplicação se comunica com o mundo exterior).
    - **DDD**: Foco na modelagem do domínio de negócio, na linguagem ubíqua e na criação de um modelo rico e coeso (o "quê" a aplicação faz).
- **Decisão Influenciada pela IA**: Ficou claro que as duas são complementares, mas não a mesma coisa. O projeto `rh-app` adotará a Arquitetura Hexagonal para a estrutura e os princípios do DDD para modelar o negócio de RH.

### 3. Transição para o `rh-app` e Definição do Papel da IA

**Contexto**: Com os conceitos de base solidificados, o foco mudou para o desenvolvimento prático do `rh-app`, iniciando pela funcionalidade de `Department`.

**Interação com a IA**:
- **Prompt**: "por enquanto igonore o log-ingesting-api... usando todos esses arquivos @ARQUITETURA_HEXAGONAL.md, @HISTORICO_ARQUITETURA_HEXAGONAL.md, @teste-senior.md... estou desenvolvendo o rh-app e vc tem permissao de entrar em todos os diretorios dessa pasta... olheo historico para ver onde paramos... fase 1 Department mas vc é um professor e ta me ensinando e estudando comigo portanto a anao ser que eu peça nao quero que vc faça nenhuma modificacao em codigo no rh-app.. mas vc pode entrar no hex e saga-eda-studies para me trazer snippets de codigo para me mostrar exemplos da minhas duvidas mas lembre que seu papel primeiro é de professor nao de executor, eu executarei as tarefas... quero aprender conceitos de padroes de projetos, hexagonal, ddd, assincrono, etc.. mas vou criar o passo a passo inicial que é criar o Department na mao e quero que me traga topicos guiando minha linha de racicionio em certo momento do desafio quando vc ler é pra documentar meu uso de IA e como foi utilizado quero que vc ja comece esse documento tem aate um exemplo no @teste-senior.md de como tem que ser documento ja adicione os detalhes mais importantes do nosso @HISTORICO_ARQUITETURA_HEXAGONAL.md pra irmos fazendo o documento simultaneamente"

- **Resultado**: A IA assimilou o papel de "professor/guia", comprometendo-se a focar nos conceitos e no raciocínio, em vez de gerar código diretamente. A primeira ação foi criar este mesmo documento de `AI_USAGE.md` para registrar o processo.

**Decisão Influenciada pela IA**: O modo de interação foi estabelecido como socrático. A IA não entregará soluções prontas, mas guiará o desenvolvimento através de perguntas e da estruturação de fluxos de trabalho, começando pelo `Department`.

## Próximos Passos

O plano é continuar usando a IA como um parceiro de "pair programming" socrático, onde a IA questiona e guia o raciocínio para a implementação manual das funcionalidades, começando pela entidade `Department`.
