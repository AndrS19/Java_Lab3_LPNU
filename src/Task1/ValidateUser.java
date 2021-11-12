package Task1;

public class ValidateUser {
    public static void validate(final User user) throws InvalidUser {
        numberValidate(user.getID(), "ID");
        nameValidate(user.getName(), "Name");
        nameValidate(user.getSurname(), "Surname");
        ageValidate(user.getAge(), "Age");
        phone_numberValidate(user.getPhone_number(), "Phone number");
        nameValidate(user.getAddress().getCountry(), "Country");
        nameValidate(user.getAddress().getCity(), "City");
        nameValidate(user.getAddress().getStreet(), "Street");
        numberValidate(user.getAddress().getNumber(), "Number");
        throw new InvalidUser("Validate successful", Codes.ERROR2);
    }

    public static void numberValidate(final int ID, final String typeOfObject) throws InvalidUser{
        if (ID <= 0)
            throw new InvalidUser(typeOfObject + " must be greater than 0", Codes.ERROR4);
    }

    public static void ageValidate(final int age, final String typeOfObject) throws InvalidUser{
        if (age < 0 && age < 100)
            throw new InvalidUser(typeOfObject + " must be greater than 0", Codes.ERROR4);
    }

    public static void nameValidate (final String name, final String typeOfObject) throws InvalidUser{
        if ((name.length()<=2) || name.matches(".*\\W.*") || name.matches(".*\\d.*"))
            throw new InvalidUser(typeOfObject +
                    " must contain only letters and at least 3 characters", Codes.ERROR4);
    }

    public static void phone_numberValidate(final String phone_number, final String typeOfObject) throws InvalidUser {
        if ((phone_number.length()<=12) || !phone_number.matches(".*\\d.*") || !phone_number.matches(".*+.*") || !phone_number.matches(".*[-].*"))
            throw new InvalidUser(typeOfObject +
                    " must contain at least 11 digits, contain + and -. Example: +XXX-XX-XXX-XXXX", Codes.ERROR4);
    }
}