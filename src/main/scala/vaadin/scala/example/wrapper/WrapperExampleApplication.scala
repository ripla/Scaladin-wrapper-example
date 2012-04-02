package vaadin.scala.example.wrapper

import vaadin.scala._
import org.vaadin.risto.stepper.IntStepper

class WrapperExampleApplication extends Application(title = "Scaladin wrapper example") {
  override def main = {
    new VerticalLayout() {
      components += new Label("This Vaadin app uses ScalaWrappers!")
      components += new IntStepper with ScaladinWrapper
      components += new WrappedIntStepper
    }
  }
}