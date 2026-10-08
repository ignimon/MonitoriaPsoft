package mercadofacil.mercadofacil.Service;

import mercadofacil.mercadofacil.Dto.ProdutoPostPutDto;
import mercadofacil.mercadofacil.Dto.ProdutoResponseDto;

import java.util.List;

import org.springframework.http.HttpStatus;

public interface ProdutoCrudService {
    ProdutoResponseDto criarProduto(ProdutoPostPutDto produtoPostPutDto);

    List<ProdutoResponseDto> buscarTodosProdutos();

    ProdutoResponseDto atualizarProduto(ProdutoPostPutDto produtoPostPutDto, Long id);

    HttpStatus deletarProduto(Long id);
}
