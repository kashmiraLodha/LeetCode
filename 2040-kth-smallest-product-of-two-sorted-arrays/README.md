<h2><a href="https://leetcode.com/problems/kth-smallest-product-of-two-sorted-arrays/">2040. Kth Smallest Product of Two Sorted Arrays</a></h2><h3>Hard</h3><hr><div style="user-select: auto;">Given two <strong style="user-select: auto;">sorted 0-indexed</strong> integer arrays <code style="user-select: auto;">nums1</code> and <code style="user-select: auto;">nums2</code> as well as an integer <code style="user-select: auto;">k</code>, return <em style="user-select: auto;">the </em><code style="user-select: auto;">k<sup style="user-select: auto;">th</sup></code><em style="user-select: auto;"> (<strong style="user-select: auto;">1-based</strong>) smallest product of </em><code style="user-select: auto;">nums1[i] * nums2[j]</code><em style="user-select: auto;"> where </em><code style="user-select: auto;">0 &lt;= i &lt; nums1.length</code><em style="user-select: auto;"> and </em><code style="user-select: auto;">0 &lt;= j &lt; nums2.length</code>.
<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums1 = [2,5], nums2 = [3,4], k = 2
<strong style="user-select: auto;">Output:</strong> 8
<strong style="user-select: auto;">Explanation:</strong> The 2 smallest products are:
- nums1[0] * nums2[0] = 2 * 3 = 6
- nums1[0] * nums2[1] = 2 * 4 = 8
The 2<sup style="user-select: auto;">nd</sup> smallest product is 8.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums1 = [-4,-2,0,3], nums2 = [2,4], k = 6
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong> The 6 smallest products are:
- nums1[0] * nums2[1] = (-4) * 4 = -16
- nums1[0] * nums2[0] = (-4) * 2 = -8
- nums1[1] * nums2[1] = (-2) * 4 = -8
- nums1[1] * nums2[0] = (-2) * 2 = -4
- nums1[2] * nums2[0] = 0 * 2 = 0
- nums1[2] * nums2[1] = 0 * 4 = 0
The 6<sup style="user-select: auto;">th</sup> smallest product is 0.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums1 = [-2,-1,0,1,2], nums2 = [-3,-1,2,4,5], k = 3
<strong style="user-select: auto;">Output:</strong> -6
<strong style="user-select: auto;">Explanation:</strong> The 3 smallest products are:
- nums1[0] * nums2[4] = (-2) * 5 = -10
- nums1[0] * nums2[3] = (-2) * 4 = -8
- nums1[4] * nums2[0] = 2 * (-3) = -6
The 3<sup style="user-select: auto;">rd</sup> smallest product is -6.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums1.length, nums2.length &lt;= 5 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">5</sup> &lt;= nums1[i], nums2[j] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= nums1.length * nums2.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">nums1</code> and <code style="user-select: auto;">nums2</code> are sorted.</li>
</ul>
</div>