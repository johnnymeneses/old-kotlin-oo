package logica
/*
	A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo para ler as dimensões de um terreno e depois exibir a área do terreno.
    O cálculo da área neste caso é bem simples, basta multiplicar lado x comprimento para retângulos
* */

//   fun areaTerreno(a: Int, b: Int): Int = a*b

fun areaTerreno(lado: Int, comprimento:Int){
   println("A área é ${lado * comprimento}")
}