import java.util.ArrayList;
import java.util.List;

public class ControleEstufa {
    private int temperatura;
    private int umidade;
    private List<Observer> observers;

    public ControleEstufa(int temperatura, int umidade) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.regular(temperatura, umidade);
        }
    }
}
