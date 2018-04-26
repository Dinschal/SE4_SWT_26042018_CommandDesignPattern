public class Main {

    public static void main(String[] args) {

        Lampe lampe = new Lampe();

        Command lampeAnCommand = new LampeAnCommand(lampe);
        Taste tasteAnDrücken = new Taste(lampeAnCommand);
        tasteAnDrücken.gedrückt();

        Command lampeAusCommand = new LampeAusCommand(lampe);
        Taste tasteAusDrücken = new Taste(lampeAusCommand);
        tasteAusDrücken.gedrückt();

        Command lampeHellerCommand = new LampeHellerCommand(lampe);
        Taste tasteHellerDrücken = new Taste(lampeHellerCommand);
        tasteHellerDrücken.gedrückt();
        tasteHellerDrücken.gedrückt();
        tasteHellerDrücken.gedrückt();
        tasteHellerDrücken.gedrückt();
        tasteHellerDrücken.gedrückt();
        tasteHellerDrücken.gedrückt();

        tasteHellerDrücken.ungedrück();
        tasteHellerDrücken.ungedrück();

        Command lampeDimmenCommand = new LampeDimmenCommand(lampe);
    }
}
