class oldCode
{
    fun main()
    {
        byteBank()




    }


    //Exibir se um numero é par ou impar
    fun imparPar (a: Int): String
    {
        return if(a % 2 ==0) "Par" else "Impar"
    }
//println(imparPar(21))




    fun byteBank(){
        println("Bem vindo ao BytBank - Kotlin Edition. ")
        println("")

        val contaJ =  Conta(titular = "Johnny", numero=12345) //exemplo com labels
        val contaM = Conta("Maria",65487)

        contaJ.depositaConta(100.0)




        contaM.depositaConta(200.0)




        println("Saldo atual ${contaM.titular}: ${contaJ.saldo}")
        println("Saldo atual ${contaJ.titular}:  ${contaM.saldo}")

        contaJ.transfereConta(23.0,contaM)

        println("Novo saldo ${contaM.titular}: ${contaJ.saldo}")
        println("Novo saldo ${contaJ.titular}:  ${contaM.saldo}")


//    contaJ.saldo = 100.0

//

//
//    println("Novo Saldo ${contaJ.saldo}")
//
//    contaJ.sacaConta(500.0)
//
//    println("Novo Saldo ${contaJ.saldo}")
    }






    class Conta (val titular: String, val numero: Int) {

        var saldo = 0.0
            private set





        fun depositaConta(valor: Double) {

            this.saldo += valor
        }

        fun sacaConta(valor: Double){

            if(valor > saldo){
                println("Saldo $saldo. Saque de $valor. Saldo Insuficiente para esta operação")
                return
            }else {
                this.saldo-=valor
            }
        }

        fun transfereConta(valor: Double, contaDestino: Conta) {

            if(valor > saldo){
                println("Saldo $saldo. Transferencia de $valor. Saldo Insuficiente para esta operação")
                return

            }else {
                this.saldo-=valor
                contaDestino.depositaConta(valor)
                println("Transferencia de $valor realizada com sucesso. Novo saldo $saldo")
            }

        }



    }






}