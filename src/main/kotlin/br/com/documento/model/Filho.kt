package br.com.documento.model

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel(value = "Filho")
data class Filho(@ApiModelProperty(value = "Nome completo do filho", required = true) val nome: String,
                 @ApiModelProperty(value = "Idade do filho em anos") val idade: Int)