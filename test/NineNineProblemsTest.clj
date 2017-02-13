(ns NineNineProblems-test
  (:require
    [clojure.test :refer :all]
    [NineNineProblems :refer :all]
    )
  )

;1.
(deftest my-last-test
  (is (= '(d 1 nil) (map my-last '((a b c d) [1] []))))
  )


;2.

(deftest my-but-last-test
  (is (= '(C nil nil) (map my-but-last '((A B C D) () (1)))))
  )

(run-all-tests)