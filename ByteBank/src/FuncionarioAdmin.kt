abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int) : Funcionario(nome = nome, cpf = cpf, salario = salario) {


//    open val bonificacao: Double
//        get() {
//            return salario * 0.1
//        }

    //Implementar função em classe abstrata?
    fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }



}

