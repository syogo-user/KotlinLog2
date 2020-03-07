package jp.techacademy.shogo.kotlinlog2

abstract class Animal{
    var name :String
    var age: Int

    constructor(name :String,age:Int){
        this.name = name
        this.age = age
    }
    abstract  fun say()
}