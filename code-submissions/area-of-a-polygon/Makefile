BUILD_DIR = ./bin

all: compile

$(BUILD_DIR):
	if [ ! -d $(BUILD_DIR) ]; then mkdir $(BUILD_DIR); fi

compile: $(BUILD_DIR)
	scalac -d $(BUILD_DIR) AreaPolygon.scala

run:
	scala -classpath $(BUILD_DIR) AreaPolygon

clean:
	rm -r $(BUILD_DIR)
