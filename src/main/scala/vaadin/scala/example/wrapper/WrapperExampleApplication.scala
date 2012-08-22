package vaadin.scala.example.wrapper

import vaadin.scala._
import org.vaadin.risto.stepper.IntStepper

class WrapperExampleApplication extends Application(title = "Scaladin wrapper example") {
  override def main = new VerticalLayout {
    components += Label("This Vaadin app uses ScalaWrappers!")
    
    //method 1: one line integration with ScaladinWrapper
    components += new IntStepper with ScaladinWrapper 
    
    //method 2: create a separate wrapper class
    components += new WrappedIntStepper
  }

}