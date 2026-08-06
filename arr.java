public class arr {
    public static void main(String[] args) {
        int a[]={10,20,30,40};//single dimensional array
        for(int i=0;i<=3;i++)
            {
            System.out.println(a[i]);
        }


        int b[][]=new int[3][4];//Multidimensional array
         for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                b[i][j]=(int)(Math.random() * 10);
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(b[i][j] + " ");
            }System.out.println();
        }


        int c[][]=new int[3][];//jagged array not sure about the no of columns
        c[0]=new int[4];
        c[1]=new int[2];
        c[2]=new int[3];
        for(int i=0;i<c.length;i++)
            {
                for(int j=0;j<c[i].length;j++)
                {
                    c[i][j]=(int)(Math.random() * 10);
                }
            } 

         for (int n[] : c)
            {
                for(int m:n){
                    System.out.print(m + " ");
                }System.out.println();
            }   
    }
    
}
