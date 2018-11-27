public class User {
    String username;
    String password;
    String email;
    Ticket ticket;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void buyTicket(TheaterRoom theaterRoom, Seats seats) {
        Ticket ticket = new Ticket(theaterRoom, seats);
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "(Usuario: " + username + ", Contrasena: " +password + ", Correo: " +email+ ")";
    }
}
