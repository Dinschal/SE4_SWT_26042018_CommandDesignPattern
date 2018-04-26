public class LampeAnCommand implements Command {

    private Lampe lampe;

    public LampeAnCommand(Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void excecute() {
        lampe.an();
    }

    @Override
    public void undo() {
        lampe.aus();
    }
}
