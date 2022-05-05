<h2><a href="https://leetcode.com/problems/cut-off-trees-for-golf-event/">675. Cut Off Trees for Golf Event</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are asked to cut off all the trees in a forest for a golf event. The forest is represented as an <code style="user-select: auto;">m x n</code> matrix. In this matrix:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">0</code> means the cell cannot be walked through.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1</code> represents an empty cell that can be walked through.</li>
	<li style="user-select: auto;">A number greater than <code style="user-select: auto;">1</code> represents a tree in a cell that can be walked through, and this number is the tree's height.</li>
</ul>

<p style="user-select: auto;">In one step, you can walk in any of the four directions: north, east, south, and west. If you are standing in a cell with a tree, you can choose whether to cut it off.</p>

<p style="user-select: auto;">You must cut off the trees in order from shortest to tallest. When you cut off a tree, the value at its cell becomes <code style="user-select: auto;">1</code> (an empty cell).</p>

<p style="user-select: auto;">Starting from the point <code style="user-select: auto;">(0, 0)</code>, return <em style="user-select: auto;">the minimum steps you need to walk to cut off all the trees</em>. If you cannot cut off all the trees, return <code style="user-select: auto;">-1</code>.</p>

<p style="user-select: auto;">You are guaranteed that no two trees have the same height, and there is at least one tree needs to be cut off.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/26/trees1.jpg" style="width: 242px; height: 242px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> forest = [[1,2,3],[0,0,4],[7,6,5]]
<strong style="user-select: auto;">Output:</strong> 6
<strong style="user-select: auto;">Explanation:</strong> Following the path above allows you to cut off the trees from shortest to tallest in 6 steps.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/26/trees2.jpg" style="width: 242px; height: 242px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> forest = [[1,2,3],[0,0,0],[7,6,5]]
<strong style="user-select: auto;">Output:</strong> -1
<strong style="user-select: auto;">Explanation:</strong> The trees in the bottom row cannot be accessed as the middle row is blocked.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> forest = [[2,3,4],[0,0,5],[8,7,6]]
<strong style="user-select: auto;">Output:</strong> 6
<b style="user-select: auto;">Explanation:</b> You can follow the same path as Example 1 to cut off all the trees.
Note that you can cut off the first tree at (0, 0) before making any steps.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">m == forest.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == forest[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m, n &lt;= 50</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= forest[i][j] &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
</ul>
</div>