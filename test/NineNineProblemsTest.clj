(ns NineNineProblems-test
  (:require
    [clojure.test :refer :all]
    [NineNineProblems :refer :all]
    )
  )

;1.
(deftest my-last-test
  (is (= '([d] [1] nil) (map my-last '([a b c d] [1] []))))
  )
(run-all-tests)