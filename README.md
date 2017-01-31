ferret-logging
===============

easyloggingpp Bindigns For Ferret.

#### Usage

    (require '[ferret-logging.core :as log])

    (log/init-from-text
     "*GLOBAL:\\nTO_FILE = false\\nFORMAT = [%datetime{%Y.%M.%d-%H.%m.%s}] - %level - %msg\\n")

    (log/info  "ingo")
    (log/warn  "warning")
    (log/error "error")