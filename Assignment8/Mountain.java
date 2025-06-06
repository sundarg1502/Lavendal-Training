class Mountain {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        
        int peak = findPeakIndex(mountainArr, 0, n - 1);
        
        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) return index;
        
        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }
    
    private int findPeakIndex(MountainArray mountainArr, int left, int right) {
        while (left < right) {
            int mid = (left + right) / 2;
            int midVal = mountainArr.get(mid);
            int nextVal = mountainArr.get(mid + 1);
            if (midVal < nextVal) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; 
    }
    
    private int binarySearch(MountainArray mountainArr, int target, int left, int right, boolean ascending) {
        while (left <= right) {
            int mid = (left + right) / 2;
            int val = mountainArr.get(mid);
            if (val == target) return mid;
            
            if (ascending) {
                if (val < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (val < target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}

