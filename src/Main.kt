class Pessoa(val nome: String, var idade: Int) { // exemplo de classe e programa orientado a objetos

    fun fazerAniversario() {
        idade++
    }

    fun apresentar() {
        println("Meu nome é $nome e tenho $idade anos")
    }
}

fun main() {
    println("Iniciando projeto de algoritmos em Kotlin")

    exemploLoop()

    val p = Pessoa("Ricardo", 22)
    p.apresentar()
    p.fazerAniversario()
    p.apresentar()
}

fun exemploLoop() {
    for (i in 1..5) {
        println("i = $i")
    }
}


