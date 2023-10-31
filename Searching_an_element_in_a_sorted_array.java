package Binary_search;

public class Searching_an_element_in_a_sorted_array {
    static int searchInSorted(int arr[], int n, int k)
    {
        int l =0;
        int r = n-1;
        int mid =0;
        while(l<=r){
            mid = (l+r)/2;      //""forget the bracket so keep this in mind""
            if(arr[mid] > k){
                r = mid -1;
            }
            else if(arr[mid] < k){
                l = mid +1;
            }
            else if(arr[mid] == k){
                return 1;
            }
        }
        return -1;

    }
}
