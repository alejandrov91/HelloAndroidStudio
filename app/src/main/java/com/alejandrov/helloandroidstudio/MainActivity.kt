package com.alejandrov.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lección 1
        //variablesYConstantes()

        // Lección 2
        //tiposDeDatos()

        // Lección 3
        //sentenciaIf()

        // Lección 4
        //sentenciaWhen()

        // Lección 5
            //arrays()

        // Lección 6
        //maps()

        //Lección7
        //loops()

        //Lección 8
        //nullSafety()

        //Lección 9
        //funciones()

        //Lección 10
        classes()


    }

    private fun variablesYConstantes() {
        //Esto vale para anotaciones rapiditas
        /*
        Esto tambien sirve para anotaciones
         */

        //Aquí empiezan las variables

        var myFirstVariable = "Texto"

        println(myFirstVariable)

        myFirstVariable = "Segundo texto de Variable"

        println(myFirstVariable)

        myFirstVariable = "Tercer texto, hola mundo!!"

        println(myFirstVariable)

        var mySecondVariable = "Suscríbete"

        println(mySecondVariable)

        mySecondVariable = myFirstVariable

        println(mySecondVariable)

        myFirstVariable = "Ya te has suscrito??"

        println(mySecondVariable)

        //CONSTANTES, se utiliza la palabra reservada val

        val myFirstConstant = "Te ha gustado el tutorial?"

        println(myFirstConstant)

        //No se puede cambiar el contenido de un val
        //myFirstConstant = "Si te ha gustado dale like"

        println(myFirstConstant)

        val mySecondConstant = "Ahora sí, dale like"

        println(mySecondConstant)

        val myThirdConstant = myFirstVariable

        println(myThirdConstant)

    }

    private fun tiposDeDatos() {
        //Aquí vamos a trabajar los tipos de DATOS

        //STRING
        val myString ="❗️Hola a todos!"
        val myString2 ="Esto es una prueba 2 🥰"
        val myStrring3 = myString + " " + myString2

        println (myStrring3)

        //Otro tipos de datos, los números enteros, se usa INT para números y LONG para tiempo, para este hay que poner una l al final

        val myInt = 1
        val myInt2 = 2
        val myLong = 1L

        //Decimales (Float 32bit y Double 64bit)

        val myDouble = 1.5
        val myDouble2= 3.4
        val myDouble3 = 5.7
        val myDouble4 = myDouble + myDouble2 + myDouble3
        val myFloat = 1.5f

        println (myDouble4)

        //Boolean (BOOL)
        val myBool = true
        val myBool2 = false
        // val myBool3 = myBool + myBool2  no se pueden hacer operaciones con Bool
        //println (myBool == myBool2)
        //println (!myBool || myBool2)
        //println (myBool2 != myBool2)
        println(myDouble2 < myDouble3)

    }
// sentencia IF

    private fun sentenciaIf() {
        val myNumber = 60
        //println("$myNumber es menor que 10")

        /*Operadores condicionales
         > mayor que
        < menor que
        >= mayor o igual que
        <= menor o igual que
        == igualdad
        != desigualdad
        */

        /*Operadores lógicos
        && y, todas tienen que ser verdaderas
        || o, una tiene que ser verdadera
        ! no
         */

        if ((myNumber < 10 && myNumber > 5) || myNumber == 53) {
            println("$myNumber es menor que 10 y mayor que 5 o es igual a 53")

        }    else if (myNumber == 60) {
            println ("$myNumber es igual a 60")

        } else{
            println("$myNumber es mayor que 10 y menor o igual que 5 y no es igual a 53")
        }
    }
//Aquí vamos a hablar de la sentencia when
    fun sentenciaWhen(){
        // When con String
        val country ="Cuba"

        when (country) {
            "España", "Colombia", "Cuba" -> {
                println("El idioma es español")
            }
            "México" -> {
                println("El idioma es español")
            }
            "Perú" -> {
                println("El idioma es español")
            }
            "Argentina" -> {
                println("El idioma es español")
            }
            "EEUU" -> {
                println("El idioma es inglés")
            }
            "Francia" -> {
                println("El idioma es francés")
            }
            else -> {
                println("No conocemos el idioma")
            }
        }

            //When con Int
            val age = 101
            when (age) {
                0,1,2 -> {
                    println("Eres un bebé")
            } in 3..10 -> {
                println ("Eres un niño")
            } in 11..17 -> {
                println("Eres un adolescente")
            } in 18..69 -> {
                println ("Eres un adulto")
            } in 70..90 -> {
                println ("Eres un viejo")
            } else -> {
                println("😂")
            }

        }


    }

    // Lección 5. ARRAYS
    fun arrays(){
        val name = "Alejandro"
        val surname = "Navarro"
        val company = "Drov"
        val age= "30"

        //Creación de un Array

        val myArray = arrayListOf<String>()

        // Añadimos datos de uno en uno
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
          println(myArray)

        // 5.2 Añadir un conjunto de datos
        myArray.addAll(listOf("Hola", "Bienvenidos a la clase"))
        println(myArray)

        //5.3 Acceso a datos
        val myCompany = myArray[3]
        println(myCompany)

        // 5.4 Modificación de datos
        myArray[4] = "Suscríbete y activa la campaña"
        println(myArray)

        // 5.5 Eliminar datos
        myArray.removeAt(5)
        println(myArray)

        // 5.6 Recorrer datos
        myArray.forEach{
            println(it)
        }

        // 5.7 Otras operaciones con Array
        println(myArray.count())

        myArray.clear()
        println(myArray.count())


    }
    // Lección 6. Mapas y Diccionarios MAP

    fun maps(){

        var myMap:Map<String,Int> = mapOf()
        println(myMap)

        // 6.1 Añadir elementos en mapa. Aunque pongamos las cosas en orden, los mapas no lo tienen en cuenta
        // mapOf para crear el mapa y mutableMapOf para hacer mapas editables
        myMap = mutableMapOf("Alejandro" to 1, "Mateo" to 2, "Juan" to 3)
        println(myMap)

        // 6.2 Añadir un solo valor
        myMap["Ana"] = 9
        myMap.put("Maria",8)
        println(myMap)

        // 6.3 Actualización de un dato
        myMap.put("Alejandro",10)
        myMap["Juan"] = 8
        println(myMap)

        //6.4 Acceso a datos
        println(myMap["Mateo"])

        //6.5 Borrado de datos
        myMap.remove("Ana")
        println(myMap)

    }

    // Lección 7. Tipos de bucle: sirven para recorrer estructuras que almacenan un conjunto de datos como arrays o maps
    private fun loops(){

        val myArray = listOf<String>("Hola, Bienvenidos a clase", "Suscríbete")
        val myMap = mutableMapOf("Alejandro" to 1, "Mateo" to 2, "Juan" to 3)

        // Bucle FOR
        for (myString in myArray) {
            println(myString)
        }
        for (myElement in myMap) {
            println("${myElement.key}-${myElement.value}")
        }
        for (x in 10..25) {
            println(x)
        }
        for (x in 10 until 25) {
            println(x)
        }
        for (x in 10 .. 20 step 2) {
            println(x)
        }
        for (x in 25 downTo 0 step 5) {
            println(x)
        }

        val myNumericArray=(0..20)

        // Bucle While, para repetir la misma acción pero teniendo en cuenta una condición, en el momento que sea falsa deja de ejecutarla

        var x = 0
        while (x < 10) {
            println(x)
            x ++
        }
    }

    // Lección 8. Null Safety
        fun nullSafety(){

            var myString="Alejandrov"
            // myString=null    Esto da un error de compilación
            println(myString)

            var mySafetyString: String? = "Alejandrov null safety"
            mySafetyString = null
            println(mySafetyString)

            mySafetyString = "Hola, Holita Hooooolaza"
            //        println(mySafetyString)



            /*if (mySafetyString != null){
                println(mySafetyString!!)
            }else {
                println(mySafetyString)
            }*/

            // Safe call

            println(mySafetyString?.length)

            mySafetyString?.let {
                println(mySafetyString!!)
            } ?:run {
                println(mySafetyString)
            }
        }

    // Lección 9. FUNCIONES
        fun funciones () {
        sayHello()
        sayHello()
        sayHello()

        sayMyName(name = "Alejandrov")
        sayMyName(name = "Mateo")
        sayMyName(name = "Barandela")

        sayMyNameAndAge(name = "Alejandrov", 31)
        sayMyNameAndAge(name = "Mateo", age = 30)
        sayMyNameAndAge(name = "Barandela", age = 28)

        val sumResult = sumTwoNumbers(10, 5)
        println(sumResult)
        println(sumTwoNumbers(20,30))
        println(sumTwoNumbers(10, sumTwoNumbers(5,5)))

    }
    // Función simple
        fun sayHello (){
            println("Hola!")
        }

    //Funciones con un parámetro de entrada
        fun sayMyName(name: String) {
            println("Hola, mi nombre es $name")
        }

    //Funciones con más de un parámetro de entrada
        fun sayMyNameAndAge(name: String, age:Int) {
        println("Hola, mi nombre es $name y mi edad es $age")
    }

    // Funciones con un valor de retorno
    fun sumTwoNumbers(firstNumber: Int, secondNumber: Int) :Int {
        val sum= firstNumber + secondNumber
        return sum

    }

    //Lección 10. Clases
    fun classes(){
        val drov = Programmer("Alejandro", age = 30, arrayOf(Programmer.Language.Español, Programmer.Language.Catalan, Programmer.Language.Inglés), friends = null)
        println(drov.name)

        drov.code()

        val matt = Programmer("Matej", age = 30, arrayOf(Programmer.Language.Español, Programmer.Language.Slovak, Programmer.Language.Inglés), arrayOf(drov))
        matt.name
        matt.code()
        println("${matt.friends?.first()?.name} es amigo de ${matt.name}")
    }

}