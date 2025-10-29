//multilevel inheritance by using scanner class

import java.util.Scanner;
class employee
{
    String emp_nm;
    Scanner sc=new Scanner(System.in);
}
class dept extends employee
{
    String dept_nm;
}
class sec extends dept
{
    string sec_nm;
    void in()
    {
        System.out.println();
    }
}
