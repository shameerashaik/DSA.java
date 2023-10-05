package LectureQuestions;

public class BinarySearch {
    public static int BS(int arr[], int key){
        int start = 0, end = arr.length-1;
        while( start <= end){
            int mid = (start+end)/2;
            
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,9,23,56,68,99};
        int key = 56;
        int search = BS(arr, key);
        if(search == -1){
            System.out.println("number not found");
        }else{
            System.out.println(search);
        }
    }
}
