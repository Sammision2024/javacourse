
// import tools.Calculator; //importing Calculator class from tools folder(package).
// import tools.Advancecal; //importing Advancecal class from tools folder(package).
// import tools . *;        //* t will import all files from tools folder(package).
import others.tools.*; //it will import others folder in others folder there is tools folder in tool folders there is Claculator and Advancecal fils.By useing * we importing all files of others\tools folder.
// import others.*; //it will not work because * means all files not all projects.

public class Packages {
    public static void main(String args[]) {
        // Calculator calc = new Calculator(); // We cannot access the calculator class directly in this Packages class bu
                                            // we can access indirectly by importing the (tools(package
                                            // name).Calculator(class name)) which we created.
        Advancecal calc1 = new Advancecal();
        int r1 = calc1.div(9, 9);

        System.out.println(r1);
    }
}