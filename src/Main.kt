fun main() {
    println("Iniciando projeto de algoritmos em Kotlin")
    // fun exemplo
    exemploLoop()

    //class Pessoa
    val p = Pessoa("Ricardo", 22)
    p.apresentar()
    p.fazerAniversario()
    p.apresentar()

    //class Caixa
    val caixaInt = Caixa(10)
    val caixaString = Caixa("Kotlin")
    println(caixaInt.get())
    println(caixaString.get())

    //fun tamanhoNome
    println(tamanhoNome("Ricardo"))
    println(tamanhoNome(null))

    //Data class
    val p1 = Produto("Notebook", 3500.0)
    val p2 = Produto("Notebook", 3500.0)
    println(p1 == p2) // true

    //Collections
    val lista = mutableListOf(1, 2, 3)
    lista.add(4)
    lista.remove(2)
    println(lista)

    //lambda
    val numeros = listOf(1, 2, 3, 4, 5)
    val pares = numeros.filter { it % 2 == 0 }
    println(pares)

    //fun int.dobro
    println(5.dobro())

    //Pilha
    val pilha = Pilha<Int>()
    pilha.push(10)
    pilha.push(20)
    pilha.push(30)
    println("Topo: ${pilha.peek()}")
    println("Removido: ${pilha.pop()}")
    println("Topo agora: ${pilha.peek()}")

    //lista encadeada
    val lista1 = ListaEncadeada<Int>()
    lista1.add(10)
    lista1.add(20)
    lista1.add(30)
    lista1.print()
    println(lista1.buscar(20))
    lista1.remove(20)
    lista1.print()

    //Fila simples
    val fila = Fila<String>()
    fila.enqueue("A")
    fila.enqueue("B")
    fila.enqueue("C")
    println("Primeiro: ${fila.peek()}") // A
    println("Removido: ${fila.dequeue()}") // A
    println("Removido: ${fila.dequeue()}") // B
    println("Tamanho: ${fila.size()}") // 1
    println("Está vazia? ${fila.isEmpty()}") // false

    //Fila encadeda
    val fila1 = FilaEncadeada<String>()
    fila1.enqueue("A")
    fila1.enqueue("B")
    fila1.enqueue("C")
    fila1.print()
    println("Primeiro: ${fila1.peek()}") // A
    println("Removido: ${fila1.dequeue()}") // A
    println("Removido: ${fila1.dequeue()}") // B
    fila1.print()
    println("Tamanho: ${fila1.size()}")
    println("Está vazia? ${fila1.isEmpty()}")

    //Busca binaria e ordenação
    val numeros1 = mutableListOf(8, 3, 5, 1, 9, 2)
    println("Lista original: $numeros1")
    bubbleSort(numeros1)
    println("Lista ordenada: $numeros1")
    val alvo = 5
    val posicao = buscaBinaria(numeros1, alvo)
    if (posicao != -1) {
        println("Valor $alvo encontrado na posição $posicao")
    } else {
        println("Valor $alvo não encontrado")
    }
}




