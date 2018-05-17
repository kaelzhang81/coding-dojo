package tddmicroexercises.turnticketdispenser;

public class TicketDispenser {
    private TurnNumberSequence turnNumberSequence = null;

    public TicketDispenser(){
        this(new TurnNumberSequence());
    }

    public TicketDispenser(TurnNumberSequence turnNumberSequence) {
        this.turnNumberSequence = turnNumberSequence;
    }

    public TurnTicket getTurnTicket() {
        int newTurnNumber = this.turnNumberSequence.getNextTurnNumber();
        TurnTicket newTurnTicket = new TurnTicket(newTurnNumber);

        return newTurnTicket;
    }
}
