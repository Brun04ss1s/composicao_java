package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class client {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String clientName;
    private String email;
    private Date birthDate;

    public client(String clientName, String email, Date birthDate) throws ParseException {
        this.clientName = clientName;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(clientName + " ");
        sb.append("(" + sdf.format(birthDate)+ ")" + " ");
        sb.append("- " + email);
        return sb.toString();
    }
}
