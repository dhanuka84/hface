(ns hface.charts
  (:require [hface.c3 :refer [gauge map-area]]))

(defn cpu-gauge [clazz]
  (gauge clazz {:data-is "cpu usage" :height 100}))

(defn mem-gauge [clazz]
  (gauge clazz {:data-is "memory usage" :height 100}))

(defn map-area-chart []
  (map-area :map-stats))

