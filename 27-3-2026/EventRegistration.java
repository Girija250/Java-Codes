import java.util.*;
class Participant {
    int id;
    String name;
    Participant(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
public class EventRegistration{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Participant> participants = new ArrayList<>();
        HashSet<Integer> uniqueIds = new HashSet<>();
        LinkedHashSet<Integer> registrationOrder = new LinkedHashSet<>();
        TreeSet<Integer> sortedIds = new TreeSet<>();

        int choice;

        do {
            System.out.println("1. Add Participant");
            System.out.println("2. Display All Participants");
            System.out.println("3. Search Participant");
            System.out.println("4. Remove Participant");
            System.out.println("5. Display Unique IDs");
            System.out.println("6. Display Registration Order");
            System.out.println("7. Display Sorted IDs");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Participant ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Participant Name: ");
                    String name = sc.nextLine();

                    if (uniqueIds.contains(id)) {
                        System.out.println("Duplicate ID not allowed.");
                    } else {
                        Participant p = new Participant(id, name);
                        participants.add(p);
                        uniqueIds.add(id);
                        registrationOrder.add(id);
                        sortedIds.add(id);
                        System.out.println("Participant added successfully.");
                    }
                    break;

                case 2:
                    if (participants.isEmpty()) {
                        System.out.println("No participants registered.");
                    } else {
                        System.out.println("All Participants:");
                        for (Participant p : participants) {
                            p.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Participant ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Participant p : participants) {
                        if (p.id == searchId) {
                            System.out.println("Participant found:");
                            p.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Participant not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Participant ID to remove: ");
                    int removeId = sc.nextInt();
                    Participant toRemove = null;

                    for (Participant p : participants) {
                        if (p.id == removeId) {
                            toRemove = p;
                            break;
                        }
                    }

                    if (toRemove != null) {
                        participants.remove(toRemove);
                        uniqueIds.remove(removeId);
                        registrationOrder.remove(removeId);
                        sortedIds.remove(removeId);
                        System.out.println("Participant removed successfully.");
                    } else {
                        System.out.println("Participant not found.");
                    }
                    break;

                case 5:
                    System.out.println("Unique IDs using HashSet:");
                    System.out.println(uniqueIds);
                    break;

                case 6:
                    System.out.println("Registration Order using LinkedHashSet:");
                    System.out.println(registrationOrder);
                    break;

                case 7:
                    System.out.println("Sorted IDs using TreeSet:");
                    System.out.println(sortedIds);
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 8);

        sc.close();
    }
}