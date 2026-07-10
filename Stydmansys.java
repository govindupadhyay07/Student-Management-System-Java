import java.util.*;
public class Stydmansys {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice1;
        int [] id = new int[100];
        int [] age = new int[100];
        String [] name = new String[100];
        String [] course = new String[100];
        int count = 0;
        int searchild;
        int updateid;
        int deleteid;
        String choice2;
        do{
            System.out.println("1. Add Students");
            System.out.println("2. View Student");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            choice1 = sc.nextInt();
           
            switch(choice1){
                case 1 : 
                System.out.println("Enter Student ID");
                id[count] = sc.nextInt();
                System.out.println("Enter students Name");
                name[count] = sc.next();
                System.out.println("Enter students Age");
                age[count] = sc.nextInt();
                System.out.println("Enter students Course");
                course[count] = sc.next();
                System.out.println("Student added successfully!");
                count++;
                break;

                case 2:
                    for(int i=0; i<count; i++){
                    System.out.println("ID: " + id[i]);
                    System.out.println("Name: " + name[i]);
                    System.out.println("Age: " + age[i]);
                    System.out.println("Course: " + course[i]);
                    }
                    break;

                case 3:
                    System.out.println("Enter Search ID");
                    searchild = sc.nextInt();
                    boolean found = false;
                    for(int i=0; i<count; i++){
                        if(searchild == id[i]){
                        System.out.println("ID: " + id[i]);
                        System.out.println("Name: " + name[i]);
                        System.out.println("Age: " + age[i]);
                        System.out.println("Course: " + course[i]);
                        found = true;
                        break;

                        }
                    }
                    if(!found){
                    System.out.println("Student not found");
                     }
                      break;
                    
                      case 4:
                        System.out.println("Enter Student ID to Update");
                        updateid = sc.nextInt();
                        boolean found2 = false;
                        for(int i=0; i<count; i++){
                            if(updateid == id[i]){
                             System.out.println("ID: " + id[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Age: " + age[i]);
                            System.out.println("Course: " + course[i]);


                            System.out.println("Enter new name");
                            name[i] = sc.next();
                            System.out.println("Enter new age");
                            age[i] = sc.nextInt();
                            System.out.println("Enter new course");
                            course[i] = sc.next();

                            System.out.println("ID :" + id[i]);
                            System.out.println("Updated name :" + name[i]);
                            System.out.println("Updated age:"+ age[i]);
                            System.out.println("Updated course:" + course[i]);
                            found2 = true;
                            break;
                             
                            }
                        }
                        if(!found2){
                            System.out.println("Student not found");
                        }
                        break;

                        case 5:
    System.out.println("Enter Student ID to delete");
    deleteid = sc.nextInt();
    boolean found3 = false;

    for(int i = 0; i < count; i++) {

        if(deleteid == id[i]) {

            System.out.println("ID: " + id[i]);
            System.out.println("Name: " + name[i]);
            System.out.println("Age: " + age[i]);
            System.out.println("Course: " + course[i]);

            found3 = true;

            System.out.println("Are you sure you want to delete this student: YES/NO");
            choice2 = sc.next();

            if(choice2.equalsIgnoreCase("YES")) {

                for(int j = i; j < count - 1; j++) {
                    id[j] = id[j + 1];
                    name[j] = name[j + 1];
                    age[j] = age[j + 1];
                    course[j] = course[j + 1];
                }

                count--;
                System.out.println("Student deleted successfully!");
                break;

            } else {
                System.out.println("Deletion cancelled");
                break;
            }
        }
    }

    if(!found3) {
        System.out.println("Student not found");
    }

    break;


case 6:
    break;


default:
    System.out.println("Invalid Choice");

}

} while(choice1 != 6);

sc.close();

}
}
            
        
            
        
        

                        

            

        
    
    

