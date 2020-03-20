
public class Studend extends Person {

    private String studentnumber;
    private String field;

    public String getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(String studentnumber) {
        this.studentnumber = studentnumber;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public void show(){

        super.show();
        System.out.println("StudentID:"+studentnumber+"   Field:"+field);
    }
}
