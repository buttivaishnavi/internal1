import java.util.HashMap;
import java.util.Map;

public class attendance {
    private Map<String, Boolean> attendanceRecords = new HashMap<>();
    
    public void markPresent(String studentName) {
        attendanceRecords.put(studentName, true);
    }
    
    public void markAbsent(String studentName) {
        attendanceRecords.put(studentName, false);
    }
    
    public void printAttendance() {
        System.out.println("Attendance Records:");
        for (Map.Entry<String, Boolean> entry : attendanceRecords.entrySet()) {
            String status = entry.getValue() ? "Present" : "Absent";
            System.out.println(entry.getKey() + ": " + status);
        }
    }
    
    public static void main(String[] args) {
        attendance att = new attendance();
        att.markPresent("Alice");
        att.markAbsent("Bob");
        att.markPresent("Charlie");
        att.printAttendance();
    }
}
