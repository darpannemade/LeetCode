class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {

        if (mat.size() == 0 || mat[0].size() == 0) {
            return {};
        }

        int row = mat.size();
        int col = mat[0].size();

        unordered_map<int, vector<int>> diagonals;
        int key = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                key = i + j;
                diagonals[key].push_back(mat[i][j]);
            }
        }
        vector<int> result;
        int totalDiagonals = row + col - 1;

        for (int key = 0; key < totalDiagonals; key++) {
            if (key % 2 == 0) {
                reverse(diagonals[key].begin(), diagonals[key].end());
            }
            result.insert(result.end(), diagonals[key].begin(),
                          diagonals[key].end());
        }

        return result;
    }
};