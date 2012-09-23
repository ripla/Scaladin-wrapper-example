package vaadin.scala.example.wrapper

import vaadin.scala._
import org.vaadin.risto.stepper.IntStepper
import vaadin.scala.mixins.ComponentMixin

class WrapperExampleApplication extends Application(title = "Scaladin wrapper example") {
  override def main = new VerticalLayout {
    //method 1: one line integration with ScaladinWrapper
    //access wrapped class via the typed p -variable
    val wrappedStepper = ScaladinWrapper.wrapComponent(new IntStepper with ComponentMixin)
    wrappedStepper.p.setManualInputAllowed(false)
    components += wrappedStepper

    //method 2: create a separate wrapper class
    components += new WrappedIntStepper
  }
}