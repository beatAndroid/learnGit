package com.yjm.scala

class Lesson01 {

}

class Person(param1:String,param2:Int){
  val name = param1;
  val age = param2;
  
  def syaName():Unit={
    println("hello scala")
  }
  
  var o =1
  def this(param1:String,param2:Int,param3:Int)={
    this(param1,param2);
    o=param3;
  }
}