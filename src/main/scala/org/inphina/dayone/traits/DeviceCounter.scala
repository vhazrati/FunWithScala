package org.inphina.dayone.traits

object DeviceCounter {
  var count = 0
  def receiveUpdate(subject: Any) = {
    count += 1
    println("Counter notified and the count is " + count)
  }

}