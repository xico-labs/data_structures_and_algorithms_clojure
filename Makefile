PHONY: \
	__build_test_image \
	test

__build_test_image:
	docker build -f test.Dockerfile -t clojure-test .

test: __build_test_image
	docker run \
    -t clojure-test \
    lein test
