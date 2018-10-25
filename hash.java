    /////// md5 hashleme örneği 
    public static String createMd5Message(final String hshMsg) {
        String hashtext = null;
        try {
            byte[] thedigest;
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.reset();
            md.update((hshMsg).getBytes());
            thedigest = md.digest();
            BigInteger bigInt = new BigInteger(1,thedigest);
            hashtext = bigInt.toString(16);
            while(hashtext.length() < 32 ){
                hashtext = "0"+hashtext;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashtext;
    }

   ///////// SHA1 hashleme örneği 
    public static String createSHA1Message(final String hshMsg) {
        StringBuffer sb = new StringBuffer();
        try {
            byte[] thedigest;
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.reset();
            md.update((hshMsg).getBytes());
            thedigest = md.digest();
            for (byte b : thedigest) {
                sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "0x"+sb.toString();
    }
