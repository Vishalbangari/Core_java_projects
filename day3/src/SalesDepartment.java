public class SalesDepartment extends Department {
    private int departmentSize;
    public SalesDepartment(int departmentSize){
        this.departmentSize = departmentSize;
    }
    public int getDepartmentSize(){
        return departmentSize;
    }
}