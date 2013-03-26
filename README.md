A demonstration of PDF document generation from a java bean using iText library. Both html and pdf views are rendered by chaining the view resolvers.

An older version of iText is used because:

1. Spring MVC (as of 3.2) has a dependency on the older version of iText.
2. The newer versions of iText are released under a different license (not free for commercial applications).
3. If the latest iText version is really needed, your own AbstractView could be written instead of using the default.
