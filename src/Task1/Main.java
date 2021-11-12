package Task1;

public class Main {
    public static void main(final String[] args) {
        final Address trueAddress = new Address("Ukraine", "Lviv", "Knyahyni_Olhy", 5);
        final User trueUser = new User(1, "Andrii", "Sukhyi", 19, "+380-00-000-0000", trueAddress);
        final Address fakeAddress = new Address("Germany1", "124Ds", "DDDD", -4);
        final User fakeUser = new User(2, "Ralf", "Hatchet", 35, "+49-30-123-12-34", fakeAddress);
        final Address fakeAddress1 = new Address("Germany", "124Ds", "DDDD", -4);
        final User fakeUser1 = new User(3, "Marc1", "Hatchet2", 35, "+49-30-123-12-34", fakeAddress1);
        final Address fakeAddress2 = new Address("Germany", "Berlin", "DDDD", -4);
        final User fakeUser2 = new User(4, "Ralf", "Hatchet", 0, "+49-30-123-12-34", fakeAddress2);
        final User fakeUser3 = new User(4, "Ralf", "Hatchet", 55, "+64115", fakeAddress2);

        try {
            ValidateUser.validate(trueUser);
        } catch (final InvalidUser e) {
            System.out.println(e.getMessage());
        }
        trueUser.viewUser();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        try {
            ValidateUser.validate(fakeUser);
        } catch (final InvalidUser e) {
            System.out.println(e.getMessage());
        }
        fakeUser.viewUser();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        try {
            ValidateUser.validate(fakeUser1);
        } catch (final InvalidUser e) {
            System.out.println(e.getMessage());
        }
        fakeUser1.viewUser();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        try {
            ValidateUser.validate(fakeUser2);
        } catch (final InvalidUser e) {
            System.out.println(e.getMessage());
        }
        fakeUser2.viewUser();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        try {
            ValidateUser.validate(fakeUser3);
        } catch (final InvalidUser e) {
            System.out.println(e.getMessage());
        }
        fakeUser3.viewUser();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}