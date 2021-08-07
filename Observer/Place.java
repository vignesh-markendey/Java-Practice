package HomePractice.Observer;

import java.util.ArrayList;

//Concrete Subject - implements abstract subject

public class Place implements Subject{


        private ArrayList<Observer> observers;
        private String name;
        public Place(String name) {
            this.name = name;
            observers = new ArrayList<>();
        }
        public void setCorona() {//you can add some conditions here (boolean corona)
            notifyAllObservers();
        }
        @Override
        public void attach(Observer observer) {
            observers.add(observer);
        }
        @Override
        public void detach(Observer observer) {
            observers.remove(observer);
        }
        @Override
        public void notifyAllObservers() {
            for(Observer obs : this.observers){
                obs.update(this.name + " has a confirmed case. ");
        } }



}

