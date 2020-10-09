open class Animal{
    var  name: String? = null
    var legs: Int = 2

    constructor(){}


    constructor(legs: Int){
        this.legs = legs
    }

    constructor(name: String){
        this.name = name
    }



}