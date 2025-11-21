package structural.decorator;

public class App {
    public static void main(String[] args) {
        User user = new BasicUser();
        user.printPrivileges();

        System.out.println(" ");

        User adminUser = new AdminUser(user);
        adminUser.printPrivileges();

        System.out.println(" ");

        User dev = new DeveloperUser(adminUser);
        dev.printPrivileges();

        System.out.println(" ");
        //

        Room room = new BasicRoom();
        room.printFurniture();

        System.out.println();

        // create a room with carpet and a couch
        Room roomWithCouch = new RoomWithCouch(room);
        roomWithCouch.printFurniture();
        System.out.println();

        // create a room with carpet, a couch and a table
        Room rooWithCarpetAndTable = new RoomWithTable(roomWithCouch);
        rooWithCarpetAndTable.printFurniture();
        System.out.println();

    }
}
