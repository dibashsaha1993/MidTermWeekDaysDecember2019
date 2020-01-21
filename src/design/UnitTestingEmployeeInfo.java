package design;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UnitTestingEmployeeInfo {
    private EmployeeInfo employeeInfo;

    @BeforeTest
    public void UnitTest() {

        employeeInfo = new EmployeeInfo();

        EmployeeInfo.setCompanyName("Infosys");
        employeeInfo.setEmployeeName(" Dibas s");
        employeeInfo.setEmployeeId(91007);
        employeeInfo.assignDepartment("QA");
        employeeInfo.setEmployeeSalary(50000);

    }

    @Test
    public void testEmployeeName() {
        System.out.println("testing emp name()");
        Assert.assertEquals("Dibash s", employeeInfo.employeeName());
    }

    public void testEmployeeId() {
        System.out.println("testing emp Id()");
        Assert.assertEquals(91007, employeeInfo.employeeId());
    }

    public void testEmployeeDepartment() {
        System.out.println("testing emp Department()");
        Assert.assertEquals("QA", employeeInfo.getEmployeeDepartment());

    }
}