object AreaPolygon {

  case class Point(x: Int, y: Int)
  case class LineSegment(p1: Point, p2: Point)

  val triangle =
    LineSegment(Point(1, 0), Point(3, 5)) ::
    LineSegment(Point(3, 5), Point(5, 0)) ::
    LineSegment(Point(5, 0), Point(1, 0)) :: Nil

  val square =
    LineSegment(Point(1, 1), Point(1, 5)) ::
    LineSegment(Point(1, 5), Point(5, 5)) ::
    LineSegment(Point(5, 5), Point(5, 1)) ::
    LineSegment(Point(5, 1), Point(1, 1)) :: Nil

  val squarePacman =
    LineSegment(Point(0, 0), Point(1, 1)) ::
    LineSegment(Point(1, 1), Point(0, 2)) ::
    LineSegment(Point(0, 2), Point(2, 2)) ::
    LineSegment(Point(2, 2), Point(2, 0)) ::
    LineSegment(Point(2, 0), Point(0, 0)) :: Nil

  val trapezoid =
    LineSegment(Point(1, 1), Point(2, 2)) ::
    LineSegment(Point(2, 2), Point(4, 2)) ::
    LineSegment(Point(4, 2), Point(5, 1)) ::
    LineSegment(Point(5, 1), Point(1, 1)) :: Nil

  def test {
    assert(areaOfPolygon(triangle)     == 10)
    assert(areaOfPolygon(square)       == 16)
    assert(areaOfPolygon(squarePacman) ==  3)
    assert(areaOfPolygon(trapezoid)    ==  2)
  }

  def main( args: Array[String] ) { test }

  def areaOfPolygon(polygon: List[LineSegment]) =
    polygon.foldLeft(0) { (area, l) =>
      area + (l.p2.x - l.p1.x) * (l.p1.y + l.p2.y) / 2
    }

}