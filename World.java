private class World {

    int size;
    ArrayList<String> builds = new ArrayList<String>();

}

protected class floor {

    int depth;
    int width;
    int total =  depth * width; 

}

protected class margin {
    
    int x_coord;
    int y_coord;
    int z_coord;
    
}

public class global_structure {
    
    String name;
    int serial_number;
    ArrayList<String> properties = new ArrayList<String>();
    /*To be added
    String properties(String color, int durability, bool)
    */
}

public class new_structure extends global_structure {
    
    String type;
    //to implement independent properties per structure, making it unique
    
}
