package p124h7;

/* renamed from: h7.d8 */
/* loaded from: classes.dex */
public final class C2584d8 {
    static {
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            java.lang.String r3 = "([0-9a-zA-Z\\-\\.\\_~])+"
            r1[r2] = r3
            r4 = 1
            r1[r4] = r3
            r5 = 2
            r1[r5] = r3
            r6 = 3
            r1[r6] = r3
            java.lang.String r7 = "^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$"
            java.lang.String r1 = java.lang.String.format(r7, r1)
            java.util.regex.Pattern.compile(r1, r5)
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r3
            r1[r4] = r3
            r1[r5] = r3
            r1[r6] = r3
            r1[r0] = r3
            java.lang.String r0 = "^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.util.regex.Pattern.compile(r0, r5)
            return
    }

    /* renamed from: a */
    public static java.lang.String m6592a(java.lang.String r2, java.lang.String r3) {
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r3.toLowerCase(r2)
            java.lang.String r0 = "android-keystore://"
            boolean r2 = r2.startsWith(r0)
            if (r2 == 0) goto L15
            r2 = 19
            java.lang.String r2 = r3.substring(r2)
            return r2
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1 = 0
            r3[r1] = r0
            java.lang.String r0 = "key URI must start with %s"
            java.lang.String r3 = java.lang.String.format(r0, r3)
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: b */
    public static void m6593b(int r3) {
            r0 = 16
            if (r3 == r0) goto L21
            r0 = 32
            if (r3 != r0) goto L9
            goto L21
        L9:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r3 * 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r3 = "invalid key size %d; only 128-bit and 256-bit AES keys are supported"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
        L21:
            return
    }

    /* renamed from: c */
    public static void m6594c(int r2, int r3) {
            if (r2 < 0) goto L5
            if (r2 > 0) goto L5
            return
        L5:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1 = 0
            r0[r1] = r2
            r2 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r2 = "key has version %d; only keys with version in range [0..%d] are supported"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            r3.<init>(r2)
            throw r3
    }
}
