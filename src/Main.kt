fun exemploLoop() { // exemplo de loop
    for (i in 1..5) {
        println("i = $i")
    }
}

class Pessoa(val nome: String, var idade: Int) { // exemplo de classe e programa orientado a objetos

    fun fazerAniversario() {
        idade++
    }

    fun apresentar() {
        println("Meu nome é $nome e tenho $idade anos")
    }
}

class Caixa<T>(private var valor: T) { // Generics, um tipo que você define depois

    fun get(): T {
        return valor
    }

    fun set(novoValor: T) {
        valor = novoValor
    }
}

fun tamanhoNome(nome: String?): Int { // Null Safety, impedir erros com null, obrigar você a tratar null
    return nome?.length ?: 0
}

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
}




