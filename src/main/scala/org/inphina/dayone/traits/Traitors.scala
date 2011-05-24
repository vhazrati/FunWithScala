package org.inphina.dayone.traits

object Traitors {
  
  def main(args: Array[String]) {
    println("Creating the concrete class")
    new ConcreteClass
    println("After Creating the concrete class")
  }
  
  trait TraitOne {
    val x = "TraitOne"
    println("  in TraitOne: x = " + x)
  }
  trait TraitTwo {
    val y = "TraitTwo"
    println("  in TraitTwo: y = " + y)
  }
  abstract class BaseClass {
    val b = "BaseClass"
    def hello
    println("  in BaseClass = " + b)
  }
  
  
  class ConcreteClass extends BaseClass with TraitOne with TraitTwo {
    val c = "ConcreteClass"
    def hello = print("hello")
    println("  in ConcreteClass = " + c)
  }

}