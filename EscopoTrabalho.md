## Escopo do Trabalho Final

### Sistema Estofaria

Você deve implementar um sistema de informações para auxiliar um artesão à organizar os pedidos de uma estofaria.

Considerando esse contexto crie um projeto no Eclipse com o nome de "Estofaria" com as seguintes funcionalidades:

### Menus

* O usuário deve ser capaz de acessar todas as funcionalidades do sistem através de menus, com opções núméricas e todos os menus devem ter a opção "99" para voltar ao menu anterior ou sair do sistema caso, esteja no menu principal;

* O menu principal do sistema deve ter as opções "Clientes", "Pedidos", "Materiais" e "Relatórios";

### Clientes

* O sistema deve manter um cadastro de clientes, com Nome, CPF, endereço, e-mail.
* O menu de clientes deve ter as opções "Cadastrar" e "Pesquisar".
* Ao selecionar "Cadastrar", o usuário pode adicionar um novo cliente na base de dados;
* Ao "Pesquisar", pode ser informado o código **OU** o nome do cliente. O sistema deve fazer a busca, por código **OU** nome e retornar uma lista com os resultados encontrados.
* Na lista o sistema deve oferecer as opções "Remover" e "Alterar"; O usuário seleciona a opção e o informa o código do registro;
* No caso de remoção deve ser exibida uma mensagem com os dados do cliente e solicitando a confirmação do usuário, caso afirmativo o registro é deletado do banco de dados.
* Caso hajam pedidos associados ao cliente, a remoção pode falhar dependendo da forma que você criar a relação no banco de dados. Caso isso ocorra, informe ao usuário.
* Na alteração, são solicitados os novos dados do cliente, considerando "nulo" como "não alterar". Os novos dados são exibidos no final, solicitando uma confirmação do usuário. Caso afirmativo, os dados são atualizados no banco;

### Materiais

* O sistema deve manter um cadastro de materiais com nome e descrição.
* O menu de materiais deve ter as opções "Cadastrar" e "Pesquisar".
* Ao selecionar "Cadastrar", o usuário pode adicionar um novo material na base de dados;
* Ao "Pesquisar", pode ser informado o código **OU** o nome do material. O sistema deve fazer a busca, por código **OU** nome e retornar uma lista com os resultados encontrados.
* Na lista o sistema deve oferecer as opções "Remover" e "Alterar". O usuário seleciona a opção e o informa o código do registro;
* No caso de remoção deve ser exibida uma mensagem com os dados do material e solicitando a confirmação do usuário, caso afirmativo o registro é deletado do banco de dados.
* Caso hajam pedidos associados ao material, a remoção pode falhar dependendo da forma que você criar a relação no banco de dados. Caso isso ocorra, informe ao usuário.
* Na alteração, são solicitados os novos dados do material, considerando "nulo" como "não alterar". Os novos dados são exibidos no final, solicitando uma confirmação do usuário. Caso afirmativo, os dados são atualizados no banco;

### Pedidos

* O sistema deve manter um controle de pedidos com cliente, descrição, materiais necessários e status.
* O menu de pedidos deve ter as opções "Cadastrar" e "Pesquisar".
* Ao selecionar "Cadastrar", o usuário pode adicionar um novo pedido na base de dados.
* Ao cadastrar sistema deve solicitar ao usuário o cliente, através de busca por código **OU** o nome. Após a busca, com o resultado na tela o usuário informa o código dos registro desejado para cliente;
* Selecionado o clienteuma descrição para o trabalho e quais os materiais necessários para atender o pedido. Em seguida conferir os dados do pedido e salvar ele no banco;
* Ao "Pesquisar", deve ser informado o código do pedido. Caso o usuário não saiba, ele pode informar 0 (zero) para que sejam exibidos todos os pedidos. O sistema deve fazer a busca e retornar uma lista com os resultados encontrados, informando o código do pedido, o NOME do cliente e a descrição do serviço.
* Na lista o sistema deve oferecer as opções "Cancelar" e "Fechar"; O usuário seleciona a opção e o informa o código do registro;
* No caso de cancelamento deve ser exibida uma mensagem com os dados do pedido solicitando a confirmação do usuário, caso afirmativo o status do pedido é alterado para "CANCELADO".
* No fechamento, o status do pedido é alterado para "FECHADO";
* Processamento em lote. Permita que o usuário informe uma sequência de pedidos e efetue o fechamento ou cancelamento de todos ao mesmo tempo;

### Relatórios

* O sistema de oferecer relatórios para o usuário. Os relatórios disponíveis são: "Pedidos", "Materiais" e "Pedidos x Materiais";
* Em "Pedidos" o usuário deve selecionar se deseja ver "Novos", "Fechados", "Cancelados" ou "Todos". Depois de selecionar o sistema apresenta uma lista dos pedidos com o nome do cliente, a descrição do serviço e a lista de materiais necessários para cada pedido;
* Em "Materiais" o sistema exibe a lista de todos os materiais cadastrados em ordem alfabética;
* Em "Pedidos x Materiais" deve ser mostrado o nome de cada material e a quantidade de pedidos "Novos" existem para cada material;
