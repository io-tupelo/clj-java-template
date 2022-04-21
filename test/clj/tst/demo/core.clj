(ns tst.demo.core
  (:use demo.core tupelo.core tupelo.test)
  (:require
    [tupelo.string :as str])
  (:import [demo Calc]))

(dotest
  (is= 5 (add2 2 3))
  (is= 42 (Calc/add2 29 13))
  )


