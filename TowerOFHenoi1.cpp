#include<iostream>
using namespace std;
int TOH(int n){
     if(n==1){
          return 1;
     }else{
     return 2*TOH(n-1)+1;
     }
}
void towerOFHenoi(int n,char from_rod,char to_rod,char aux_rod){
     if(n==0){
          return ;
     }
     towerOFHenoi(n-1,from_rod,aux_rod,to_rod);
     cout<<"move dick "<<n<<" from rod "<<from_rod<<" to rod "<<to_rod<<endl;
     towerOFHenoi(n-1,aux_rod,to_rod,from_rod);
}

int main(){
     int n;
     cin>>n;
     cout<<"movement of element :"<<TOH(n)<<endl;
     towerOFHenoi(n,'A','C','B');
     return 0;
}

