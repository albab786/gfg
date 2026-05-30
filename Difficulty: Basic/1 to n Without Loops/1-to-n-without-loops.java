class Solution {
    public void withtwoPara(int n,int i){
        if(i>n)return;
        System.out.print(i +" ");
        withtwoPara(n,i+1);
        
        
    }
    public void printTillN(int n) {
        // code here
       withtwoPara(n,1);
    }
}