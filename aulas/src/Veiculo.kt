open class Veiculo(val marca: String, val ano: Int)

class Carro(marca: String, ano: Int, val numeroDePortas: Int) : Veiculo(marca, ano)