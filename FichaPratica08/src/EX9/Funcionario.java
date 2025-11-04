package EX9;

public class Funcionario {
    private String name;
    private String email;
    private String department;
    private float salary;

    public Funcionario(String name, String email, String department, float salary){
        this.name = name;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }

    public void exibirDetalhes(){
        System.out.println("\n------------------------ FUNCIONARIO ------------------------");
        System.out.println("{ " + this.name + " , " + this.email + " , " + this.department + " , " + this.salary + " }");
        System.out.println("-------------------------------------------------------");
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public float getSalary(){
        return this.salary;
    }

    public void aumentarSalario(float num){
        this.salary += this.salary * (num / 100);
    }
}
