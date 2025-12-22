package advancedConcepts.designPatterns.prototypeAndRegistry;

public class Student implements Prototype<Student> {
    private int id;
    private String name;
    private int psp;
    private String contactDetails;
    private int gradYear;
    private int batchId;
    private int instructorId;
    private String moduleName;
    private int batchPsp;
    private int batchAttendance;
    private String batchTiming;
    private String batchEndDate;


    @Override
    public Student copy() {
        Student copy = new Student(); // deep copy
        copy.batchId = this.batchId; // copy is the empty object we just created, this == the object calling this copy method
        copy.instructorId = this.instructorId; // Student s = new Student(); -- s.copy() -- s == this
        copy.batchPsp = this.batchPsp;
        copy.batchAttendance = this.batchAttendance;
        copy.moduleName = this.moduleName;
        copy.batchTiming = this.batchTiming;
        copy.batchEndDate = this.batchEndDate;
        return copy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getBatchPsp() {
        return batchPsp;
    }

    public void setBatchPsp(int batchPsp) {
        this.batchPsp = batchPsp;
    }

    public int getBatchAttendance() {
        return batchAttendance;
    }

    public void setBatchAttendance(int batchAttendance) {
        this.batchAttendance = batchAttendance;
    }

    public String getBatchTiming() {
        return batchTiming;
    }

    public void setBatchTiming(String batchTiming) {
        this.batchTiming = batchTiming;
    }
}
