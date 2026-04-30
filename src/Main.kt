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
}




