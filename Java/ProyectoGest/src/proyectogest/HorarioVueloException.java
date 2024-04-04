package proyectogest;

public class HorarioVueloException extends Exception{
    public HorarioVueloException() {
        super("La hora no puede ser anterior a la hora actual");
    }

    public HorarioVueloException(String message) {
        super(message);
    }

    public HorarioVueloException(String message, Throwable cause) {
        super(message, cause);
    }

    public HorarioVueloException(Throwable cause) {
        super("La hora no puede ser anterior a la hora actual", cause);
    }
}
