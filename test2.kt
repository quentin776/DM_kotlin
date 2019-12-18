fun main(args: Array<String>) {
    val fin = "stop"
    var i = 0
    var z = 0
    var y = 0
    print("Quel nombre veux tu faire découvrir ?:")

    var choisi = readLine()!!

    print("**************\n****************************\n*******************\n******************\n****************\n********************\n***********\n \n \n" +
            "**************\n" +
            "****************************\n" +
            "*******************\n" +
            "******************\n" +
            "****************\n" +
            "********************\n" +
            "***********\n" +
            " \n" +
            " \n")
    var decouvre : String;


   do {
       print("Tente ta chance:")
       decouvre = readLine()!!

       if (decouvre == choisi) {
           print("Bien trouvé !\n Tu as réussie en : " + i + " tours")
           break
       } else if (decouvre == fin) {
           print("Dommage t'es trop faible pour terminer le jeu\n Le résulat était " + choisi + "\n Nombre de tours : " + i)
           break
       } else {
           var x = choisi.toInt()
           var u = decouvre.toInt()

            if (x > u) {

                if (z > (x - u )|| y > ( x - u )) {
                    print("Tu chauffe !")
                }
                 z = x - u
               print("Dommage, c'est + !\n")
               i++
           } else if (x < u) {
                if (z > ( u - x )|| y > ( u - x)) {
                    print("Tu chauffe !")
                }
                var y = u - x
               print("Dommage, c'esgt - ! \n")
               i++
           }else if(u > x && u  >= u - 2 || u < x && u  <= u + 2){
            print("Tu brûle !")
            }


       }
   }
    while (choisi != decouvre) ;
}