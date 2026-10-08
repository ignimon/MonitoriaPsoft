package mercadofacil.mercadofacil.Service;

import org.modelmapper.ModelMapper;
import mercadofacil.mercadofacil.Dto.ProdutoPostPutDto;
import mercadofacil.mercadofacil.Dto.ProdutoResponseDto;
import mercadofacil.mercadofacil.Model.Produto;
import mercadofacil.mercadofacil.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProdutoCrudPadraoService implements ProdutoCrudService {
    
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public ProdutoResponseDto criarProduto(ProdutoPostPutDto produtoPostPutDto) {
        Produto produto = modelMapper.map(produtoPostPutDto, Produto.class);
        return modelMapper.map(produtoRepository.save(produto), ProdutoResponseDto.class);
    }

    @Override
    public List<ProdutoResponseDto> buscarTodosProdutos() {
        return produtoRepository.findAll()
                .stream()
                .map(produto -> modelMapper.map(produto, ProdutoResponseDto.class))
                .toList();
    }

    @Override
    public ProdutoResponseDto atualizarProduto(ProdutoPostPutDto produtoPostPutDto, Long id) {
        Produto produto = produtoRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(
            HttpStatus.NOT_FOUND, 
            "produto não encontrado"));
            modelMapper.map(produtoPostPutDto, produto);
        return modelMapper.map(produtoRepository.save(produto), ProdutoResponseDto.class);
    }

    @Override
    public HttpStatus deletarProduto(Long id) {
        produtoRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
