(ns ClojureTemplate.test.core
  (:use [clojure.test]))

(defn next-multiple [cursor multiplier]
  (+ cursor multiplier)
  )
  
(defn gen-multiples[limit, n]
  (let return (gen-next-mult))
  (if (< limit (gen-next-multiple 0 3) ))
)

(deftest gen-next-multiple
  (is 6 (next-multiple 3 3))
  (is 15 (next-multiple 12 3))
  )

(deftest gen-multiples-test1
  (is (= (list 3 5 6 9) (gen-multiples 10)) )
  (is (= (list 3 5 6 9 10 12) (gen-multiples 15) ))
)
