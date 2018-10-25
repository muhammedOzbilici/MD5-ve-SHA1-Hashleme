    ###### md5 hashleme örneği
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

    ###### SHA1 hashleme örneği
    public static String createSHA1Message(final String hshMsg) {
        StringBuffer sb = new StringBuffer();
        try {
            byte[] thedigest;
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.reset();
            md.update(("<Trh=13/06/2018/><SN=0341218/><AlKK=0029/><AlSK=99999/><GonKK=0098/><GonSK=99999/><IslTur=M02/><Ttr=126000.00/><Onc=2/><AlAd=TEST TEST TEST İDRİS/><GonAd=JPMORGAN CHASE BANK, N.A. MERKEZI COLUM/><GonKimN=00000000000/><OdmKynk=I/><Acklm=ILKE TEST 2/>2018061300980341218").getBytes());
            thedigest = md.digest();
            for (byte b : thedigest) {
                sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "0x"+sb.toString();
    }
