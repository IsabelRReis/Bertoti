import java.util.ArrayList;
import java.util.List;

public class Registro {
    private List<Sistema> sistema;
    private List<Observer> observers;

    public Registro() {
        this.sistema = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObservers(List<Sistema> encontrados) {
        for (Observer o : observers) {
            o.update(encontrados);
        }
    }

    public void addSistema(Sistema s) {
        sistema.add(s);
    }

    public Sistema buscarSistema(Sistema s) {
        for (Sistema sistema : sistema) {
            if (sistema.matches(s)) {
                return sistema;
            }
        }
        return null;
    }
}