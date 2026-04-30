class Fila<T> {

    private val elementos = mutableListOf<T>()

    // ➕ enqueue (entra no final)
    fun enqueue(valor: T) {
        elementos.add(valor)
    }

    // ❌ dequeue (remove do começo)
    fun dequeue(): T? {
        if (elementos.isEmpty()) return null
        return elementos.removeAt(0)
    }

    // 👀 peek (vê o primeiro sem remover)
    fun peek(): T? {
        return elementos.firstOrNull()
    }

    // ❓ isEmpty
    fun isEmpty(): Boolean {
        return elementos.isEmpty()
    }

    // 📏 size
    fun size(): Int {
        return elementos.size
    }
}