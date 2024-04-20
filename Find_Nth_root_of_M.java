package Binary_search;

public class Find_Nth_root_of_M {
    public int NthRoot(int n, int m)
    {
        int l = 1;
        int r = m;
        while(r >=l){
            int mid = (l+r)/2;
            if(Math.pow(mid, n) ==  m) {return mid;}
            else if(Math.pow(mid, n) > m){r = mid-1;}
            else{l = mid+1;}
        }
        return -1;
    }
}
