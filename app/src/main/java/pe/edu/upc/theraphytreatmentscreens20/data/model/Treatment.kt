package pe.edu.upc.theraphytreatmentscreens20.data.model

data class Treatment(
    val id: String,
    val title: String,
    val description: String,
    val photoUrl: String,
    val sessionsQuantity: Number,
    val physiotherapist: String,

)
