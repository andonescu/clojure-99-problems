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

;5.

(deftest reverseR-test-a-proper-list
  (is (= '(4 3 2 1) (reverseR '(1 2 3 4))))
  )

(deftest reverseR-test-a-list-with-a-single-element
  (is (= '(4) (reverseR '(4))))
  )

(deftest reverseR-test-an-empty-list
  (is (= '() (reverseR '())))
  )

;6
(deftest palindrome-test-a-proper-list
  (is (= true (palindrome '(1 2 3 2 1))))
  )
(deftest palindrom-test-list-with-a-single-element
  (is (= true (palindrome '(1))))
  )
(deftest palindrom-test-empty-list
  (is (= false (palindrome '())))
  )

;7.
(deftest my-flatten-test-a-proper-list
  (is (= '(A B C D E) (my-flatten '(A (B (C D) E)))))
  )

;8.
(deftest compress-test
  (is (= '(A B A C B D E) (compress '(A A A A B A A C C B D D D D E))))
  )

(run-all-tests)