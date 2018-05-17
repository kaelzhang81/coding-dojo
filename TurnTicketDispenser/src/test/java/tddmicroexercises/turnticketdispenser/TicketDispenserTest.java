package tddmicroexercises.turnticketdispenser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TicketDispenserTest {
    @Test
    public void the_class_TicketDispenser_should_dispense_the_ticket_number_11() {
        TurnNumberSequence mockTurnNumberSequence = mock(TurnNumberSequence.class);
        when(mockTurnNumberSequence.getNextTurnNumber()).thenReturn (11);
        TicketDispenser ticketDispenser = new TicketDispenser(mockTurnNumberSequence);

        TurnTicket ticket = ticketDispenser.getTurnTicket();

        assertEquals(11, ticket.getTurnNumber());
        verify(mockTurnNumberSequence).getNextTurnNumber();
    }
}
