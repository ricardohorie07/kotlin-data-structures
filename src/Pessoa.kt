class Pessoa(val nome: String, var idade: Int) { // exemplo de classe e programa orientado a objetos

    fun fazerAniversario() {
        idade++
    }

    fun apresentar() {
        println("Meu nome é $nome e tenho $idade anos")
    }
}
