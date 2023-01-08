public class PhoneNumberValidIntZero {
    private int value;
    private int leadZeroCount;

    public String getValue() {
        return "0".repeat(leadZeroCount) + value;
    }

    public void setValue(String value) {
        if (value == null) {
            throw new IllegalArgumentException("la valeur ne peut pas êtr nulle");
        }
        for (int i = 0; i < value.length(); ++i) {
            if ('0' > value.charAt(i) || value.charAt(i) > '9') {
                throw new IllegalArgumentException(value + " ne peut contenir que des chiffres");
            }
        }
        this.value = Integer.parseInt(value);
        leadZeroCount = 0;
        for (int i = 0; i < value.length() && value.charAt(i) == '0'; ++i) {
            ++leadZeroCount;
        }
    }
}
