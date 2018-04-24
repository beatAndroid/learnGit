package com.yjm.scala

import java.util.Date

object Lesson02{
  
	def main(args: Array[String]) {
		val age =20
		if(age < 18){
		   println("禁止观看")
		}else if(age>18 && age<=20){
		   println("需要有人陪伴")
		}else{
		  println("尽情享受")
		}
	}
	
	//九九表
	for(i <-1 to 9 ;j<- 1 until 10){
	  if(i>=j){
	    print( i + "*" + j +"=" +i*j+"\t")
	  }
	  if(i==j){
	    println()
	  }
	}
	
	//for循环yield用法得到list
	val list = for(i <- 1 to 10; if i%2==0) yield i
	for(temp <- list){
	  println(temp)
	}
	
	//可变参数长度的函数
	def fun3(elems:Int*){
	  for(elem<-elems){
	    println(elem)
	  }
	}
	fun3(1,2,3,4,5,6)
	
	//最后一行有可能作为返回结果，所以需要加上返回值类型
	def fun4(num:Int):Int={
	  if(num ==1){
	    num
	  }else{
	    num * fun4(num-1)
	  }
	}
	println(fun4(5))
	
	//匿名函数
	val fun5 = (name:String,facePower:Double)=>{
	  println(name + facePower)
	}
	fun5("hello",99.00)
	
	//无参匿名函数
	val fun51 = ()=>{
	  println("hello scala")
	}
	fun51()
	
	//偏应用函数
	def log(date:Date,s:String)={
	  println("date is"+date +",log is" + "s")
	}
	val date = new Date()
	val logWithDate = log(date,_:String)
	logWithDate("log1")
	logWithDate("log2")
	logWithDate("log3")
	
	/**
	 * 什么是高阶函数？
	 * 函数的参数是参数或者函数的返回类型是函数
	 * scala支持面向对象编程
	 * scala支持面向函数编程
	 */
	def fun6(f:(Int,Int) => Int):Int={
	  f(100,200)
	}
	def f(a:Int,b:Int)={
	  a+b
	}
	println(fun6(f))	
}