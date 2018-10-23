package com.codecool.uml.overriding;

public abstract class AbstractProcess {

   public void process(Orderable item) {
      stepBefore();
      action(item);
      stepAfter();
   }

   public void stepBefore() {
      //implementation directly in abstract superclass
   }

   protected abstract void action(Orderable item); // implemented by subclasses

   public void stepAfter() {
      //implementation directly in abstract superclass
   }
}
