package br.com.sesau.ms_zoonoses_funcionario.model;

import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.br.CPF;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "funcionario")
public class MFuncionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Size(min = 20)
    @Column(name = "funcionario" , nullable = false)
    private String nome;

    @NotNull
    @NotBlank
    @Column(name = "cargo" , nullable = false)
    private String cargo;

    @Email
    @Column(name = "email" , nullable = false)
    private String email;

    @CPF    
    @Size(min = 11)
    @Column(name = "cpf" , nullable = false)
    private String cpf;

    @Temporal(value = TemporalType.TIMESTAMP)
    @CreationTimestamp
    private LocalDateTime dt_cadastro;

    @Temporal(value = TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private LocalDateTime dt_atualizacao;
}