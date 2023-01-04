// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel {
    BASICO,
    INTERMEDIARIO,
    DIFICIL
}

class Usuario(var nome: String, val id: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de
        // $inscritos).")
        inscritos.add(usuario)
        print("O usuário ${usuario.nome} foi matriculado na formação ${this.nome}")
    }
}

fun main() {
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de
    // evoluí-las.")

    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em
    // questão.")
    val funcoesKotlin =
            ConteudoEducacional(nome = "O Poder das Funções em Kotlin", nivel = Nivel.BASICO)
    val kotlinExperience =
            Formacao(
                    nome = "Kotlin Experience",
                    conteudos = mutableListOf<ConteudoEducacional>(funcoesKotlin)
            )
    val usuario1 = Usuario(nome = "Pedro", id = 1)

    kotlinExperience.matricular(usuario1)
}
