class Shape {
    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape{
    int getCorner(){
        return 4;
    }

    int getParentCorner(){
        //untuk mengambil method/function dari parant nya dengan memakai super
        return super.getCorner();
    }

}

