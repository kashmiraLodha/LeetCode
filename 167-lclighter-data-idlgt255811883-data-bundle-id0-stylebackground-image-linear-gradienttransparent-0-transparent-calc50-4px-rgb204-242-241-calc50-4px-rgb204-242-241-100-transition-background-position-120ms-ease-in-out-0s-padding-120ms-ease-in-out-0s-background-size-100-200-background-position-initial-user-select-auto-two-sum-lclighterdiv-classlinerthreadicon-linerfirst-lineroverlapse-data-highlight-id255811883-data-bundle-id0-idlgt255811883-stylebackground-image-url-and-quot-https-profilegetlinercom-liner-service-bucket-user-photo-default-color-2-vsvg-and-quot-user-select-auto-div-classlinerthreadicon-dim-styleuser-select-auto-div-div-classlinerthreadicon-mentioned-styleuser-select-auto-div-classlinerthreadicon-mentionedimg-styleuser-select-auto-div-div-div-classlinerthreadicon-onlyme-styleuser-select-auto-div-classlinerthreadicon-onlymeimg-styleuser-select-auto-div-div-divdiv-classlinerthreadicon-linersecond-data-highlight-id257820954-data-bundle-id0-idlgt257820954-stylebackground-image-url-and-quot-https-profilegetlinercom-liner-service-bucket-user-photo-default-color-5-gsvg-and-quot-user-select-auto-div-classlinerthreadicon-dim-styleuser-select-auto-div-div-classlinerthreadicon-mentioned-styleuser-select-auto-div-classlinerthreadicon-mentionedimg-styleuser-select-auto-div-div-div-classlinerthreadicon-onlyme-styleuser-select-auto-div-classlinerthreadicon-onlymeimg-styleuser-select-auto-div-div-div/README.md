<h2><a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">167. <lclighter data-id="lgt255811883" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto;">Two Sum</lclighter><div class="LinerThreadIcon LinerFirst LinerOverlapse" data-highlight-id="255811883" data-bundle-id="0" id="lgt255811883" style="background-image: url(&quot;https://profile.getliner.com/liner-service-bucket/user_photo_default/color-2/V.svg&quot;); user-select: auto;">
        <div class="LinerThreadIcon__dim" style="user-select: auto;"></div>
        <div class="LinerThreadIcon__mentioned" style="user-select: auto;">
          <div class="LinerThreadIcon__mentionedImg" style="user-select: auto;"></div>
        </div>
        <div class="LinerThreadIcon__onlyMe" style="user-select: auto;">
          <div class="LinerThreadIcon__onlyMeImg" style="user-select: auto;"></div>
        </div>
      </div><div class="LinerThreadIcon LinerSecond " data-highlight-id="257820954" data-bundle-id="0" id="lgt257820954" style="background-image: url(&quot;https://profile.getliner.com/liner-service-bucket/user_photo_default/color-5/G.svg&quot;); user-select: auto;">
        <div class="LinerThreadIcon__dim" style="user-select: auto;"></div>
        <div class="LinerThreadIcon__mentioned" style="user-select: auto;">
          <div class="LinerThreadIcon__mentionedImg" style="user-select: auto;"></div>
        </div>
        <div class="LinerThreadIcon__onlyMe" style="user-select: auto;">
          <div class="LinerThreadIcon__onlyMeImg" style="user-select: auto;"></div>
        </div>
      </div></a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a <strong style="user-select: auto;">1-indexed</strong> array of integers <code style="user-select: auto;">numbers</code> that is already <strong style="user-select: auto;"><em style="user-select: auto;">sorted in non-decreasing order</em></strong>, find two numbers such that they add up to a specific <code style="user-select: auto;">target</code> number. Let these two numbers be <code style="user-select: auto;">numbers[index<sub style="user-select: auto;">1</sub>]</code> and <code style="user-select: auto;">numbers[index<sub style="user-select: auto;">2</sub>]</code> where <code style="user-select: auto;">1 &lt;= index<sub style="user-select: auto;">1</sub> &lt; index<sub style="user-select: auto;">2</sub> &lt;= numbers.length</code>.</p>

<p style="user-select: auto;">Return<em style="user-select: auto;"> the indices of the two numbers, </em><code style="user-select: auto;">index<sub style="user-select: auto;">1</sub></code><em style="user-select: auto;"> and </em><code style="user-select: auto;">index<sub style="user-select: auto;">2</sub></code><em style="user-select: auto;">, <strong style="user-select: auto;">added by one</strong> as an integer array </em><code style="user-select: auto;">[index<sub style="user-select: auto;">1</sub>, index<sub style="user-select: auto;">2</sub>]</code><em style="user-select: auto;"> of length 2.</em></p>

<p style="user-select: auto;">The tests are generated such that there is <strong style="user-select: auto;">exactly one solution</strong>. You <strong style="user-select: auto;">may not</strong> use the same element twice.</p>

<p style="user-select: auto;">Your solution must use only constant extra space.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> numbers = [<u style="user-select: auto;">2</u>,<u style="user-select: auto;">7</u>,11,15], target = 9
<strong style="user-select: auto;">Output:</strong> [1,2]
<strong style="user-select: auto;">Explanation:</strong> The sum of 2 and 7 is 9. Therefore, index<sub style="user-select: auto;">1</sub> = 1, index<sub style="user-select: auto;">2</sub> = 2. We return [1, 2].
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> numbers = [<u style="user-select: auto;">2</u>,3,<u style="user-select: auto;">4</u>], target = 6
<strong style="user-select: auto;">Output:</strong> [1,3]
<strong style="user-select: auto;">Explanation:</strong> The sum of 2 and 4 is 6. Therefore index<sub style="user-select: auto;">1</sub> = 1, index<sub style="user-select: auto;">2</sub> = 3. We return [1, 3].
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> numbers = [<u style="user-select: auto;">-1</u>,<u style="user-select: auto;">0</u>], target = -1
<strong style="user-select: auto;">Output:</strong> [1,2]
<strong style="user-select: auto;">Explanation:</strong> The sum of -1 and 0 is -1. Therefore index<sub style="user-select: auto;">1</sub> = 1, index<sub style="user-select: auto;">2</sub> = 2. We return [1, 2].
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= numbers.length &lt;= 3 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-1000 &lt;= numbers[i] &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">numbers</code> is sorted in <strong style="user-select: auto;">non-decreasing order</strong>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">-1000 &lt;= target &lt;= 1000</code></li>
	<li style="user-select: auto;">The tests are generated such that there is <strong style="user-select: auto;">exactly one solution</strong>.</li>
</ul>
</div>