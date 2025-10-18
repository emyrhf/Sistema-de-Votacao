# Sistema de Votação 2025

Projeto em Java para simular um sistema de votação com registro aleatório de votos por seção e por candidato, cálculo de estatísticas e geração de arquivo de resultados.

**Nota: O ano decrito no código é meramente ilustrativo e não corresponde a eleições reais.**

---

## Autor

**Emily Rharysa**

---

## Descrição

Este projeto implementa um sistema de votação simplificado que permite:

- Gerar votos aleatórios para 200 eleitores distribuídos em 10 seções.
- Registrar o número do candidato e a seção de cada voto.
- Classificar os votos por seção.
- Gerar um arquivo `Votacao2025.txt` com os registros de votos.
- Exibir indicadores e estatísticas de votação, incluindo:
  - Quantidade de eleitores por seção.
  - Seção com maior e menor número de eleitores.
  - Quantidade de votos por candidato.
  - Os 10 candidatos mais votados.

O projeto é desenvolvido com interface simples usando `JOptionPane` para interação com o usuário.

---

## Estrutura do Projeto

- `ClassePrincipal.java`  
  - Classe principal que executa o sistema e apresenta o menu de opções.
- `ClasseMetodos.java`  
  - Contém todos os métodos de geração de votos, classificação, gravação em arquivo e exibição de indicadores.
- `Votacao.java`  
  - Classe que representa cada voto, contendo `NumeroSecao` e `NumeroCandidato`.

---

## Funcionalidades

1. **Carregar votos aleatórios**  
   Gera votos para 200 eleitores, com seções de 1 a 10 e candidatos de 1 a 300.

2. **Classificar votos por seção**  
   Organiza os registros por número de seção para facilitar análise.

3. **Gravar registros em arquivo**  
   Cria o arquivo `Votacao2025.txt`, contendo o número da seção e do candidato para cada voto.

4. **Mostrar indicadores**  
   Apresenta, via `JOptionPane`:
   - Quantidade de eleitores por seção.
   - Seção com maior e menor número de eleitores.
   - Quantidade de votos por candidato.
   - Top 10 candidatos mais votados.

---

## Como Executar

1. Clonar o repositório:

```
git clone https://github.com/seu-usuario/sistema-de-votacao.git
```

2. Compilar os arquivos Java
```
javac ClassePrincipal.java ClasseMetodos.java Votacao.java
```

3. Executar a aplicação
```
java ClassePrincipal
```
