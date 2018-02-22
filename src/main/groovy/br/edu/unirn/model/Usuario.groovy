package br.edu.unirn.model

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString


@ToString
@EqualsAndHashCode(includes = ["id"])
class Usuario {

    Long id
    String email
    String senha
    String senhaAlerta

    Date dataCadastro = new Date()
}
