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

;3.

(deftest element-at-test-for-specific-element
  (is (= 'C (element-at '(A B C D) 3)))
  )

(deftest element-at-test-for-en-empty-list
  (is (= nil (element-at '() 3)))
  )

(deftest element-at-test-for-an-invalid-position_of_zero
  (is (= nil (element-at '(A B C D) 0)))
  )

(deftest element-at-test-for-an-invalid-position_bigger_than_list_size
  (is (= nil (element-at '(A B C D) 7)))
  )

;4
(deftest size-test-for-a-list-with-four-elements
  (is (= 4 (size '(1 2 3 4))))
  )

(deftest size-test-for-an-empty-list
  (is (= 0 (size '())))
  )


(run-all-tests)