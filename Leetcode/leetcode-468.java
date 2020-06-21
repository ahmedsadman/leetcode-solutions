class Solution {
    public String validIPAddress(String IP) {
        if (isIPv4(IP))
            return "IPv4";
        if (isIPv6(IP))
            return "IPv6";

        return "Neither";
    }

    private boolean isIPv4(String IP) {
        String[] chunks = IP.split("\\.", -1);

        if (chunks.length != 4)
            return false;

        for (String chunk : chunks) {
            // length of chunk is between 1 and 3
            if (chunk.length() == 0 || chunk.length() > 3)
                return false;

            // no extra leading zeros
            if (chunk.charAt(0) == '0' && chunk.length() != 1)
                return false;

            // only digits are allowed
            for (char ch : chunk.toCharArray()) {
                if (!Character.isDigit(ch))
                    return false;
            }

            // less than 255
            if (Integer.parseInt(chunk) > 255)
                return false;
        }

        return true;
    }

    private boolean isIPv6(String IP) {
        String[] chunks = IP.split(":", -1);
        String hexDigits = "0123456789abcdefABCDEF";

        if (chunks.length != 8)
            return false;

        for (String chunk : chunks) {
            // at least one and not more than 4 hexdigits in one chunk
            if (chunk.length() == 0 || chunk.length() > 4)
                return false;

            // only hexdigits are allowed
            for (Character ch : chunk.toCharArray()) {
                if (hexDigits.indexOf(ch) == -1)
                    return false;
            }
        }

        return true;
    }
}