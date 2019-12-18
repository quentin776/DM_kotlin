interface  Animal{
    fun parler()
    fun quiSuisJe()
}
class Chien : Animal{

    override fun parler(){
        println("wouf")
    }
    override fun quiSuisJe(){
        println("Je suis un chien")
    }

}

class Chat : Animal{
    override fun parler(){
        println("miaou")
    }
    override fun quiSuisJe(){
        println("Je suis un chat")
    }


}

class Perroquet : Animal{
    override fun parler(){
        println("Je suis rocky")
    }
    override fun quiSuisJe(){
        println("Je suis un Perroquet")
    }

}

class Annimalerie(){
    // une list pour gérer des animaux


    var plusAnimal = mutableListOf<Animal>()

    // méthod add (elle prends en paramêtre n'importe quel type d'animaux)
    fun add(animal: Animal) {
        plusAnimal.add(animal)
    }
}


