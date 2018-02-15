package br.com.documento

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DocumentoApplication

fun main(args: Array<String>) {
    runApplication<DocumentoApplication>(*args)
}
