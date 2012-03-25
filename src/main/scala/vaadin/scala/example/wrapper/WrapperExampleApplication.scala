package vaadin.scala.example.wrapper

import com.vaadin.Application
import vaadin.scala._
import org.vaadin.risto.stepper.IntStepper


class WrapperExampleApplication extends Application {
	def init(): Unit = {
		setMainWindow(new Window("Scaladin wrapper example"))
		getMainWindow.addComponent(new Label("This Vaadin app uses ScalaWrappers!"))
		val stepper = new IntStepper()
		getMainWindow().addComponent(stepper)
	}
}