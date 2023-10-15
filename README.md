![GitHub repo size](https://img.shields.io/github/repo-size/Bernardo-Hack/PJBL3-TabelaHash?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/Bernardo-Hack/PJBL3-TabelaHash?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/Bernardo-Hack/PJBL3-TabelaHash?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/Bernardo-Hack/PJBL3-TabelaHash?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/Bernardo-Hack/PJBL3-TabelaHash?style=for-the-badge)

# PJBL 3 - Tabela Hash
> PjBL3 da matéria de Resolução de Problemas Estruturados em Computação.
> Nesse projeto foi implementado duas Tabelas Hash cada uma com seu tipo de tratamento de colisão 
### Funcionalidades

Foram implementados:

- [X] inserção
- [X] busca
- [X] remoção
- [X] 2 formas de tratameno de colisão
- [X] Teste de eficiência
- [X] Fator de carga


### Sobre cada Funcionalidade
### Função de espalhamento
Essa função de espalhamento aceita chaves do tipo String e int simultâneamente

<img src="https://github.com/Bernardo-Hack/PJBL3-TabelaHash/blob/main/prints/espalhamento.png" width="300px;" alt="">

### Primeiro tipo de tratamento de colisão
Esse é o tratamento de colisão homogênio, ou seja, adiciona valores nos proximos espaços vazios em casos de colisão

#### Inserção
Inserir o objeto, por código, utilizando a função hash (espalhamento)

<img src="https://github.com/Bernardo-Hack/PJBL3-TabelaHash/blob/main/prints/insert.png" width="300px;" alt="">


#### Busca
Buscar o objeto a partir da chave informada, por código ou input, e retornar o objeto
encontrado (se existir)

<img src="https://github.com/Bernardo-Hack/PJBL3-TabelaHash/blob/main/prints/search.png" width="300px;" alt=""> 


#### Remoção
Remover o objeto a partir da chave informada, por código ou input, e retornar o
objeto removido (se existir)

<img src="https://github.com/Bernardo-Hack/PJBL3-TabelaHash/blob/main/prints/delete.png" width="300px;" alt=""> 


### Segundo tipo de tratamento de colisão
Esse é o tratamento de colisão por lista encadeada, ou seja, adiciona valores em uma lista encadeada em casos de colisão 

#### Classe privada MyNode
Essa é a classe de objetos privada que o segundo tipo de espalhamento utiliza para armazenar dados

<img src="https://github.com/Bernardo-Hack/PJBL3-TabelaHash/blob/main/prints/node.png" width="300px;" alt="">

#### Inserção
Inserir o objeto, por código ou input, utilizando a função hash (espalhamento)

<img src="https://github.com/Bernardo-Hack/PJBL3-TabelaHash/blob/main/prints/insertEx.png" width="300px;" alt="">


#### Busca
Buscar o objeto a partir da chave informada, por código ou input, e retornar o objeto
encontrado (se existir)

<img src="https://github.com/Bernardo-Hack/PJBL3-TabelaHash/blob/main/prints/searchEx.png" width="300px;" alt=""> 


#### Remoção
Remover o objeto a partir da chave informada, por código ou input, e retornar o
objeto removido (se existir)

<img src="https://github.com/Bernardo-Hack/PJBL3-TabelaHash/blob/main/prints/deleteEx.png" width="300px;" alt=""> 


## 🤝 Colaboradores

Agradecemos às seguintes pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="#">
        <a href="https://github.com/Bernardo-Hack" ><img src="https://avatars.githubusercontent.com/u/102930809?v=4" width="100px;" alt="Bernardo de Lima Hack no GitHub"/><br></a>
        <sub>
          <b>Bernardo de Lima Hack</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="#">
        <a href="https://github.com/EmyMatsu" ><img src="https://avatars.githubusercontent.com/u/132858538?v=4" width="100px;" alt="Foto da Emilly Matsuda no GitHub"/><br></a>
        <sub>
          <b>Emilly Matsuda</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="#">
        <a href="https://github.com/gribeiro08" ><img src="https://avatars.githubusercontent.com/u/104264294?v=4" width="100px;" alt="Foto da Gabriela Ribeiro no GitHub"/><br></a>
        <sub>
          <b>Gabriela Ribeiro</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

