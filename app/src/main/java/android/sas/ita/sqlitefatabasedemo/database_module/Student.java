package android.sas.ita.sqlitefatabasedemo.database_module;

/**
 * Created by sasmob on 12/10/2017.
 */

public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String department;
}
