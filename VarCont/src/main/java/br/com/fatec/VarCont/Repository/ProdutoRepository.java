package br.com.fatec.VarCont.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.fatec.VarCont.DataSource.Models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	@Query("SELECT p FROM Produto p WHERE p.id = :id")
	Optional<Produto> getById(@Param("id") Long id);
}
