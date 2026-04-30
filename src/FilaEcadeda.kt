class FilaEncadeada<T> {

    // Nó
    private class Node<T>(val valor: T) {
        var proximo: Node<T>? = null
    }

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var tamanho = 0

    // ➕ enqueue (entra no fim)
    fun enqueue(valor: T) {
        val novo = Node(valor)

        if (tail == null) {
            head = novo
            tail = novo
        } else {
            tail?.proximo = novo
            tail = novo
        }

        tamanho++
    }

    // ❌ dequeue (remove do início)
    fun dequeue(): T? {
        if (head == null) return null

        val valor = head!!.valor
        head = head!!.proximo

        // se ficou vazia
        if (head == null) {
            tail = null
        }

        tamanho--
        return valor
    }

    // 👀 peek
    fun peek(): T? {
        return head?.valor
    }

    // ❓ isEmpty
    fun isEmpty(): Boolean {
        return tamanho == 0
    }

    // 📏 size
    fun size(): Int {
        return tamanho
    }

    // 🖨️ print (debug)
    fun print() {
        var atual = head
        while (atual != null) {
            print("${atual.valor} -> ")
            atual = atual.proximo
        }
        println("null")
    }
}