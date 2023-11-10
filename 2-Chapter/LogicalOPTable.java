
class LogicalOPTable{
    public static void main(String[] args){
        int p,q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p =1 ; q = 0;

        System.out.print(p+"\t"+ q +"\t");
        System.out.print(p*q +"\t" + (p+q-p*q)+ "\t");
        System.out.println((p*((q+1)%2)+ q*((p+1)%2))+"\t"+(p+1)% 2 );

        //
        p =0 ; q = 0;

        System.out.print(p+"\t"+ q +"\t");
        System.out.print(p*q +"\t" + (p+q-p*q)+ "\t");
        System.out.println((p*((q+1)%2)+ q*((p+1)%2))+"\t"+(p+1)% 2 );
        //
        p =0 ; q = 1;

        System.out.print(p+"\t"+ q +"\t");
        System.out.print(p*q +"\t" + (p+q-p*q)+ "\t");
        System.out.println((p*((q+1)%2)+ q*((p+1)%2))+"\t"+(p+1)% 2 );
        //
        p =1 ; q = 1;

        System.out.print(p+"\t"+ q +"\t");
        System.out.print(p*q +"\t" + (p+q-p*q)+ "\t");
        System.out.println((p*((q+1)%2)+ q*((p+1)%2))+"\t"+(p+1)% 2 );

    }
}