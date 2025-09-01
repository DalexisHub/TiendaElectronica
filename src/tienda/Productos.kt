package tienda

class dispositivo(marca: String, modelo: String, override val duracionBateria: Int) : DispositivoPortatil(marca, modelo), Conectividad, ReproductorMultimedia, TransferenciaDatos {

    override fun conectarWiFi() {
        println("El dispositivo $marca $modelo se está conectando a la red WiFi.")
    }

    override fun reproducirMusica() {
        println("El dispositivo $marca $modelo está reproduciendo música.")
    }

    override fun calcularTiempoDescarga(tamanoArchivoMB: Double, velocidadMbps: Double): String {
        val velocidadMBps = velocidadMbps / 8
        val tiempoSegundos = tamanoArchivoMB / velocidadMBps
        return "Tiempo estimado de descarga: %.2f segundos.".format(tiempoSegundos)
    }
}

class Laptop(marca: String, modelo: String, override val duracionBateria: Int) : DispositivoPortatil(marca, modelo), Conectividad, TransferenciaDatos {

    override fun conectarWiFi() {
        println("La Laptop $marca $modelo se está conectando a la red WiFi.")
    }

    override fun calcularTiempoDescarga(tamanoArchivoMB: Double, velocidadMbps: Double): String {
        val velocidadMBps = velocidadMbps / 8
        val tiempoSegundos = tamanoArchivoMB / velocidadMBps
        return "Tiempo estimado de descarga: %.2f segundos.".format(tiempoSegundos)
    }
}