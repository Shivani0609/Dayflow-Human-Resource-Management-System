package service;

import model.LeaveRequest;
import java.util.ArrayList;

public class LeaveService {

    private static ArrayList<LeaveRequest> leaves = new ArrayList<>();

    // Employee applies leave
    public static void applyLeave(LeaveRequest l) {
        leaves.add(l);
        System.out.println("Leave applied (Pending)");
    }

    // Admin approves all pending leaves
    public static void approveLeaves() {
        if (leaves.isEmpty()) {
            System.out.println("No leave requests");
            return;
        }

        for (LeaveRequest l : leaves) {
            l.status = "Approved";
            System.out.println(
                "Leave Approved for EmpID: " + l.empId +
                ", Reason: " + l.reason
            );
        }
    }
}
