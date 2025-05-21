package br.com.sesau.ms_zoonoses_funcionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.sesau.ms_zoonoses_funcionario.model.MFuncionario;

public interface RFuncionario extends JpaRepository<MFuncionario, Long> {
    
}