package br.net.garcez.mscartoes.infra.repository;

import br.net.garcez.mscartoes.domain.ClienteCartao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteCartaoRepository extends JpaRepository<ClienteCartao,Long> {

    List<ClienteCartao> findByCpf(String cpf);
}
