open class Usuario(var nombreUsuario : String,  var clave: String ){

    var estadoSesion : String = "Desactivo"
    fun validarSesion(){
        if(nombreUsuario == "Sebas" && clave == "123456"){
            estadoSesion = "Activo"
            println("Contraseña correcta")
        }
        else{
            println("Contraseña incorrecta")
        }
    }
}

open class Cliente (
    var nombreCliente : String ,
    var genero : Char ,
    var edad : Int ,
    var facultad : String ,
    var escuela : String ,
    var base : Int ,
    var celular : Int,
    nombreUsuario: String,
    clave: String
    ) : Usuario(nombreUsuario , clave ){

    fun Registro(){
        println("Nombre del cliente : $nombreCliente")
        println("Genero del cliente : $genero")
        println("Edad del cliente : $edad")
        println("Facultad del cliente : $facultad")
        println("Escuela del cliente : $escuela")
        println("Base del cliente : $base")
        println("Celular del cliente : $celular")
    }

}

class Administrador (
    var nombreAdmi : String ,
    var correoEmpresa : String ,
    var codigoUnico : Int ,
    nombreUsuario: String,
    clave: String
) : Usuario(nombreUsuario , clave ){

    fun agregarFiltros(){
        println("Funciona el agregar")
    }
    fun quitarFiltros(){
        println("Funciona el quitar filtros")
    }

}

class Filtro(
    var nombreFiltro: String,
    var seleccionGuardar: String,
    nombreCliente: String,
    genero: Char ,
    edad : Int,
    facultad: String,
    escuela: String,
    base: Int,
    celular: Int,
    nombreUsuario: String,
    clave: String
) : Cliente(nombreCliente,genero,edad,facultad,escuela,base,celular, nombreUsuario , clave ) {

    fun guardarFiltro (){
        println("FUNCIONA 1")
    }
    fun seleccionar (){
        println("FUNCIONA 2")
    }
    fun quitarSelec (){
        println("FUNCIONA 3")
    }

}


fun main(){
    val x : String = "Sebas"
    val y : String = "1234567"
    var filtro=Filtro(nombreFiltro = "Hola",
        seleccionGuardar = "SI",
        nombreCliente = "Sebas",
        genero = 'M',
        edad = 20,
        facultad = "FISI",
        escuela = "Software",
        base = 2021,
        celular = 977848925,
        nombreUsuario = x,
        clave = y
        )

    filtro.validarSesion()
    filtro.Registro()
    filtro.guardarFiltro()
    filtro.seleccionar()
    filtro.quitarSelec()

}