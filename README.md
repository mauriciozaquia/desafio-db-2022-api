# Desafio DBServer - Prova para alinhamento de conhecimentos em automação de testes
## Testes automatizados de API

Estes *Script* foi desenvolvido para o desafio de testes automatizados do alinhamento de conhecimentos **DBserver**, tem por objetivo testar e validar casos de uso para a API [**ApiDeTarefas**](https://apidetarefas.docs.apiary.io/)

### PRÉ REQUISITOS

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas ou dependências:

* [Git](https://git-scm.com)
* [Java](https://www.java.com/pt-BR/)
* [JDK](https://www.oracle.com/java/technologies/downloads/)
* [JUnit 5](https://junit.org/junit5/)
* [Gradle](https://gradle.org/)
* [REST-assured](https://rest-assured.io/)
* [Allure tests Report](https://qameta.io/allure-report/)

Além disto é bom ter uma IDE Java para trabalhar com o código como por exemplo o [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/) ou [Ecplipse](https://www.eclipse.org/downloads/) dentre outras.

### EXECUÇÃO

* Abra o projeto "desafio-db-2022-api"
* Navegar até o pacote src/test/java/tests/
* No package *tests* clicar com o botão direito
* Clicar no menu "Run 'Tests' in 'tests'"

### GERAÇÃO DE RELATÓRIO - ALLURE

* Apos executar os testes, verificar se foram gerados os arquivos no pacote "build/allure-results"
* Caso positivo, abrir o terminal (da IDE ou do sistema operacional)
* Digitar o comando "allure serve build/allure-results" sem as aspas
* O relatório irá abrir no navegador padrão em formato HTML

### CENÁRIOS DE TESTE

* Cenário 1: Listar um contato
* Cenário 2: Cadastrar um contato
* Cenário 3: Editar um contato (Atualizar o ID na classe)
* Cenário 4: Deletar um contato (Atualizar o id na classe)

### CENÁRIOS EXTRAS

* Cenário Extra 1: Criar um contato e validar o contrato (Json Schema) 
* Cenário Extra 2: Listar todos os contatos
* Cenário Extra 3: Criar um contato e deletar logo em seguida