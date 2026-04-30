class Caixa<T>(private var valor: T) { // Generics, um tipo que você define depois

    fun get(): T {
        return valor
    }

    fun set(novoValor: T) {
        valor = novoValor
    }
}