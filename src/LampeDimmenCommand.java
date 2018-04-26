public class LampeDimmenCommand implements Command {

    private Lampe lampe;

    public LampeDimmenCommand (Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void excecute() {
        lampe.dimmen();
    }

    @Override
    public void undo() {
        lampe.heller();
    }
}
