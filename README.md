# Sistema de Votação 2025

Sistema em Java para simulação de votação com geração aleatória de votos, organização por seção e candidato, análise estatística e exportação de resultados para arquivo ``.txt``.

**Nota: O ano decrito no código é meramente ilustrativo e não corresponde a eleições reais.**

---

## Visão Geral

O projeto simula um processo de votação com 200 eleitores distribuídos em 10 seções, gerando automaticamente votos aleatórios para candidatos. A partir desses dados, o sistema realiza o processamento e a análise dos resultados.

---

## Demonstração
### Menu principal do sistema
<p align="center">
  <img src="imgs/menu.png" width="350"/>
</p>

### Menu "Mostrar Indicadores"
<p align="center">
  <img src="imgs/menu2.png" width="350"/>
</p>

### Geração de dados no sistema
<p align="center">
  <img src="imgs/geracao-dados.png" width="400"/>
</p>

### Estatísticas geradas
<p align="center">
  <img src="imgs/estatistica.png" width="300"/>
</p>
<p align="center">
  <img src="imgs/estatistica2.png" width="300"/>
</p>
<p align="center">
  <img src="imgs/estatistica3.png" width="300"/>
</p>
<p align="center">
  <img src="imgs/estatistica4.png" width="300"/>
</p>


## Arquivo Votacao2025.txt
<p align="center">
  <img src="imgs/arquivo.png" width="600"/>
</p>

---

## Funcionalidades
- Geração automática de votos para 200 eleitores
- Distribuição de votos entre 10 seções
- Registro de número de candidato e seção
- Classificação dos votos por seção
- Identificação de:
  - Seção com mais e menos eleitores
  - Quantidade de votos por candidato
  - Top 10 candidatos mais votados
- Geração de arquivo ``.txt`` com os registros

---

## Estrutura do Projeto

- `ClassePrincipal.java`  
  - Classe principal que executa o sistema e apresenta o menu de opções.
- `ClasseMetodos.java`  
  - Contém todos os métodos de geração de votos, classificação, gravação em arquivo e exibição de indicadores.
- `Votacao.java`  
  - Classe que representa cada voto, contendo `NumeroSecao` e `NumeroCandidato`.

---

## Fluxo do sistema

```mermaid
flowchart TD
A[Início] --> B[Gerar votos automaticamente]

B --> C[200 eleitores / 10 seções / candidatos aleatórios]

C --> D[Classificação dos votos por seção]

D --> E[Processamento estatístico]

E --> F1[Qtd de eleitores por seção]
E --> F2[Seção com mais e menos votos]
E --> F3[Votos por candidato]
E --> F4[Top 10 candidatos]

F1 --> G[Exibição dos resultados]
F2 --> G
F3 --> G
F4 --> G

G --> H[Geração do arquivo Votacao2025.txt]
H --> I[Fim]
```

## 🧰 Tecnologias Utilizadas

| Tecnologia | Uso principal |
|-------------|----------------|
|  **Java SE** | Linguagem base |
|  **JOptionPane (Swing)** | Interface de entrada e saída |
|  **BufferedWriter / FileWriter** | Manipulação de arquivos |
|  **Random** | Geração automática de dados |

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

---

## 👩‍💻 Autora
### Emily Rharysa
#### 💻 Desenvolvedora Web | Estudante de Tecnologia
#### 📫 [LinkedIn](https://www.linkedin.com/in/emyrhf/)
