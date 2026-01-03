package model;

public class Attendance {
    public int empId;
    public String date;
    public String status; // Present / Absent / Leave

    public Attendance(int empId, String date, String status) {
        this.empId = empId;
        this.date = date;
        this.status = status;
    }
}