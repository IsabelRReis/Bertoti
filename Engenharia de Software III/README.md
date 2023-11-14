<table>
    <tr>
        <td>Nome do padrão</td>
        <td>Anti-padrão</td>
        <td>Definição do padrão</td>
        <td>Problema que ele resolve</td>
        <td>Onde é utilizado na arquitetura Java</td>
        <td>Bibliotecas</td>
    </tr>   
    <tr>
        <td>Strategy</td>
        <td>Herança</td>
        <td>Encapsular uma familia de algoritmos e tornar intercambiável através de polimorfismo</td>
        <td>Herança que duplica código</td>
        <td>Usado em Java para Ordenação de coleções, Processamento de arquivos, Algoritmos de criptografia, Comportamento de validação, Implementação de algoritmos complexos, etc</td>
        <td>Alguns exemplos de bibliotecas que utilizam a arquitetura Strategy: Comparator, Servlet, Executo.</td>
    </tr>
    <tr>
        <td>Observer</td>
        <td>Alto acoplamento</td>
        <td>Permite definir um mecanismo de assinatura para notificar vários objetos sobre quaisquer eventos que ocorram com o objeto que eles estão observando</td>
        <td>Evita o Alto acoplamento e torna o código baixo acoplado, evitando que fiquem de certo modo indistinguíveis</td>
        <td>Usado em Java para GUI, MVC, Tratamento de eventos, Padrões de designer, Gerenciamento de dados, etc</td>
        <td>Alguns exemplos de bibliotecas que utilizam a arquitetura Observer: Observable, Session Binding Listener, Property</td>
    </tr>
    <tr>
        <td>Composite</td>
        <td>Código de grande complexidade, difícil manutenção</td>
        <td>Usado quando é necessário implementar uma estrutura de objeto semelhante a uma árvore</td>
        <td>Evita a duplicação de código, usando o polimorfismo, e usa recursão, o que é essencial para a estrura em árvore, para separar o problema em partes, e resolve cada parte chamando uma cópia de si mesma.</td>
        <td>Usado em Java para criar uma estrutura hierárquica de objetos de maneira que os objetos individuais e compostos possam ser tratados de maneira uniforme.</td>
        <td>Alguns exemplos de bibliotecas que utilizam a arquitetura Composite: Swing, JavaFX, AWT</td>
    </tr>
    <tr>
        <td>Facade</td>
        <td>Uma única classe ou objeto assume muitas responsabilidades, tornando-o difícil de entender e modificar</td>
        <td>Fornece uma interface simplificada para um conjunto de interfaces mais complexas em um subsistema. Ele atua como uma fachada ou ponto de entrada único para um conjunto de funcionalidades relacionadas, ocultando a complexidade interna do subsistema e tornando mais fácil para os clientes usarem</td>
        <td>Resolve o problema de lidar com sistemas complexos, ocultando a complexidade dos clientes.</td>
        <td>Usado em Java em bibliotecas de persistência de dados, como o Hibernate, onde uma fachada simplificada é fornecida para interagir com o sistema de gerenciamento de banco de dados subjacente, ocultando a complexidade das consultas SQL e outras operações.</td>
        <td>Alguns exemplos de bibliotecas que utilizam a arquitetura Facade: JDBC, JPA, Spring</td>
    </tr>
    <tr>
        <td>Singleton</td>
        <td>Múltiplas instâncias da classe parecem compartilhar o mesmo estado</td>
        <td>O padrão Singleton garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância</td>
        <td>Resolve o problema de garantir que uma classe tenha apenas uma única instância durante toda a vida útil do programa.</td>
        <td>Usado em Java no gerenciamento de Conexões de banco de dados, Pools de objetos, Caches, Registros de log, Configurações de aplicativos, etc</td>
        <td>Alguns exemplos de bibliotecas que utilizam a arquitetura Singleton: Servlets, Logger, Spring</td>
    </tr>
</table>
