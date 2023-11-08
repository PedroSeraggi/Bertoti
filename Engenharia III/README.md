<table>
    <tr>
        <td>Nome do padrão</td>
        <td>Anti-padrão</td>
        <td>Definição do padrão</td>
        <td>Problema que ele resolve</td>
        <td>Onde é utilizado na arquitetura Java</td>
    </tr>
    <tr>
        <td>Observer </td>
        <td>Alto acoplamento</td>
        <td>Permite que objetos se registrem para receber notificações imediatas sobre eventos ocorrendo em um objeto observado.</td>
        <td>Minimiza o acoplamento entre objetos, resultando em um sistema altamente ágil e responsivo.</td>
        <td>Utilizado em Java para atualizar interfaces de usuário de forma automática e em tempo real, informar assinantes de eventos em sistemas de mensagens, manter a consistência de dados distribuídos, entre outras         finalidades.</td>
    </tr>
   </tr>
    <tr>
        <td>Strategy</td>
        <td>Herança</td>
        <td>Envolve agrupar diversas abordagens de tomada de decisão e possibilitar a troca versátil entre elas por meio do conceito de polimorfismo.</td>
        <td>Ajuda a evitar a complicação de decisões incorporadas, tornando o código mais adaptável.</td>
        <td>É empregado em Java para gerenciar estratégias de direcionamento de rede, escolha de algoritmos de criptografia, definição de políticas de autenticação, entre outras aplicações.</td>
    </tr>
 </tr>
    <tr>
        <td>Composite </td>
        <td>Complexidade significativa no código e manutenção desafiadora</td>
        <td>É empregado quando há a necessidade de criar estruturas hierárquicas de objetos, como árvores, e lidar com objetos individuais e agregados de forma homogênea.</td>
        <td>Previne a redundância de código e utiliza a recursão para dividir problemas em partes menores e resolvê-los de maneira eficaz.</td>
        <td>Utilizado em Java para representar estruturas de documentos, organizar componentes de interfaces de usuário, construir árvores de categorias, entre outras aplicações.</td>
    </tr>

 </tr>
    <tr>
        <td>Singleton</td>
        <td>Múltiplas instâncias da classe aparentam compartilhar o mesmo estado</td>
        <td>Assegura que apenas uma instância de uma classe seja criada e fornece um ponto global para acessar essa instância.</td>
        <td>Resolve o desafio de lidar com múltiplas instâncias da mesma classe, prevenindo inconsistências de estado.</td>
        <td>Empregado em Java para gerenciar recursos compartilhados, como conexões de banco de dados, caches de objetos, registros de log centralizados, configurações globais de aplicativos, entre outros usos.</td>
    </tr>

</tr>
    <tr>
        <td>Facade</td>
        <td>Uma única classe ou objeto assume muitas responsabilidades, tornando-o difícil de entender e modificar</td>
        <td>Fornece uma interface fácil de usar para um conjunto de funcionalidades complexas em um subsistema, ocultando detalhes internos.</td>
        <td>Resolve o desafio de interagir com sistemas complexos, simplificando o acesso aos serviços essenciais.</td>
        <td>Usado em Java em sistemas de gerenciamento de banco de dados, onde uma interface simples esconde a complexidade das consultas SQL, operações de banco de dados, etc.</td>
    </tr>
 
</table>
