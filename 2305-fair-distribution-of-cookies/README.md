<h2><a href="https://leetcode.com/problems/fair-distribution-of-cookies/">2305. Fair Distribution of Cookies</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an integer array <code style="user-select: auto;">cookies</code>, where <code style="user-select: auto;">cookies[i]</code> denotes the number of cookies in the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> bag. You are also given an integer <code style="user-select: auto;">k</code> that denotes the number of children to distribute <strong style="user-select: auto;">all</strong> the bags of cookies to. All the cookies in the same bag must go to the same child and cannot be split up.</p>

<p style="user-select: auto;">The <strong style="user-select: auto;">unfairness</strong> of a distribution is defined as the <strong style="user-select: auto;">maximum</strong> <strong style="user-select: auto;">total</strong> cookies obtained by a single child in the distribution.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum</strong> unfairness of all distributions</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> cookies = [8,15,10,20,8], k = 2
<strong style="user-select: auto;">Output:</strong> 31
<strong style="user-select: auto;">Explanation:</strong> One optimal distribution is [8,15,8] and [10,20]
- The 1<sup style="user-select: auto;">st</sup> child receives [8,15,8] which has a total of 8 + 15 + 8 = 31 cookies.
- The 2<sup style="user-select: auto;">nd</sup> child receives [10,20] which has a total of 10 + 20 = 30 cookies.
The unfairness of the distribution is max(31,30) = 31.
It can be shown that there is no distribution with an unfairness less than 31.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> cookies = [6,1,3,2,2,4,1,2], k = 3
<strong style="user-select: auto;">Output:</strong> 7
<strong style="user-select: auto;">Explanation:</strong> One optimal distribution is [6,1], [3,2,2], and [4,1,2]
- The 1<sup style="user-select: auto;">st</sup> child receives [6,1] which has a total of 6 + 1 = 7 cookies.
- The 2<sup style="user-select: auto;">nd</sup> child receives [3,2,2] which has a total of 3 + 2 + 2 = 7 cookies.
- The 3<sup style="user-select: auto;">rd</sup> child receives [4,1,2] which has a total of 4 + 1 + 2 = 7 cookies.
The unfairness of the distribution is max(7,7,7) = 7.
It can be shown that there is no distribution with an unfairness less than 7.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= cookies.length &lt;= 8</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= cookies[i] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= k &lt;= cookies.length</code></li>
</ul>
</div>