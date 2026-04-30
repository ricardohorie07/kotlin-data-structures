fun tamanhoNome(nome: String?): Int { // Null Safety, impedir erros com null, obrigar você a tratar null
    return nome?.length ?: 0
}