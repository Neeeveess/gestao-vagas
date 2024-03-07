package br.com.jvneves.gestao_vagas.modules.candidate.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jvneves.gestao_vagas.exceptions.JobNotFoundException;
import br.com.jvneves.gestao_vagas.exceptions.UserNotFoundException;
import br.com.jvneves.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.jvneves.gestao_vagas.modules.company.repositories.JobRepository;

@Service
public class ApplyJobCandidateUseCase {

  @Autowired
  private CandidateRepository candidateRepository;

  @Autowired
  private JobRepository jobRepository;

  public void execute(UUID idCandidate, UUID idJob) {
    // validar se o candidato existe
    this.candidateRepository.findById(idCandidate)
        .orElseThrow(() -> {
          throw new UserNotFoundException();
        });

    // validar se a vaga existe
    this.jobRepository.findById(idJob)
        .orElseThrow(() -> {
          throw new JobNotFoundException();
        });

  }
}