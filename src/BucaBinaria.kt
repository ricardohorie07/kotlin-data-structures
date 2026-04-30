fun buscaBinaria(lista: List<Int>, alvo: Int): Int {
    var inicio = 0
    var fim = lista.size - 1

    while (inicio <= fim) {
        val meio = (inicio + fim) / 2

        if (lista[meio] == alvo) {
            return meio
        } else if (lista[meio] < alvo) {
            inicio = meio + 1
        } else {
            fim = meio - 1
        }
    }

    return -1
}