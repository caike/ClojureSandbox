(ns ClojureTemplate.core)


(defn add [& args]
  (reduce + args))

(defn sub [a b]
  (- a b))

(defn prime? [number]
  (if (some #(= number %) [0 1])
    false
    (let [original number]
      (letfn [(isPrime? [n]
          (if (= 1 n)
            true
            (if (= 0 (rem original n))
              false
              (recur (- n 1)))))]
        (isPrime? (- number 1))))))

