(ns NineNineProblems)

;1. Find the last box of a list.
(defn my-last [xs]
  (if (empty? xs)
    nil
    (let [[head & tail] xs]
      (if (empty? tail)
        head
        (my-last tail)
        )
      )
    )
  )

;2 Find the last but one box of a list.
(defn my-but-last
  [xs]
  (if (< (count xs) 2)
    nil
    (let [[head & tail] xs]
      (if (= (count tail) 1)
        head
        (my-but-last tail)
        ))
    )
  )

;3. Find the K'th element of a list.
;The first element in the list is number 1.
(defn element-at
  [xs k]
  (if (or (nil? xs) (<= k 0))
    nil
    (let [[h & t] xs]
      (if (== k 1)
        h
        (element-at t (- k 1))
        )
      )
    )
  )

;4. Find the number of elements of a list.
(defn size
  [xs]
  (loop [xs xs
         dim 0]
    (if (empty? xs)
      dim
      (recur (rest xs) (inc dim))
      )
    )
  )

;5. Reverse a list.
(defn reverseR
  [xs]
  (loop [xs xs rev []]
    (if (empty? xs)
      rev
      (let [[head & tail] xs]
        (recur tail (cons head rev))
        )
      )
    )
  )

;6. Find out whether a list is a palindrome.
;A palindrome can be read forward or backward; e.g. (x a m a x).
(defn palindrome
  [xs]
  (if (empty? xs)
    false
    (= (compare (vec (reverseR xs)) (vec xs)) 0)
    )
  )

;7. Flatten a nested list structure.
;Transform a list, possibly holding lists as elements into a `flat'
;list by replacing each list with its elements (recursively).

(defn my-flatten
  [xs]
  (loop [xs xs acc []]
    (if (empty? xs)
      acc
      (let [[head & tail] xs]
        (if (list? head)
          (concat (concat acc (my-flatten head)) (my-flatten tail))
          (recur tail (concat acc [head]))
          )
        )
      )
    )
  )

;8. Eliminate consecutive duplicates of list elements.
;If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
;
;Example:
;* (compress '(a a a a b c c a a d e e e e))
;(A B C A D E)

(defn compress
  [xs]
  (loop [xs xs
         prev []
         acc []]
    (if (empty? xs)
      acc
      (let [[h & t] xs]
        (if (= [h] prev)
          (recur t prev acc)
          (recur t [h] (concat acc [h]))
          )
        )
      )
    )
  )