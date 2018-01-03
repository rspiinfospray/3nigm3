package org.infospray.enigme;

import org.hibernate.validator.constraints.NotEmpty;

public class EnigmeForm {

    @NotEmpty
    private String password1;

    @NotEmpty
    private String password2;

    @NotEmpty
    private String password3;

    public String getPassword1() {
        return this.password1;
    }

    public void setPassword1(final String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return this.password2;
    }

    public void setPassword2(final String password2) {
        this.password2 = password2;
    }

    public String getPassword3() {
        return this.password3;
    }

    public void setPassword3(final String password3) {
        this.password3 = password3;
    }

}
