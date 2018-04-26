public class Taste {

    private Command command;

    public Taste(Command command){
        this.command = command;
    }

    public void gedrückt(){
        command.excecute();
    }

    public void ungedrück(){
        command.undo();
    }
}
