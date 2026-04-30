class Pilha<T> { //Pilha

    private val elementos = mutableListOf<T>()

    fun push(valor: T) {
        elementos.add(valor)
    }

    fun pop(): T? {
        if (elementos.isEmpty()) return null
        return elementos.removeAt(elementos.size - 1)
    }

    fun peek(): T? {
        return elementos.lastOrNull()
    }

    fun estaVazia(): Boolean {
        return elementos.isEmpty()
    }
}
