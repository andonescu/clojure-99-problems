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
