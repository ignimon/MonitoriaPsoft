package mercadofacil.mercadofacil.Controller;

import jakarta.validation.Valid;
import mercadofacil.mercadofacil.Dto.ProdutoPostPutDto;
import mercadofacil.mercadofacil.Dto.ProdutoResponseDto;
import mercadofacil.mercadofacil.Service.ProdutoCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(value = "/v1/produtos", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProdutoV1Controller {

    @Autowired
    ProdutoCrudService produtoCrudService;

    @PostMapping("")
    public ResponseEntity<ProdutoResponseDto> criarProduto(
            @RequestBody @Valid ProdutoPostPutDto produtoPostPutDto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(produtoCrudService.criarProduto(produtoPostPutDto));
    }

    @GetMapping("")
    public ResponseEntity<List<ProdutoResponseDto>> buscarTodosProdutos() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(produtoCrudService.buscarTodosProdutos());
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<ProdutoResponseDto> atualizarProduto() {
        return ResponseEntity
            .status(HttpStatus.ACCEPTED)
            .body(ProdutoCrudService.atualizarProduto());
    }   

}
