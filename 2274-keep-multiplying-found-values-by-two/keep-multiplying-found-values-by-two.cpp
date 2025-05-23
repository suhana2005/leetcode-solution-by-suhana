class Solution {
public:
    int findFinalValue(vector<int>& nums, int original) {
        unordered_set<int> values(nums.begin(), nums.end());
        for (int i = 0; i < original; ++i) { 
        if (values.find(original) == values.end()) {
            break;
        }
        original *= 2;   
    }
    
    return original;


    }
};
