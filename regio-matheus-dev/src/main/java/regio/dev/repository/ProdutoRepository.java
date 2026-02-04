package regio.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import regio.dev.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
