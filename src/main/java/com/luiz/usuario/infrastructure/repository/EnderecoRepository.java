package com.luiz.usuario.infrastructure.repository;

 import org.springframework.data.jpa.repository.JpaRepository;
 import com.luiz.usuario.infrastructure.entity.Endereco;
 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
