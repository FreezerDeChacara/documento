package br.com.documento.controller

import br.com.documento.helper.Resposta
import br.com.documento.model.Filho
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Api(value = "Teste API")
@RestController
@RequestMapping("/documento")
open class DocumentoController {

    @ApiOperation(value = "Retorna o Lucas", notes = "Nome e a idade")
    @GetMapping("/consulta")
    fun consulta(): Filho {
        return Filho("Lucas", 3)
    }

    @ApiOperation(value = "Cria um novo filho", notes = "Vai ficar caro")
    @PostMapping("/filho")
    fun cadastrarFilho(@RequestBody filho: Filho) :ResponseEntity<Resposta>{
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(Resposta("Teste"))
    }
}