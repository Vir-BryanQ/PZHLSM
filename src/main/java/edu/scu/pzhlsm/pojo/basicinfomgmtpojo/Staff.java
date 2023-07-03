package edu.scu.pzhlsm.pojo.basicinfomgmtpojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    private int staffId;
    private String staffNumber;
    private String staffName;
    private String gender;
    private int staffAge;
    private String staffRole;
    private String staffTime;
    private float salary;
    private String phone;
    private String staffAddress;
    private String cardNumber;

    public Staff(String staffNumber, String staffName, String gender, int staffAge, String staffRole, String staffTime, float salary, String phone, String staffAddress, String cardNumber) {
        this.staffNumber = staffNumber;
        this.staffName = staffName;
        this.gender = gender;
        this.staffAge = staffAge;
        this.staffRole = staffRole;
        this.staffTime = staffTime;
        this.salary = salary;
        this.phone = phone;
        this.staffAddress = staffAddress;
        this.cardNumber = cardNumber;
    }
}
