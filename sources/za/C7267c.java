package za;

/* renamed from: za.c */
/* loaded from: classes.dex */
public class C7267c {

    /* renamed from: a */
    public final java.io.File f27891a;

    /* renamed from: b */
    public final p251o9.C5180d f27892b;

    /* renamed from: za.c$a */
    public enum a extends java.lang.Enum<za.C7267c.a> {

        /* renamed from: Y */
        public static final za.C7267c.a f27893Y = null;

        /* renamed from: Z */
        public static final za.C7267c.a f27894Z = null;

        /* renamed from: a0 */
        public static final za.C7267c.a f27895a0 = null;

        /* renamed from: b0 */
        public static final za.C7267c.a f27896b0 = null;

        /* renamed from: c0 */
        public static final za.C7267c.a f27897c0 = null;

        /* renamed from: d0 */
        public static final /* synthetic */ za.C7267c.a[] f27898d0 = null;

        static {
                za.c$a r0 = new za.c$a
                java.lang.String r1 = "ATTEMPT_MIGRATION"
                r2 = 0
                r0.<init>(r1, r2)
                za.C7267c.a.f27893Y = r0
                za.c$a r1 = new za.c$a
                java.lang.String r3 = "NOT_GENERATED"
                r4 = 1
                r1.<init>(r3, r4)
                za.C7267c.a.f27894Z = r1
                za.c$a r3 = new za.c$a
                java.lang.String r5 = "UNREGISTERED"
                r6 = 2
                r3.<init>(r5, r6)
                za.C7267c.a.f27895a0 = r3
                za.c$a r5 = new za.c$a
                java.lang.String r7 = "REGISTERED"
                r8 = 3
                r5.<init>(r7, r8)
                za.C7267c.a.f27896b0 = r5
                za.c$a r7 = new za.c$a
                java.lang.String r9 = "REGISTER_ERROR"
                r10 = 4
                r7.<init>(r9, r10)
                za.C7267c.a.f27897c0 = r7
                r9 = 5
                za.c$a[] r9 = new za.C7267c.a[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                za.C7267c.a.f27898d0 = r9
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static za.C7267c.a valueOf(java.lang.String r1) {
                java.lang.Class<za.c$a> r0 = za.C7267c.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                za.c$a r1 = (za.C7267c.a) r1
                return r1
        }

        public static za.C7267c.a[] values() {
                za.c$a[] r0 = za.C7267c.a.f27898d0
                java.lang.Object r0 = r0.clone()
                za.c$a[] r0 = (za.C7267c.a[]) r0
                return r0
        }
    }

    public C7267c(p251o9.C5180d r5) {
            r4 = this;
            r4.<init>()
            java.io.File r0 = new java.io.File
            r5.m11497a()
            android.content.Context r1 = r5.f20312a
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "PersistedInstallation."
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r3 = r5.m11498e()
            r2.append(r3)
            java.lang.String r3 = ".json"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            r4.f27891a = r0
            r4.f27892b = r5
            return
    }

    /* renamed from: a */
    public za.AbstractC7268d m14355a(za.AbstractC7268d r5) {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L81
            r0.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = "Fid"
            java.lang.String r2 = r5.mo14344c()     // Catch: java.lang.Throwable -> L81
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = "Status"
            za.c$a r2 = r5.mo14347f()     // Catch: java.lang.Throwable -> L81
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L81
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = "AuthToken"
            java.lang.String r2 = r5.mo14342a()     // Catch: java.lang.Throwable -> L81
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = "RefreshToken"
            java.lang.String r2 = r5.mo14346e()     // Catch: java.lang.Throwable -> L81
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = "TokenCreationEpochInSecs"
            long r2 = r5.mo14348g()     // Catch: java.lang.Throwable -> L81
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = "ExpiresInSecs"
            long r2 = r5.mo14343b()     // Catch: java.lang.Throwable -> L81
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = "FisError"
            java.lang.String r2 = r5.mo14345d()     // Catch: java.lang.Throwable -> L81
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = "PersistedInstallation"
            java.lang.String r2 = "tmp"
            o9.d r3 = r4.f27892b     // Catch: java.lang.Throwable -> L81
            r3.m11497a()     // Catch: java.lang.Throwable -> L81
            android.content.Context r3 = r3.f20312a     // Catch: java.lang.Throwable -> L81
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L81
            java.io.File r1 = java.io.File.createTempFile(r1, r2, r3)     // Catch: java.lang.Throwable -> L81
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L81
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = "UTF-8"
            byte[] r0 = r0.getBytes(r3)     // Catch: java.lang.Throwable -> L81
            r2.write(r0)     // Catch: java.lang.Throwable -> L81
            r2.close()     // Catch: java.lang.Throwable -> L81
            java.io.File r0 = r4.f27891a     // Catch: java.lang.Throwable -> L81
            boolean r0 = r1.renameTo(r0)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L79
            goto L81
        L79:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = "unable to rename the tmpfile to PersistedInstallation"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L81
            throw r0     // Catch: java.lang.Throwable -> L81
        L81:
            return r5
    }

    /* renamed from: b */
    public za.AbstractC7268d m14356b() {
            r14 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r1]
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L32
            java.io.File r5 = r14.f27891a     // Catch: java.lang.Throwable -> L32
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32
        L11:
            int r5 = r4.read(r2, r3, r1)     // Catch: java.lang.Throwable -> L28
            if (r5 >= 0) goto L24
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L28
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L28
            r4.close()     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L32
            goto L37
        L24:
            r0.write(r2, r3, r5)     // Catch: java.lang.Throwable -> L28
            goto L11
        L28:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L32
        L31:
            throw r0     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L32
        L32:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L37:
            r0 = 0
            java.lang.String r2 = "Fid"
            java.lang.String r2 = r1.optString(r2, r0)
            za.c$a r4 = za.C7267c.a.f27893Y
            java.lang.String r5 = "Status"
            int r3 = r1.optInt(r5, r3)
            java.lang.String r5 = "AuthToken"
            java.lang.String r5 = r1.optString(r5, r0)
            java.lang.String r6 = "RefreshToken"
            java.lang.String r6 = r1.optString(r6, r0)
            r7 = 0
            java.lang.String r9 = "TokenCreationEpochInSecs"
            long r9 = r1.optLong(r9, r7)
            java.lang.String r11 = "ExpiresInSecs"
            long r11 = r1.optLong(r11, r7)
            java.lang.String r13 = "FisError"
            java.lang.String r0 = r1.optString(r13, r0)
            int r1 = za.AbstractC7268d.f27899a
            za.a$b r1 = new za.a$b
            r1.<init>()
            r1.m14353d(r7)
            r1.mo14351b(r4)
            r1.m14352c(r7)
            r1.f27881a = r2
            za.c$a[] r2 = za.C7267c.a.values()
            r2 = r2[r3]
            r1.mo14351b(r2)
            r1.f27883c = r5
            r1.f27884d = r6
            r1.m14353d(r9)
            r1.m14352c(r11)
            r1.f27887g = r0
            za.d r0 = r1.mo14350a()
            return r0
    }
}
