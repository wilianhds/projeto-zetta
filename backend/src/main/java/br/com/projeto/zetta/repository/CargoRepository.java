package br.com.projeto.zetta.repository;

import br.com.projeto.zetta.models.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {
    Cargo findByNome(String nome);

    List<Cargo> findAllByOrderByNome();
}
