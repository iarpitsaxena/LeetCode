public class Solution extends VersionControl {
  public int firstBadVersion(int n) {
    int l = 1;
    int r = n;

    while (l < r) {
      final int m = l + (r - l) / 2;
      if (!isBadVersion(m))
        l = m + 1;
      else
        r = m;
    }

    return l;
  }
}