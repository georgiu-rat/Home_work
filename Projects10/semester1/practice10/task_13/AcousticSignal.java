package semester1.practice10.task_13;

public interface AcousticSignal {
    default String emitAlert() {
        return "Звукова сирена 110 дБ";}
}
