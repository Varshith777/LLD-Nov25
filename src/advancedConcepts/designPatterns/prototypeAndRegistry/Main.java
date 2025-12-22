package advancedConcepts.designPatterns.prototypeAndRegistry;

public class Main {
    public static void main(String[] args) {
        Student lldMWFBatch = new Student();
        lldMWFBatch.setBatchId(1);
        lldMWFBatch.setInstructorId(1);
        lldMWFBatch.setBatchAttendance(100);
        lldMWFBatch.setBatchPsp(90);
        lldMWFBatch.setBatchTiming("MWF");
        lldMWFBatch.setModuleName("LLD");

        //Rohit from lldMWFBatch
        Student rohit = lldMWFBatch.copy(); // lldMWFBatch object == this inside copy method
        rohit.setId(10);
        rohit.setName("Rohit");
        rohit.setPsp(85);
        rohit.setContactDetails("Place A, City B - 1000001");

        //Taahaa
        Student taahaa = lldMWFBatch.copy();
        taahaa.setId(20);
        taahaa.setName("Taahaa");
        taahaa.setPsp(90);
        taahaa.setContactDetails("Place A, City B - 1000001");
    }
}
