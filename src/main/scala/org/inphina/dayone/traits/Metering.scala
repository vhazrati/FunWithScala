package org.inphina.dayone.traits

trait Metering {
  // any type with a method signature given below can be used for Metering
  type anyObserver = { def receiveUpdate(subject: Any) }

  private var observers = List[anyObserver]()
  def addObserver(observer: anyObserver) = observers ::= observer
  // we define a function literal with foreach
  def notifyObservers = observers foreach (_.receiveUpdate(this))
}