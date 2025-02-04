package br.com.ifpe.gleicekelly.alagaaquialagala.model

data class nderecoModel(
    // id
    val id: Int = 0,
    // endereço como rua, nº... como pe digitado no maps
    val endereço: String = "",
    // exemplo: 'casa de Kelly' para ficar mais fácil quando o usuário ver os favoritos
    val título: String = "",
    // É opcional "Alagado", "Normal"... Dependendo da cor do marcador
    val situacao: String = ""
)
