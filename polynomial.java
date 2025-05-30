import java.util.*;

class Nodep{
    int data;
    int power;
    Nodep next;

    Nodep(int data, int power){
        this.data = data;
        this.power = power;
        this.next = null;
    }
}

public class polynomial {
    Nodep root;

    void insert(int data, int power){
        Nodep n = new Nodep(data, power);
        if(root == null){
            root = n;
        }else{
            Nodep t = root;
            while(t.next!= null){
                t = t.next;
            }
            t.next = n;
        }
    }

    void print(){
        if(root == null){
            System.out.printf("list is empty");
        }else{
            Nodep t = root;
            while(t!=null){
                System.out.print(t.data+"X^"+t.power+" + ");
                t = t.next;
            }
        }
    }

    static polynomial add(polynomial list1, polynomial list2, polynomial list3){
        if(list1.root == null && list2.root == null){
            System.out.println("Both list are empty");
        }else if(list2.root== null){
            return list1;
        }else if(list1.root == null){
            return list2;
        }else{
            Nodep temp1 = list1.root;
            Nodep temp2 = list2.root;

            while(temp1!=null && temp2!=null){
                if(temp1.power == temp2.power){
                    list3.insert(temp1.data+temp2.data, temp1.power);
                    temp1 = temp1.next;
                    temp2 = temp2.next;

                }else if(temp1.power> temp2.power){
                    list3.insert(temp1.data, temp1.power);
                    temp1 = temp1.next;
                }else{
                    list3.insert(temp2.data, temp2.power);
                    temp2 = temp2.next;
                }

            }

            while (temp1!=null){
                list3.insert(temp1.data, temp1.power);
                temp1 = temp1.next;
            }

            while (temp2!= null){
                list3.insert(temp2.data, temp2.power);
                temp2 = temp2.next;
            }

        }
        return list3;
    }

    public static void main(String[] args) {
        polynomial list1 = new polynomial();
        polynomial list2 = new polynomial();
        polynomial list3 = new polynomial();

        Scanner in = new Scanner(System.in);
        System.out.println("For list1 give your max power");
        int power = in.nextInt();
        while(power>=0){
            System.out.println("for power: "+power+" enter the coeff: ");
            int data = in.nextInt();
            if(data!=0){
                list1.insert(data, power);
            }
            power--;
        }

        list1.print();

        System.out.println("For list2 give your max power");
        int power2 = in.nextInt();
        while(power2>=0){
            System.out.println("for power: "+power2+" enter the coeff: ");
            int data = in.nextInt();
            if(data!=0){
                list2.insert(data, power2);
            }
            power2--;
        }

        list2.print();

        list3 = add(list1,list2,list3 );
        list3.print();
    }

}
