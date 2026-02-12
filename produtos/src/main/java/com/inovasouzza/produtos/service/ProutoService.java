package com.inovasouzza.produtos.service;

import com.inovasouzza.produtos.model.Produto;
import com.inovasouzza.produtos.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProutoService {

    private final ProdutoRepository repository;

    //Method salvar
    public Produto salvar(Produto produto){
        return repository.save(produto);
    }

    // Method obter por código
    public Optional<Produto> obterPorCodigo(Long codigo){
        return repository.findById(codigo);
    }

}
