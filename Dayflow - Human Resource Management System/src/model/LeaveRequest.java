package model;

public class LeaveRequest {
    public int empId;
    public String reason;
    public String status; // Pending / Approved / Rejected

    public LeaveRequest(int empId, String reason) {
        this.empId = empId;
        this.reason = reason;
        this.status = "Pending";
    }
}
