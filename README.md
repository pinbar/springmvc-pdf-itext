An older version of iText is used for the following reason:
1. Spring MVC (as of 3.2) has a dependency on the older version of iText (but you could write your own AbstractView to get around this)
2. The newer versions of iText are released under a different license (not free for commercial applications)