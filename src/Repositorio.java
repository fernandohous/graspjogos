import java.util.List;

public interface Repositorio<T> {

    public void adiciona(T registro);
    public List<T> lista();
}
