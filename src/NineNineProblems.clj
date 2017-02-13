(ns NineNineProblems)

;1. Find the last box of a list.
;Example:
;* (my-last '(a b c d))

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
;Example:
;* (my-but-last '(a b c d))
;(C D)

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