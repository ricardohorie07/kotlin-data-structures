class ListaEncadeada<T> {

    // Nó da lista
    private class Node<T>(val valor: T) {
        var proximo: Node<T>? = null
    }

    private var head: Node<T>? = null
    private var tamanho: Int = 0

    // ➕ add
    fun add(valor: T) {
        val novo = Node(valor)

        if (head == null) {
            head = novo
        } else {
            var atual = head
            while (atual?.proximo != null) {
                atual = atual.proximo
            }
            atual?.proximo = novo
        }

        tamanho++
    }

    // 🖨️ print
    fun print() {
        var atual = head
        while (atual != null) {
            print("${atual.valor} -> ")
            atual = atual.proximo
        }
        println("null")
    }

    // 🔍 buscar
    fun buscar(valor: T): Boolean {
        var atual = head
        while (atual != null) {
            if (atual.valor == valor) {
                return true
            }
            atual = atual.proximo
        }
        return false
    }

    // ❌ remove (remove o primeiro valor encontrado)
    fun remove(valor: T): Boolean {
        if (head == null) return false

        // se for o primeiro
        if (head?.valor == valor) {
            head = head?.proximo
            tamanho--
            return true
        }

        var atual = head
        while (atual?.proximo != null) {
            if (atual.proximo?.valor == valor) {
                atual.proximo = atual.proximo?.proximo
                tamanho--
                return true
            }
            atual = atual.proximo
        }

        return false
    }

    // 📏 size
    fun size(): Int {
        return tamanho
    }

    // ❓ isEmpty
    fun isEmpty(): Boolean {
        return tamanho == 0
    }
}