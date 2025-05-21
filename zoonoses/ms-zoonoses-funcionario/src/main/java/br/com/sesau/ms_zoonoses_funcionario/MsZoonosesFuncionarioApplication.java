package br.com.sesau.ms_zoonoses_funcionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsZoonosesFuncionarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsZoonosesFuncionarioApplication.class, args);
	}
}