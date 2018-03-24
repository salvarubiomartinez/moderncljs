;; create the main project namespace
(ns modern-cljs.core)

;; enable cljs to print to the JS console of the browser
(enable-console-print!)

;; print to the console

(def num (* 3 (+ 3 4)))
(println num)
(println num)
(println "ppp")
(defn fib [x]
  (if (= x 1)
  1
  (* x (fib (- x 1)))))
(println (fib 100))
