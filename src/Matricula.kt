import java.util.*

class Matricula(
    val aluno: Aluno,
    val curso: Curso
) {
    val dataDeMatricula: Date = Date()

    override fun toString(): String {
        return "Matricula($aluno, $curso)"
    }
}