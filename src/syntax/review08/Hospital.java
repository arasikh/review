package syntax.review08;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc=new Doctor("Jane", "Smith");
        doc.printInfo();
        Doctor.hospital="UCSF";
        doc.work();

        //create another doctor
        Doctor doctor=new Doctor("Joe","Doe","cardiologist",10);
        doctor.printInfo();
        doctor.work();
        //change values of static variable
        Doctor.hospital="George Washington";
        doc.work();
        doctor.work();

        doc.lastName="Obama";
        doc.printInfo();
        doctor.printInfo();
        doc.hospital="Mayo Clinic";

        doc.work();
        doctor.work();
    }
}
