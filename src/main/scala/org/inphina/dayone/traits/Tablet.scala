package org.inphina.dayone.traits

class Tablet extends Device with Metering {

  def setPrice(x: Double): Unit = {
    println("Price for the tablet is " + x)
    addObserver(DeviceCounter)
    notifyObservers
  }

}