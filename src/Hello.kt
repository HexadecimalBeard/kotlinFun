fun main(args: Array<String>) {

    println("Hello Kotlin!")

    var age = 28 // ifade int girildigi icin kotlin bu degiskeni int olarak aldi

    var secondAge: Int = 36  // eger biz int olarak belirlemek istersek

    val year = 12 // sonradan degistirilemez

    var favCandy = "Snickers"

    var secFavCandy: String = "Snickers candy"

    println("I'm $age years old and I love $favCandy and my second fav is $secFavCandy")

    println(age)

    println(year)

    var radius = 6

    var pi = 3.14

    var c = radius * pi * 2
    // eger int ve double degiskenlerle islem yapiliyorsa kotlin sonucun yazilacagi degiskeni otomatik olarak double algilar

    // var c = radius * pi.toInt() * 2 bu islemin sonucu Int olur, pi.toInt() kullanildigi icin
    println(c)

    var wallet = 40

    wallet -= 5

    println(wallet)

    var myAge = 23

    myAge += 40

    println(myAge)

    // Boolean deger tanimlama

    var isDogALive = true

    // ya da

    // car isDogAlive: Boolean = true

    // if kullanimi

    var drivingAge = 18

    if(drivingAge >= 18 && isDogALive){

        println("The dog is allowed to drive a car!")

    }else {

        println(":(")
    }

    var name = "Kenan"

    if(name == "Nick"){

        println("YOU LIAR!!!")
    }else {

        println("Nick is not my girl!")
    }

    // liste ve dizi kullanimi

    var myLuckyNumbers = listOf(1,3,5,7,9)

    var myFavNumbers = arrayOf<Int>() //boş dizi

    // eleman sayısı artan ve azalan liste

    var luckyNumbers = mutableListOf(1,2,3,4,5,6,7)

    println(luckyNumbers.size)

    luckyNumbers.add(4,8) // listeye eleman ekleme

    println(luckyNumbers.size)

    var myFavMovies = mutableListOf("lotr1", "lotr2", "lotr3", "hobbit1,2,3")

    var myFavVideos: List<String> = listOf("lotr.trailer", "hobbit.trailer") // bir list'in belirli veri tipi kullaniliyorsa

    println(myFavMovies)

    println(myFavVideos)

    // for döngüsü kullanimi

    for ( x in 1..10) {
        println(x)
    }

    var myFavCandys = listOf("Snicker", "Snickers Candy", "100 Grand bar")

    for (candy in myFavCandys) {
        println(candy)
    }

    // 1 ile 10 arasi tek sayilar

    for (x in 1..10) {
        if(x%2==1){
            println(x)
        }
    }

    // map kullanimi

    var dogs = mutableMapOf("Fido" to 8, "Comar" to 4, "Mico" to 2)

    println(dogs["Comar"])

    dogs ["Kenan"] = 144

    println(dogs["Kenan"])

    var slangs = mapOf<String, String>("Kenan" to "Komutan", "Komutan" to "Kenan")

    println(slangs["Kenan"])
    println(slangs["Komutan"])

    // fonksiyon kullanımı

    fun hello(){
        println("Hello World!")
    }
    hello()
    hello()

    // deger döndüren bir fonksiyon tanimlama

    fun hey() : String {
        return "Hey there!"
    }
    println(hey())

    // parametre alan fonksiyon tanimi

    fun name(name : String) : String {
        return "Hello $name"
    }
    println(name("Kenan"))

    // eger parametre girilmezse default olarak verileni alır

    fun nameDefault(name : String = "Komutan") : String {
        return "Hello $name"
    }
    println(nameDefault())

    // fonksiyon ile iki sayiyi toplama
    fun addNumbers( num1 : Int, num2 : Int) = num1 + num2

    println(addNumbers(4,8))

    fun dogsData(name : String, age : Int) : String {
        return "Dog's name is $name and it is $age years old!"
    }

    println(dogsData("Comar", 12))

    // class kullanimi

    class Dog ( var name : String, var age : Int) {

        //var name = ""
        //var age = 0

        // degiskenleri init metodu içinde yazabiliriz
        var lastName : String

        init {
            lastName = ""
        }

    }

    var myDawg = Dog("Comar", 12)

    //myDawg.name
    //myDawg.age

    // constructor kullanimi
    class Cat {
        var name : String
        var age : Int

        constructor(name : String, age : Int){
            this.name=name
            this.age=age
        }

        fun catInfo(){
            println("$name is $age years old.")
        }

    }

    class Bird {
        var name : String
        var age : Int
        var furColor : String

        constructor(name : String, age : Int, furColor : String){
            this.name=name
            this.age=age
            this.furColor=furColor
        }

        fun birdInfo(){

            println("$name is a bird and it is $age years old. It's fur is $furColor")

        }
    }

    // nullable kullanimi

    var canBeNull: Int ?= 28

    canBeNull = 35

    //canBeNull = null

    // canBeNull!! -- burada degiskeni non-null hale getiriyoruz

    if (canBeNull != null){
        age!!
    }

    var nullName : String ? = "Snicker"

}
