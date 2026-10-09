# Mercado Fácil
## Como rodar

1. Suba o back-end (na pasta `mercadofacil`):
   ```bash
   ./gradlew bootRun
   ```
2. Em outro terminal, nesta pasta:
   ```bash
   npm install
   npm run dev
   ```
3. Abra http://localhost:5173

## Endpoints usados

| Ação             | Método | Rota                 | Status            |
|------------------|--------|----------------------|-------------------|
| Listar produtos  | GET    | `/v1/produtos`       | implementado      |
| Criar produto    | POST   | `/v1/produtos`       | implementado      |
| Editar produto   | PUT    | `/v1/produtos/{id}`  | implementado      |
| Remover produto  | DELETE | `/v1/produtos/{id}`  | implementado      |

## Roadmap Adições extras (apenas coisas que quero implementar por curiosidade)
- [ ] login.
- [ ] improvents on the frontEnd.
- [ ] add to cart.
- [ ] pseudoPayment.
- [ ] others. (thinking of).

## MonitoriaPsoft
Materiais e códigos da disciplina de Projeto de Software.

# Vídeo Aula I
Link: https://drive.google.com/file/d/1TqYpHkfgJQGi8iILhsEwc3Ry8Zkx_XlL/view?usp=sharing

# Vídeo Aula II
Link: https://drive.google.com/file/d/1ODOr6WSpnEDZb0hcpTNbg4W0mIizU5Ge/view?usp=drivesdk
