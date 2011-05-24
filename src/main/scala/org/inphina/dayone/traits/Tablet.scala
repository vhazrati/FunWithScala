package org.inphina.dayone.traits

class Tablet extends Device with Metering {

  def setUp(price:Double)={
    setPrice(price)
    addObserver(DeviceCounter)
    notifyObservers
  }
  
  def setPrice(x: Double): Unit = { println("Price for the tablet is "+x) }
  
}