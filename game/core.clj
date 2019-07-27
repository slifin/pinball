(ns game.core
  (:require [arcadia.core :refer :all]
            [game.control :as control])
  (:import [UnityEngine Vector3]))

(defonce cube (create-primitive :cube "player"))

(defonce plane
  (create-primitive :plane "back"))

(control/move! plane (Vector3. 0 0 0))
(control/scale! cube (Vector3. 1 5 1))
(control/rotate! plane (Vector3. 0 0 90))


