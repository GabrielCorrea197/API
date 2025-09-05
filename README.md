#  Loltipos – API de Dados do League of Legends

**Loltipos** é uma API criada para fornecer **dados estruturados sobre o universo do League of Legends (LoL)**, como campeões, classes, regiões, papéis (roles) e outras categorias importantes do jogo.

Ideal para projetos educacionais, fãs, sites de conteúdo, bots ou sistemas que precisam de informações organizadas sobre o LoL — sem precisar acessar a API oficial diretamente.

---

##  O que é "Loltipos"?

O nome é uma junção de:
- **LoL** → *League of Legends*
- **Tipos** → categorias, tipos de dados

Ou seja: **"Tipos de dados do LoL"**

Este projeto pode ser usado para:
- Listar campeões por classe (ex: Assassino, Mago)
- Mostrar regiões de origem (ex: Demacia, Noxus)
- Informar papéis (Top, Jungle, Mid, ADC, Support)
- Fornecer dados básicos em JSON para aplicações front-end ou back-end

---

##  Tecnologias Utilizadas (sugestão)

Provavelmente:
- **Node.js + Express** (ou Python/Flask)
- Dados armazenados em arquivos JSON (estáticos)
- Rotas REST simples
- Sem banco de dados (ideal para projetos escolares)

> ⚠ Ajuste conforme seu código real.

---

##  Como Usar

Clone o repositório:
   git clone https://github.com/GabrielCorrea197/API.git
   cd API/loltipos

Instale as dependências:
npm install

Inicie o servidor:
npm start

Acesse no navegador ou via API:
http://localhost:3000/api/champions
http://localhost:3000/api/roles
http://localhost:3000/api/regions

Endpoints da API
GET
/api/champions
Lista todos os campeões
GET
/api/champions/:id
Detalhes de um campeão específico
GET
/api/roles
Papéis (Top, Jungle, etc)
GET
/api/classes
Classes (Assassino, Mago, Tanque, etc)
GET
/api/regions
Regiões do universo de LoL (ex: Ionia, Piltover)

Exemplo de Resposta
GET /api/champions/ahri
{
  "id": "ahri",
  "nome": "Ahri",
  "classe": "Assassino",
  "papel": "Mid",
  "regiao": "Ionia",
  "dificuldade": 7,
  "descricao": "Uma Vastaya que absorve almas de seus inimigos."
}

Estrutura Sugerida
loltipos/
│
├── data/
│   ├── champions.json
│   ├── roles.json
│   ├── classes.json
│   └── regions.json
│
├── routes/
│   ├── champions.js
│   ├── roles.js
│   └── regions.js
│
├── app.js
├── server.js
├── package.json
└── README.md

Objetivo Educacional
Este projeto foi feito como trabalho escolar sobre League of Legends, com foco em:

Organizar informações do jogo de forma lógica
Criar uma API simples com Node.js ou semelhante
Aplicar conceitos de REST, JSON e rotas
Mostrar paixão pelo universo do LoL de forma técnica
