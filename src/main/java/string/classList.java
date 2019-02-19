package string;

import com.google.gson.Gson;
import org.w3c.dom.NameList;

import javax.naming.Name;
import javax.swing.plaf.nimbus.State;

import java.util.ArrayList;
import java.util.List;


class customers{
    int id;
    String Name,product;

    List<adress> lst = new ArrayList<string.adress>() ;

}
class adress{
    int pin;
    String city;
    String State;

}
public class classList {


    public static void main(String[] args)
    {
        customers obj1 = new customers();
        obj1.Name="Mahendra";
        obj1.id = 100210;
        obj1.product="Laptop";

        //obj1.lst.add()

        adress obj2 = new adress();
        obj2.State = "MH";
        obj2.city ="PUNE";
        obj2.pin=410258;

        obj1.lst.add(obj2);

        obj2 = new adress();
        obj2.State = "MH";
        obj2.city ="Mumbai";
        obj2.pin=410288558;

        obj1.lst.add(obj2);



        List<customers> cu = new ArrayList<customers>();
        cu.add(obj1);
        cu.add(obj1);
       // cu.add(obj1);
        // cu.add(obj1);



        //   customers obj2 = new customers();
        // adress obj3 = new adress(20134,"pune","MH");

      /*  ArrayList<customers> list = new ArrayList<customers>();
        ArrayList<adress> list1 = new ArrayList<adress>();
        list.add(obj1);
        list.add(obj2);
        list1.add(obj3);*/
//System.out.println("NAME:   " + obj1.id);
        for (customers ob : cu) {
            System.out.println("-----------cust------------------");
            System.out.println("ID:   " + ob.id);
            System.out.println("NAME:   " + ob.Name);
            System.out.println("Product:   " + ob.product);

            for (adress ob1:ob.lst)
            {

                System.out.println("-------address----------------------");
                System.out.println("pin:-  " + ob1.pin);
                System.out.println("city:-  " + ob1.city);
            }
            // System.out.println("city:-  " + ob1.city);
            // System.out.println("state:-  " + ob1.State);
            System.out.println("-----------------------------");
        }
        String json = new Gson().toJson(cu );
        System.out.println(json);
      //  Data data = new Gson().fromJson(json, Data.class);
        Gson gson = new Gson();

       // NameList nameList = gson.fromJson(json, NameList.class);
       // List<Name> list = nameList.getList();
        customers[] data = new Gson().fromJson(json,customers[] .class);
        System.out.println(data);
    }


}

//}
