//wap using array of object to print your course name 5 times.

public class ArrayCourseClass
{
    String course_name="B.Tech";
    void show()
    {
        System.out.println("course: "+course_name);
    }
    public static void main(String arg[])
    {
        ArrayCourseClass obj[]=new ArrayCourseClass[5];
        for(int i=0;i<=5;i++)
        {
            obj[i]=new ArrayCourseClass();
            obj[i].show();
        }
    }
}