package br.com.jvneves.gestao_vagas.modules.company.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateJobDTO {

  @Schema(example = "Vaga para pessoa desenvolvedora junior", requiredMode = RequiredMode.REQUIRED)
  private String description;

  @Schema(example = "GymPass, Plano de saude", requiredMode = RequiredMode.REQUIRED)
  private String benefits;

  @Schema(example = "JUNIOR", requiredMode = RequiredMode.REQUIRED)
  private String level;

}
