class Ladderprint{
static void print_num(int a,int b){
int i,j;
for(i=1;i<=a;i++){
for(j=1;j<=i;j++){
System.out.print(j+" ");
}
System.out.println();
}
}
public static void main(String args[]){
int rows=5,col=5;
print_num(rows,col);
}}

