make:
	javac Line.java
	java Line
	convert line.ppm line.png
	display line.png
clean:
	rm *.class *.ppm *.png
