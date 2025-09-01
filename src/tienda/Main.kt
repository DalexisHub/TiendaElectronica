package tienda

fun main() {

    val Dispositivo = dispositivo(marca = "Samsung", modelo = "Galaxy S23", duracionBateria = 12)
    val Laptop = Laptop(marca = "HP", modelo = "Spectre x360", duracionBateria = 8)

    println("\nCOMPORTAMIENTO DEL DISPOSITIVO:")
    Dispositivo.encender()
    println("Duración de la batería: ${Dispositivo.duracionBateria} horas")
    println(Dispositivo.calcularTiempoRestante(usoPorHora = 1.5))
    Dispositivo.conectarWiFi()
    println(Dispositivo.calcularTiempoDescarga(tamanoArchivoMB = 500.0, velocidadMbps = 50.0))
    Dispositivo.reproducirMusica()
    println("\nCOMPORTAMIENTO DE LA LAPTOP:")
    Laptop.encender()
    println("Duración de la batería: ${Laptop.duracionBateria} horas")
    println(Laptop.calcularTiempoRestante(usoPorHora = 1.2))
    Laptop.conectarWiFi()
    println(Laptop.calcularTiempoDescarga(tamanoArchivoMB = 1000.0, velocidadMbps = 100.0))
}
