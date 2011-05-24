package org.inphina.dayone.traits

object ProvisioningService {

  def main(args: Array[String]) {

    val tablet = new Tablet
    tablet.setUp(10.0)

    val phone = new Phone
    phone.setPrice(18.0)

    val anotherPhone = new Phone with Metering {
      addObserver(DeviceCounter)
      notifyObservers
    }
    anotherPhone.setPrice(89.0)

  }

}