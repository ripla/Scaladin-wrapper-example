package vaadin.scala.example.wrapper

import vaadin.scala._
import org.vaadin.risto.stepper.IntStepper
import vaadin.scala.mixins.AbstractFieldMixin

trait IntStepperMixin extends AbstractFieldMixin

class WrappedIntStepper(override val p: IntStepper with IntStepperMixin = new IntStepper with IntStepperMixin) extends AbstractField(p) {

  def maxValue_=(max: Int) = p.setMaxValue(max)
  def maxValue: Int = p.getMaxValue

  def minValue_=(max: Int) = p.setMaxValue(max)
  def minValue: Int = p.getMaxValue
}