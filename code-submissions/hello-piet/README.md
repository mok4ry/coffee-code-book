# Hello World

By Matt Mokary, written in [Piet](http://www.dangermouse.net/esoteric/piet.html).

### Summary
Piet is an esoteric programming language for which the source is an image file.
Tokens, called "codels," are squares of constant dimensions separated by color.
Eighteen different colors provide seventeen possible operations defined by
changes of hue and lightness following the program's flow. Control begins with
the top left codel and continues to the right until a black codel or edge is
reached, at which point control moves clockwise until non-black codel follows.
If there is no valid next codel, the program terminates.

Data in a Piet progam is contained on a stack. Larger blocks of same-color
codels represent the number of codels in that block. For example, a block of 8
codels of one color followed by a block (one or more) codels of the color one
step darker will push the integer `8` onto the stack.

This Hello World program works by pushing `1` onto the stack twice, adding them
to get `2`, and then duplicating `2` `n - 1` times until `2^n` is just greater
than the ASCII value of the desired letter. This repeats to subtract from that
number until the desired ASCII value is on the stack. Letters are put on the
stack in reverse order and then popped and printed at the end.

### Running the "Code"
Download and compile the [`npiet`](http://www.bertnase.de/npiet) interpreter.

Run the "code" with `$ npiet hello-world.png`

### In the Book
I think this would make an excellent cover for the book, and then perhaps the
first entry.
