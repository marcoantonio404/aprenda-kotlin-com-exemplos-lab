// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario (val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel = Nivel.BASICO)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuario ${usuario.nome} matriculado na formaçao $nome.")
    }
}

fun main() {
    val usuario1 = Usuario ("marco")
    val usuario2 = Usuario ("melissa")
    val usuario3 = Usuario ("charle")
    
    val conteudo1 = ConteudoEducacional ("introduçao a programaçao", nivel = Nivel.BASICO)
    val conteudo2 = ConteudoEducacional ("algoritimos avancados", duracao = 120, nivel = Nivel.AVANCADO)
    val conteudo3 = ConteudoEducacional ("estrutura de dados", nivel = Nivel.INTERMEDIARIO)
    
    val formacao = Formacao ("desenvolvimento de software", mutableListOf(conteudo1, conteudo2, conteudo3))
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)
    
    println("usuarios matriculados na formaçao ${formacao.nome}: ${formacao.inscritos.map {it.nome}}")
}