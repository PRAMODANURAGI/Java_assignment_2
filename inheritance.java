//A-2 Ques5


class student
{
    int roll,marks;
    String name;
    void input()
    {
        System.out.println("enter roll name and marks: ");
    }
}
class pramod extends student
{
    void disp()
    {
        roll=57;name="pramod";marks=99;
        System.out.println(roll+" "+name+" "+marks);
    }
    public static void main(String[] args){
        pramod r=new pramod();
        r.input(); r.disp();
    }
}