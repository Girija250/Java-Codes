import java.util.Scanner;
public class metro_ticket {
    static void tickets()
    {
        String stations[]={"mgr central","egmore","nehru park","kilpak medical college","pachayappan college","shenoy nagar ","anna nagar east","anna nagar tower","thirumangalam","koyembedu","cmbt","arumbakkam","vadapalani","ashok nagar"," ekkattuthangal","arignar anna alandur","st thomus mount"};
        Scanner get_data=new Scanner(System.in);
        System.out.print("enter your name : ");
        String name=get_data.nextLine();
        System.out.print("enter your starting point : ");
        String start=get_data.nextLine();
        System.out.print("enter your stopping point : ");
        String stop=get_data.nextLine();
        int start_point=0,stop_point=0;
        for(int i=0;i<stations.length;i++)
        {
            if(stations[i].equals(start))
            {
                start_point=i;
            }
            else if(stations[i].equals(stop))
            {
                stop_point=i;
            }
        }
        int no_of_stops;
        if(start_point>stop_point)
        {
            no_of_stops= start_point - stop_point;
            
        }
        else
        {
            no_of_stops= stop_point - start_point;
        }
        if(no_of_stops==1||no_of_stops==2)
        {
            System.out.println("you have to pay 10 rupees");
        }
        else if(no_of_stops==3||no_of_stops==4)
        {
            System.out.println("you have to pay 20 rupees");
        }
        else if(no_of_stops==5||no_of_stops==6)
        {
            System.out.println("you have to pay 30 rupees");
        }
        else
        {
            System.out.println("you have to pay 40 rupees");
        }


    }
    public static void main(String[] args)
    {
        metro_ticket obj=new metro_ticket();
        obj.tickets();
    }
}
