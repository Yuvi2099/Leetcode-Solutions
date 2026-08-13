class Solution {
    private class Node {
        int maxLen, prefixLen, suffixLen, len;
        char leftChar, rightChar;
        Node(int maxLen, int prefixLen, int suffixLen, char leftChar, char rightChar, int len) {
            this.maxLen = maxLen;
            this.prefixLen = prefixLen;
            this.suffixLen = suffixLen;
            this.leftChar = leftChar;
            this.rightChar = rightChar;
            this.len = len;
        }
    }

    private Node[] seg;
    private char[] arr;
    private int n;

    public int[] longestRepeating(String s, String qc, int[] qi) {
        n = s.length();
        arr = s.toCharArray();
        seg = new Node[4 * n];
        build(1, 0, n - 1);

        int k = qi.length;
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            update(1, 0, n - 1, qi[i], qc.charAt(i));
            res[i] = seg[1].maxLen; 
        }
        return res;
    }

    private void build(int idx, int l, int r) {
        if (l == r) {
            seg[idx] = new Node(1, 1, 1, arr[l], arr[l], 1);
            return;
        }
        int mid = (l + r) / 2;
        build(idx * 2, l, mid);
        build(idx * 2 + 1, mid + 1, r);
        seg[idx] = merge(seg[idx * 2], seg[idx * 2 + 1]);
    }

    private void update(int idx, int l, int r, int pos, char c) {
        if (l == r) {
            arr[pos] = c;
            seg[idx] = new Node(1, 1, 1, c, c, 1);
            return;
        }
        int mid = (l + r) / 2;
        if (pos <= mid) update(idx * 2, l, mid, pos, c);
        else update(idx * 2 + 1, mid + 1, r, pos, c);
        seg[idx] = merge(seg[idx * 2], seg[idx * 2 + 1]);
    }

    private Node merge(Node L, Node R) {
        Node res = new Node(0, 0, 0, L.leftChar, R.rightChar, L.len + R.len);

        res.prefixLen = L.prefixLen;
        if (L.prefixLen == L.len && L.rightChar == R.leftChar) {
            res.prefixLen = L.len + R.prefixLen;
        }

        res.suffixLen = R.suffixLen;
        if (R.suffixLen == R.len && L.rightChar == R.leftChar) {
            res.suffixLen = R.len + L.suffixLen;
        }

        res.maxLen = Math.max(L.maxLen, R.maxLen);
        if (L.rightChar == R.leftChar) {
            res.maxLen = Math.max(res.maxLen, L.suffixLen + R.prefixLen);
        }

        return res;
    }
}
