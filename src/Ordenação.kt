fun bubbleSort(lista: MutableList<Int>) {
    for (i in 0 until lista.size) {
        for (j in 0 until lista.size - i - 1) {
            if (lista[j] > lista[j + 1]) {
                val temp = lista[j]
                lista[j] = lista[j + 1]
                lista[j + 1] = temp
            }
        }
    }
}