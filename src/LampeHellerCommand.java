public class LampeHellerCommand implements Command {

    private Lampe lampe;

    public LampeHellerCommand(Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void excecute() {
        lampe.heller();
    }

    @Override
    public void undo() {
        lampe.dimmen();
    }
}
