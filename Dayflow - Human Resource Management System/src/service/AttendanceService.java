package service;

import model.Attendance;
import java.util.ArrayList;

public class AttendanceService {

    private static ArrayList<Attendance> records = new ArrayList<>();

    public static void markAttendance(Attendance a) {
        records.add(a);
    }

    public static void viewAttendance() {
        if (records.isEmpty()) {
            System.out.println("No attendance records");
            return;
        }

        for (Attendance a : records) {
            System.out.println(
                "EmpID: " + a.empId +
                ", Date: " + a.date +
                ", Status: " + a.status
            );
        }
    }
}
