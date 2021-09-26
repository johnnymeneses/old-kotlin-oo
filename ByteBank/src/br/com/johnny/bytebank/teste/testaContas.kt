import modelos.contaCorrente
import modelos.contaPoupanca

fun testaContas()
{

//   testaCP()
    testaCC()



}


fun testaCC()
{
    val cc = contaCorrente("br.com.johnny.bytebank.modelo.Conta Corrente",1234,4444)
    val cc2 = contaCorrente("br.com.johnny.bytebank.modelo.Conta Corrente2 ",1234,4444)
    val cc3 = contaCorrente("br.com.johnny.bytebank.modelo.Conta Corrente2 ",1234,4444)






//    println("Total de contas Criadas ${cc.totalConta()}")


    println("Número da br.com.johnny.bytebank.modelo.Conta: ${cc.numeroConta}")
    println("Agência: ${cc.agencia}")
    println("Saldo R$: ${cc.saldo}")
    println("")

    println("Depósito de R$100")
    cc.depositaRecurso(100.0)
    println("Novo Saldo R$: ${cc.saldo}")
    println("")

    println("Saque de R$ -500")
    cc.sacarRecurso(99.6)
    println("Novo Saldo R$: ${cc.saldo}")
    println("")



    println("Transferencia")


    println("br.com.johnny.bytebank.modelo.Conta Corrente 1 ")
    println("Saldo R$: ${cc.saldo}")
    println("")
    println("br.com.johnny.bytebank.modelo.Conta Corrente 2 ")
    println("Saldo R$: ${cc2.saldo}")

    cc.transfereRecurso(50.0,cc2)
    println("Novo Saldo CC 1 R$: ${cc.saldo}")
    println("Novo Saldo CC 2 R$: ${cc2.saldo}")

}

fun testaCP()
{


    val cp = contaPoupanca("br.com.johnny.bytebank.modelo.Conta Poupança",1234,4444)
    val cp2 = contaPoupanca("br.com.johnny.bytebank.modelo.Conta Poupança2 ",1234,4444)





    println("br.com.johnny.bytebank.modelo.Conta Poupança")


    println("Número da br.com.johnny.bytebank.modelo.Conta: ${cp.numeroConta}")
    println("Agência: ${cp.agencia}")
    println("Saldo R$: ${cp.saldo}")
    println("")

    println("Depósito de R$100")
    cp.depositaRecurso(1.0)
    println("Novo Saldo R$: ${cp.saldo}")
    println("")

    println("Saque de R$ -500")
    cp.sacarRecurso(-500.0)
    println("Novo Saldo R$: ${cp.saldo}")
    println("")



    println("Transferencia")


    println("br.com.johnny.bytebank.modelo.Conta Poupança 1 ")
    println("Saldo R$: ${cp.saldo}")
    println("")
    println("br.com.johnny.bytebank.modelo.Conta Poupança 2 ")
    println("Saldo R$: ${cp2.saldo}")

    cp.transfereRecurso(50.0,cp)
    println("Novo Saldo CP 1 R$: ${cp.saldo}")
    println("Novo Saldo CP 2 R$: ${cp2.saldo}")
}