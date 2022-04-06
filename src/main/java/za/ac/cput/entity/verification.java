package za.ac.cput.entity;

public class verification {
    private String emailField;
    private String passwordField;

    //private builder constructor
    private verification(Builder builder) {
        this.emailField = builder.emailField;
        this.passwordField = builder.passwordField;
    }

    public String getEmailField() {
        return emailField;
    }

    public void setEmailField(String emailField) {
        this.emailField = emailField;
    }

    public String getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(String passwordField) {
        this.passwordField = passwordField;
    }

    @Override
    public String toString() {
        return "verification{" +
                "emailField='" + emailField + '\'' +
                ", passwordField='" + passwordField + '\'' +
                '}';
    }

    public static class Builder {
        private String emailField;
        private String passwordField;

        public Builder emailField(String emailField) {
            this.emailField = emailField;
            return this;
        }

        public Builder passwordField(String passwordField) {
            this.passwordField = passwordField;
            return this;
        }

        public Builder copy(verification verification) {
            this.emailField = verification.emailField;
            this.passwordField = verification.passwordField;

            return this;
        }

        public verification build() {
            return new verification(this);
        }

    }
}