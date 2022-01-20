class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int left = 1, right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int mid = left + (right - left >> 1);
            int hour = getHour(piles, mid);
            if (hour <= H) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int getHour(int[] piles, int limit) {
        int hour = 0;
        for (int pile : piles) {
            hour += (pile + limit - 1) / limit;
            // hour += Math.ceil((double)pile / limit);
        }
        return hour;
    }
}
