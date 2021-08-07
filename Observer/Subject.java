package HomePractice.Observer;

//Abstract Subject (concept)

public interface Subject {
     void attach(Observer observer);
     void detach(Observer observer);
     void notifyAllObservers();
}
