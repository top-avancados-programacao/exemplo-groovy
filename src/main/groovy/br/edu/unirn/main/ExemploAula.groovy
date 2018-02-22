import groovy.transform.*
//System.out.println("Alow Munod");
//println "Alow Mundo!"


//def nome = "teste"

@ToString
class Aluno {
    Long id
    String nome
    Date dataCadastro
}


def aluno = new Aluno(nome:"Romulo",id:10,dataCadastro:new Date())
println aluno

/**
 public class Calculadora{
 public static int soma(int a, int b){
 return a+b;
 }
 }
 **/

class Calculadora{
    static int soma(a,b){
        a+b
    }
}

def lista = ["Romulo", "Lucas", "Ícaro"]
lista += "Novo elemento"

lista.each{ nome->
    println nome
}

def mapa = [:]
mapa.nome = "Romulo"
mapa.idade = 34
mapa.dataCadastro = new Date()-7
mapa.qualquerCoisa = "Sei la"
mapa.lista = ["Teste1", "Teste2"]
println mapa




def textoEmail = """String gigante
Multi linha
com muito texto
e é isso
"""
println textoEmail


def nomeMeu = "Romulo Fagundes"

println "Seu nome é: ${nomeMeu}"


println """ Olá sr(a). ${nomeMeu},
Venha a nossa loja e negocie sua dívida.

Data de envio: ${new Date().format('dd/MM/yyyy')}

Att,
Cobrança
"""


"10".toInteger()


class Animal{
    String nome
}

class Dono{
    String nome
    Animal animal
}

def dono = new Dono()
dono.animal = new Animal(nome:"Bidu")

println "O seu animal é ${dono?.animal?.nome?:'-'}"

def dono2 = new Dono(nome:"Animal morreu")

println "O seu animal é ${dono2?.animal?.nome?:'-'}"

if(dono2?.animal){
    return dono2.getAnimal().getNome();
}else{
    return "-";
}
