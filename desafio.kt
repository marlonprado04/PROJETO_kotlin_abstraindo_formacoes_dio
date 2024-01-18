// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

// Cria enum class dos valores padrão de nível
enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

// Cria classe de usuário
class Usuario

// Cria data class do conteúdo 
data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

// Cria data class da formação
data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    // Variável inscritos armazena uma lista mutável de usuários
    val inscritos = mutableListOf<Usuario>()
    
    // Método matricular serve para matricular usuário
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
