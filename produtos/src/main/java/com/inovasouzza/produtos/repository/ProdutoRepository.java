package com.inovasouzza.produtos.repository;

import com.inovasouzza.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

/*classe responsável por fazer operações no banco de dados com a entidade produtos
* vou extender JPA e passar o Produto e vou passar o tipo da propriedade do meu id (Long,
* Integer etc)*/
public interface ProdutoRepository extends JpaRepository <Produto, Long> {
}
