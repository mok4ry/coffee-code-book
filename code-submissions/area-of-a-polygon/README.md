# Area of a Polygon

By Matt Mokary, written in [Scala](http://www.scala-lang.org/).

### Summary
The `O(n)` algorithm, where `n` is the number of points, used to determine the
area of an irregularly-shaped polygon is deceptively simple. It works by
treating each line segment in the polygon as the top of a trapezoid whose
bottom edge is the x-axis. Visiting each line segment in clockwise order, the
algorithm calculates the area of such a trapezoid and either adds or subtracts
it from the total area; a line segment whose end is at a *higher* x value will
have its trapezoid's area added, while a line segment whose end is at a *lower*
x value will have its trapezoid's area subtracted.

### Running the Code
Default `make` target is `compile`, which uses `scalac` to build `.class` files
and stores them in a `./bin` directory.

To compile and run, use `make compile run` or simply `make run`.

The `clean` target will remove the `./bin` directory.

### In the Book
I imagine this code snippet being put in the book as follows (cuts out boring
parts and test code while showing language-specific structure):

```scala
object AreaPolygon {

  case class Point(x: Int, y: Int)
  case class LineSegment(p1: Point, p2: Point)

  ...

  def areaOfPolygon(polygon: List[LineSegment]) =
    polygon.foldLeft(0) { (area, l) =>
      area + (l.p2.x - l.p1.x) * (l.p1.y + l.p2.y) / 2
    }

}
```
