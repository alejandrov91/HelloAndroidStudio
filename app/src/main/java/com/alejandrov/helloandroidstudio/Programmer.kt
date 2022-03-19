package com.alejandrov.helloandroidstudio

class Programmer(val name: String,
                 val age:Int,
                 val languages: Array<Language>,
                 val friends: Array<Programmer>? = null) {


    enum class Language {
        Catalan,
        Inglés,
        Español,
        Slovak
    }
    fun code() {
        for (language in languages){
            println("Estoy hablando en $language")
        }
    }
}