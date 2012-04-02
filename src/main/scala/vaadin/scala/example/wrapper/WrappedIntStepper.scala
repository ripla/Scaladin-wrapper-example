package vaadin.scala.example.wrapper

import vaadin.scala._
import org.vaadin.risto.stepper.IntStepper

class WrappedIntStepper(implicit wrapper: WrapperRegistry) extends AbstractField {
  override val p = new IntStepper
  wr.put(this)

  def maxValue_=(max: Int) = p.setMaxValue(max)
  def maxValue: Int = p.getMaxValue

  def minValue_=(max: Int) = p.setMaxValue(max)
  def minValue: Int = p.getMaxValue
}