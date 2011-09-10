(ns ClojureTemplate.test.core
  (:use [ClojureTemplate.core])
  (:use [clojure.test]))

(deftest sum-works
  (is 4 (add 2 2)))

(deftest sub-works
  (is 3 (sub 7 4)))

(deftest sum-multiple-works
  (is 9 (add 3 2 4)))

(deftest one-is-not-prime
  (not (prime? 1)))

(deftest two-is-prime
  (is (prime? 2)))

(deftest three-is-not-prime
  (is (prime? 3)))

(deftest four-is-not-prime
  (not (prime? 4)))

(deftest five-is-prime
  (is (prime? 5)))

(deftest seven-is-prime
  (is (prime? 7)))

(deftest thirteen-is-prime
  (is (prime? 13)))

(deftest forteen-is-not-prime
  (not (prime? 13)))

(deftest seventeen-is-prime
  (is (prime? 17)))