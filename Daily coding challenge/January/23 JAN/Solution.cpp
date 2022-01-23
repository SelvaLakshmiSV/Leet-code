class Solution {
public:
    vector<int> sequentialDigits(int low, int high) {
        vector<int> res;
        for(int tmp=1; tmp<10; tmp++){
            backtrack(res, tmp, low, high);
        } sort(res.begin(), res.end());
        return res;
    }
private:
    void backtrack(vector<int>& res, int& tmp, int& low, int& high){
        if( tmp > high ) return;
        int back = tmp % 10;
        if( back < 9 ){
            tmp = tmp * 10 + ( back + 1 );
            if( low <= tmp && tmp <= high ) res.push_back(tmp);
            backtrack(res, tmp, low, high);
            tmp = (tmp-(back+1)) / 10;
        }
    }
};
