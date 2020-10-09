data class Person(val name: String, val age: Int, val gender: String){
    override fun equals(other: Any?): Boolean {
       val person = other as Person
        return this.name == person.name && this.gender == person.gender
    }
}