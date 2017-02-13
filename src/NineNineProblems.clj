(ns NineNineProblems)

;1. Find the last box of a list.
;Example:
;* (my-last '(a b c d))

(defn my-last [xs]
  (if (empty? xs)
    nil
    (if (empty? (rest xs))
      xs
      (my-last (rest xs))
      )
    )
  )

;2 Find the last but one box of a list.
;Example:
;* (my-but-last '(a b c d))
;(C D)

(defn my-but-last
  [xs]
  (if (<= (count xs) 2)
    xs
    (my-but-last (rest xs))
    )
  )