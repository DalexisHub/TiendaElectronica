package tienda

open class DispositivoElectronico(open var marca: String = "Genérica", open var modelo: String = "Básico") {

    fun encender() {
        println("El dispositivo de marca $marca y modelo $modelo se ha encendido.")
    }
}

abstract class DispositivoPortatil(marca: String, modelo: String) : DispositivoElectronico(marca, modelo) {
    abstract val duracionBateria: Int

    fun calcularTiempoRestante(usoPorHora: Double): String {
        val tiempoRestante = duracionBateria / usoPorHora
        return "Tiempo restante de uso estimado: %.2f horas".format(tiempoRestante)
    }
}

interface Conectividad {
    fun conectarWiFi()
}

interface TransferenciaDatos {
    fun calcularTiempoDescarga(tamanoArchivoMB: Double, velocidadMbps: Double): String
}

interface ReproductorMultimedia {
    fun reproducirMusica()
}