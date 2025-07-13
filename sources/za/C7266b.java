package za;

/* renamed from: za.b */
/* loaded from: classes.dex */
public class C7266b {

    /* renamed from: c */
    public static final java.lang.String[] f27888c = null;

    /* renamed from: a */
    public final android.content.SharedPreferences f27889a;

    /* renamed from: b */
    public final java.lang.String f27890b;

    static {
            java.lang.String r0 = "*"
            java.lang.String r1 = "FCM"
            java.lang.String r2 = "GCM"
            java.lang.String r3 = ""
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            za.C7266b.f27888c = r0
            return
    }

    public C7266b(p251o9.C5180d r4) {
            r3 = this;
            r3.<init>()
            r4.m11497a()
            android.content.Context r0 = r4.f20312a
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.f27889a = r0
            r4.m11497a()
            o9.h r0 = r4.f20314c
            java.lang.String r0 = r0.f20328e
            if (r0 == 0) goto L1b
            goto L49
        L1b:
            r4.m11497a()
            o9.h r4 = r4.f20314c
            java.lang.String r0 = r4.f20325b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L33
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L33
            goto L49
        L33:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L3f
            goto L48
        L3f:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L49
        L48:
            r0 = r2
        L49:
            r3.f27890b = r0
            return
    }

    /* renamed from: a */
    public final java.lang.String m14354a() {
            r6 = this;
            android.content.SharedPreferences r0 = r6.f27889a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f27889a     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = "|S||P|"
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)     // Catch: java.lang.Throwable -> L70
            if (r1 != 0) goto L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L70
            return r3
        L10:
            r2 = 8
            byte[] r1 = android.util.Base64.decode(r1, r2)     // Catch: java.security.NoSuchAlgorithmException -> L26 java.security.spec.InvalidKeySpecException -> L28 java.lang.IllegalArgumentException -> L2a java.lang.Throwable -> L70
            java.lang.String r4 = "RSA"
            java.security.KeyFactory r4 = java.security.KeyFactory.getInstance(r4)     // Catch: java.security.NoSuchAlgorithmException -> L26 java.security.spec.InvalidKeySpecException -> L28 java.lang.IllegalArgumentException -> L2a java.lang.Throwable -> L70
            java.security.spec.X509EncodedKeySpec r5 = new java.security.spec.X509EncodedKeySpec     // Catch: java.security.NoSuchAlgorithmException -> L26 java.security.spec.InvalidKeySpecException -> L28 java.lang.IllegalArgumentException -> L2a java.lang.Throwable -> L70
            r5.<init>(r1)     // Catch: java.security.NoSuchAlgorithmException -> L26 java.security.spec.InvalidKeySpecException -> L28 java.lang.IllegalArgumentException -> L2a java.lang.Throwable -> L70
            java.security.PublicKey r1 = r4.generatePublic(r5)     // Catch: java.security.NoSuchAlgorithmException -> L26 java.security.spec.InvalidKeySpecException -> L28 java.lang.IllegalArgumentException -> L2a java.lang.Throwable -> L70
            goto L42
        L26:
            r1 = move-exception
            goto L2b
        L28:
            r1 = move-exception
            goto L2b
        L2a:
            r1 = move-exception
        L2b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r4.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "Invalid key stored "
            r4.append(r5)     // Catch: java.lang.Throwable -> L70
            r4.append(r1)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = "ContentValues"
            android.util.Log.w(r4, r1)     // Catch: java.lang.Throwable -> L70
            r1 = r3
        L42:
            if (r1 != 0) goto L46
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L70
            return r3
        L46:
            byte[] r1 = r1.getEncoded()     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = "SHA1"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.security.NoSuchAlgorithmException -> L67 java.lang.Throwable -> L70
            byte[] r1 = r4.digest(r1)     // Catch: java.security.NoSuchAlgorithmException -> L67 java.lang.Throwable -> L70
            r4 = 0
            r5 = r1[r4]     // Catch: java.security.NoSuchAlgorithmException -> L67 java.lang.Throwable -> L70
            r5 = r5 & 15
            int r5 = r5 + 112
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.security.NoSuchAlgorithmException -> L67 java.lang.Throwable -> L70
            r1[r4] = r5     // Catch: java.security.NoSuchAlgorithmException -> L67 java.lang.Throwable -> L70
            r5 = 11
            java.lang.String r3 = android.util.Base64.encodeToString(r1, r4, r2, r5)     // Catch: java.security.NoSuchAlgorithmException -> L67 java.lang.Throwable -> L70
            goto L6e
        L67:
            java.lang.String r1 = "ContentValues"
            java.lang.String r2 = "Unexpected error, device missing required algorithms"
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L70
        L6e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L70
            return r3
        L70:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L70
            throw r1
    }
}
