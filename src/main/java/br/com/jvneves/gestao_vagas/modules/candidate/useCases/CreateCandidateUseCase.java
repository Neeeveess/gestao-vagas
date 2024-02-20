package br.com.jvneves.gestao_vagas.modules.candidate.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.jvneves.gestao_vagas.exceptions.UserFoundException;
import br.com.jvneves.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.jvneves.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.jvneves.gestao_vagas.modules.company.entities.CompanyEntity;

@Service
public class CreateCandidateUseCase {

  @Autowired
  private CandidateRepository candidateRepository;

  public CandidateEntity execute(CandidateEntity candidateEntity) {
    this.candidateRepository
        .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
        .ifPresent((user) -> {
          throw new UserFoundException();
        });

    return this.candidateRepository.save(candidateEntity);
  }

}
