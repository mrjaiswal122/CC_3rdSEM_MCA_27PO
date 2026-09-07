class Solution {
    public int[] constructRectangle(int area) {
        int l = (int)Math.sqrt(area);
        while (area % l != 0 ){
            l--;
        }
        int arr[] = new int[2];
        arr[0] = (int)area / l ;
        arr[1] = l;
    	return arr;
    }
}
