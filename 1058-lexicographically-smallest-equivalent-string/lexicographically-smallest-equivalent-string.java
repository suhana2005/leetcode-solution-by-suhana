class Solution {
    private int[] parent = new int[26];
    
    
    private void init() {
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }
    }

    
    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    
    private void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA != rootB) {
            if (rootA < rootB) {
                parent[rootB] = rootA;
            } else {
                parent[rootA] = rootB;
            }
        }
    }

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        init();

        for (int i = 0; i < s1.length(); i++) {
            union(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }

        StringBuilder result = new StringBuilder();

        for (char c : baseStr.toCharArray()) {
            int root = find(c - 'a');
            result.append((char)(root + 'a'));
        }

        return result.toString();
    }
}
