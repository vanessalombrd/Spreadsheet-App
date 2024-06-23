package checker0;

import messages.Messages;

public class TypeChecker0 {
    public boolean checkDouble(Object o) {
        try {
            Double.parseDouble(String.valueOf(o));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkInteger(Object o) {
        try {
            Integer.parseInt(String.valueOf(o));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String checkString(Object o) {
        try {
            String s = String.valueOf(o);
            s = s.replaceAll("\\\"", "\"");
            s = s.replaceAll("\\\\", "");
            if (s.isEmpty()) {
                return s;
            }
            s = s.substring(1, s.length() - 1);
            return s;
        } catch (Exception e) {
            System.out.println(Messages.ERROR());
            return null;
        }
    }


}