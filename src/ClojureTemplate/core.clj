(ns ClojureTemplate.core)


(defn add [& args]
  (reduce + args))

(defn sub [a b]
  (- a b))

(defn prime? [n]
  (let [original n]
    (if (= 1 n)
      true
      (if (= 0 (rem original (- n 1)))
        true
        (recur (- n 1))))))