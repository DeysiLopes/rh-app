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

### 3. Implementação Guiada do Primeiro Fluxo (Create Department)
**Contexto**: Após a fase teórica, partimos para a implementação do primeiro endpoint (`POST /departments`), onde surgiram dificuldades na conexão das camadas de saída (persistência).

**Interação com a IA**:
- **Prompt**: "nao consegui fazer a parte da saida @rh-app/** do fluxo do Department da uma olhada do que ja fiz ate o momento"
- **Evolução**: Ao tentar executar a correção, a IA foi lembrada de seu papel de "professora" e não "executora".
- **Prompt Corrigido**: "vc é ta no papel de professor apenas e nao executor apenas eu executo me mostre no que errei, pq errei e o passo a passo de como corrigir junto com o conceito do que esta sendo arrumando @teste-senior.md lembresse tbm que estamos fazendo esse desafio tecnico @HISTORICO_ARQUITETURA_HEXAGONAL.md para maior contexto do que estamos estudando"
- **Resultado**: A IA identificou os erros conceituais nos adaptadores, portas e caso de uso. Forneceu um plano de ação detalhado, explicando os "porquês" de cada passo (criação do Repository, do Mapper, injeção de dependências corretas, e o fluxo de dados entre Camada de Entrada -> Porta de Entrada -> Caso de Uso -> Porta de Saída -> Adaptador de Saída). O desenvolvedor executou o plano, corrigindo o fluxo.

**Decisão Influenciada pela IA**: A decisão de usar o padrão **Mapper** (com MapStruct) foi reforçada pela IA para automatizar a conversão entre a entidade de domínio e a entidade de persistência. Além disso, o princípio da **Inversão de Dependência** foi aplicado na prática, fazendo o Controller depender da abstração da Porta de Entrada, e o Caso de Uso depender da abstração da Porta de Saída.

### 4. Definição do Papel da IA e Próximos Passos
**Contexto**: Com os conceitos de base solidificados, o foco mudou para o desenvolvimento prático do `rh-app`, iniciando pela funcionalidade de `Department`.

**Interação com a IA**:
- **Prompt**: "de uma ultma olhada no que fiz e commitei e gere um resumo do que fizemos me traga em tela o resumo e tbm atualize o @rh-app/AI_USAGE.md que é um dos requisitos do @teste-senior.md... lembrese do que foi combinado no @HISTORICO_ARQUITETURA_HEXAGONAL.md que vc adicione todo o meu prompt para que seja observado minha linha de racicionio"
- **Resultado**: A IA assimilou o papel de "professor/guia", comprometendo-se a focar nos conceitos e no raciocínio, em vez de gerar código diretamente. A IA também se tornou responsável por manter este documento (`AI_USAGE.md`) atualizado, registrando o processo de aprendizado e desenvolvimento conjunto.

**Decisão Influenciada pela IA**: O modo de interação foi estabelecido como socrático. A IA não entregará soluções prontas, mas guiará o desenvolvimento através de perguntas e da estruturação de fluxos de trabalho. O plano é continuar usando a IA como um parceiro de "pair programming" socrático para as próximas funcionalidades.