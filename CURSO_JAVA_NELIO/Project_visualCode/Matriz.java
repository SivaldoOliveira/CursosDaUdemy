public class Matriz {
    public static void main (String[]args){
        int[][] it;
        it = new int[2][3];
        it [0][0] = 0;
        it [0][1] = 1;
        it [0][2] = 2;
        it [1][0] = 10;
        it [1][1] = 11;
        it [1][2] = 12;

 System.out.println("Conteudo da matriz it:");
 System.out.print("it[0][0] =" + it[0][0] + "\t");
 System.out.print("it[0][1] =" + it[0][1] + "\t");
 System.out.print("it[0][2] =" + it[0][2] + "\t");
 System.out.print("it[1][0] =" + it[1][0] + "\t");
 System.out.print("it[1][1] =" + it[1][1] + "\t");
 System.out.print("it[1][2] =" + it[1][2] + "\n");
 System.out.println("Posições: "+it.length+"x"+it[0].length);
 System.out.println();

char[][] ch = {{'A','B','C'},{'a', 'b','c'}, {'1','2','3'}};

System.out.println("Conteúdo da matriz ch:");

for (int i = 0; i< ch.length; i++){
    for (int j = 0; j < ch[i].length; j++)
    System.out.print("ch["+i+"]["+j+"] = "+ch[i][j]+"\t");
    System.out.println();
}

System.out.println("Posições: "+ch.length+"x"+ch[0].length);

    }
}
