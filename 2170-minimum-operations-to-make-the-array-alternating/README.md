<h2><a href="https://leetcode.com/problems/minimum-operations-to-make-the-array-alternating/">2170. Minimum Operations to Make the Array Alternating</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> array <code style="user-select: auto;">nums</code> consisting of <code style="user-select: auto;">n</code> positive integers.</p>

<p style="user-select: auto;">The array <code style="user-select: auto;">nums</code> is called <strong style="user-select: auto;">alternating</strong> if:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">nums[i - 2] == nums[i]</code>, where <code style="user-select: auto;">2 &lt;= i &lt;= n - 1</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">nums[i - 1] != nums[i]</code>, where <code style="user-select: auto;">1 &lt;= i &lt;= n - 1</code>.</li>
</ul>

<p style="user-select: auto;">In one <strong style="user-select: auto;">operation</strong>, you can choose an index <code style="user-select: auto;">i</code> and <strong style="user-select: auto;">change</strong> <code style="user-select: auto;">nums[i]</code> into <strong style="user-select: auto;">any</strong> positive integer.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum number of operations</strong> required to make the array alternating</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [3,1,3,2,4,3]
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation:</strong>
One way to make the array alternating is by converting it to [3,1,3,<u style="user-select: auto;"><strong style="user-select: auto;">1</strong></u>,<u style="user-select: auto;"><strong style="user-select: auto;">3</strong></u>,<u style="user-select: auto;"><strong style="user-select: auto;">1</strong></u>].
The number of operations required in this case is 3.
It can be proven that it is not possible to make the array alternating in less than 3 operations. 
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,2,2,2]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong>
One way to make the array alternating is by converting it to [1,2,<u style="user-select: auto;"><strong style="user-select: auto;">1</strong></u>,2,<u style="user-select: auto;"><strong style="user-select: auto;">1</strong></u>].
The number of operations required in this case is 2.
Note that the array cannot be converted to [<u style="user-select: auto;"><strong style="user-select: auto;">2</strong></u>,2,2,2,2] because in this case nums[0] == nums[1] which violates the conditions of an alternating array.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>