### Documentação para o Teste Técnico - Oak Tecnologia

#### Objetivo

Desenvolver uma aplicação que permita o cadastro de produtos, exibição de produtos cadastrados em uma lista, e possibilite a ordenação dos produtos por valor. O fluxo da aplicação deve permitir ao usuário cadastrar produtos e visualizar a lista de produtos de maneira intuitiva e interativa.

---

### Funcionalidades do Sistema

1. **Cadastro de Produto**:
   O sistema deve permitir que o usuário cadastre um novo produto fornecendo os seguintes dados:
    - **Nome do produto**: Campo de texto onde o usuário insere o nome do produto.
    - **Descrição do produto**: Campo de texto onde o usuário insere uma descrição breve do produto.
    - **Valor do produto**: Campo de valor numérico, onde o usuário informa o preço do produto.
    - **Disponível para venda**: Campo com duas opções ("Sim" ou "Não"), para indicar se o produto está disponível para venda.

   Após o cadastro de um novo produto, a lista de produtos deve ser atualizada automaticamente.

2. **Listagem de Produtos**:
   A listagem deve exibir os produtos cadastrados com as seguintes informações:
    - **Nome do produto**: Nome do produto cadastrado.
    - **Valor do produto**: Preço do produto, exibido no formato adequado (com 2 casas decimais).

   A listagem deve ser organizada de forma crescente, do menor para o maior valor de produto.

3. **Interação com a Listagem**:
    - Após o cadastro de um novo produto, a listagem de produtos é exibida automaticamente.
    - A listagem deve permitir ao usuário visualizar todos os produtos cadastrados.
    - Deve existir um botão que possibilite ao usuário cadastrar um novo produto diretamente a partir da tela da listagem, facilitando a interação.

---

### Requisitos Funcionais

- **Cadastro de Produto**:
    - O sistema deve permitir o cadastro de produtos com as informações mencionadas (nome, descrição, valor, e disponibilidade).
    - O formulário de cadastro deve ter validação para garantir que todos os campos obrigatórios sejam preenchidos corretamente.

- **Listagem de Produtos**:
    - A lista de produtos deve exibir os dados de nome e valor de todos os produtos cadastrados.
    - A ordenação deve ser realizada por valor de forma crescente.

- **Atualização Automática da Listagem**:
    - Após o cadastro de um produto, a listagem deve ser atualizada automaticamente sem a necessidade de ações adicionais do usuário.

- **Cadastro a partir da Listagem**:
    - A tela de listagem de produtos deve apresentar um botão que permita ao usuário cadastrar um novo produto diretamente de lá, sem precisar navegar para outra tela ou menu.

---

### Requisitos Não Funcionais

- **Interface**:
    - A interface deve ser simples e intuitiva, de fácil navegação, com campos de texto claros e botões visíveis.
    - O layout da tela de listagem deve ser organizado, com a exibição dos produtos em uma tabela com as colunas de nome e valor.

- **Performance**:
    - A aplicação deve ser eficiente, com tempo de resposta rápido nas interações com o usuário, incluindo o cadastro de produtos e a exibição da lista.


---

### Exemplos de Fluxo

#### Fluxo 1: Cadastro de Produto

1. O usuário acessa a tela de cadastro de produtos.
2. Preenche os campos:
    - Nome: "Produto A"
    - Descrição: "Produto de exemplo"
    - Valor: 100.00
    - Disponível para venda: "Sim"
3. O sistema confirma o cadastro do produto e exibe a lista de produtos automaticamente.
4. O sistema apresenta a listagem com o produto recém-cadastrado.

#### Fluxo 2: Listagem de Produtos

1. O usuário acessa a tela de listagem de produtos.
2. O sistema exibe os produtos cadastrados, organizados do menor para o maior valor.
3. O usuário observa que os produtos estão sendo apresentados de forma ordenada.
4. O usuário clica no botão para cadastrar um novo produto.
5. O sistema redireciona para o formulário de cadastro.

#### Fluxo 3: Cadastro de Novo Produto a partir da Listagem

1. O usuário acessa a tela de listagem de produtos.
2. O usuário selecionar a opção "Cadastrar Novo Produto".
3. O sistema exibe o formulário de cadastro de produto.
4. O usuário preenche os campos e cadastra o novo produto.
5. A listagem de produtos é atualizada automaticamente, exibindo o novo produto.

---


