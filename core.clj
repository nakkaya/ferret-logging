(defnative init []
  (on "defined FERRET_STD_LIB"
      ("ferret-logging/easylogging++.h")
      "INITIALIZE_EASYLOGGINGPP"
      ""))

(defnative init-from-text [txt]
  (on "defined FERRET_STD_LIB"
      ("ferret-logging/easylogging++.h")
      "INITIALIZE_EASYLOGGINGPP"
      "el::Configurations c;
       c.setToDefault();
       c.parseFromText(txt.to<std::string>());
       el::Loggers::reconfigureAllLoggers(c);"))

(defnative info [msg]
  (on "defined FERRET_STD_LIB"
      "LOG(INFO) << msg.to<std::string>();"))

(defnative warn [msg]
  (on "defined FERRET_STD_LIB"
      "LOG(WARNING) << msg.to<std::string>();"))

(defnative error [msg]
  (on "defined FERRET_STD_LIB"
      "LOG(ERROR) << msg.to<std::string>();"))
