// Cria classe de usuário
data class Usuario(val nome: String, val email: String)

// Cria data class do conteúdo 
data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

// Cria data class da formação
data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    // Variável inscritos armazena uma lista mutável de usuários
    val inscritos = mutableListOf<Usuario>()
    
    // Método matricular serve para matricular usuário
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação ${nome}.")
    }
    
    // Adiciona um método para exibir os inscritos na formação
    fun exibirInscritos() {
        println("Inscritos na formação ${nome}:")
        inscritos.forEach { println(it) }
    }

    // Adiciona um método para remover um usuário da formação
    fun desmatricular(usuario: Usuario) {
        inscritos.remove(usuario)
        println("Usuário ${usuario.nome} removido da formação ${nome}.")
    }

    // Cria um método para adicionar conteúdo à formação
    fun adicionarConteudo(conteudo: ConteudoEducacional) {
        conteudos += conteudo
        println("Conteúdo ${conteudo.nome} adicionado à formação ${nome}.")
    }

}

fun main() {
    val usuario1 = Usuario("João", "joao@email.com")
    val usuario2 = Usuario("Maria", "maria@email.com")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin")
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos")

    val formacao = Formacao("Desenvolvimento Kotlin", listOf(conteudo1, conteudo2))

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.exibirInscritos()

    formacao.desmatricular(usuario1)
    formacao.exibirInscritos()

    formacao.adicionarConteudo(ConteudoEducacional("Trabalhando com Listas"))
}
