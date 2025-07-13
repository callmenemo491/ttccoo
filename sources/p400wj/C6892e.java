package p400wj;

/* renamed from: wj.e */
/* loaded from: classes.dex */
public final class C6892e {

    /* renamed from: a */
    public static java.lang.String f26795a;

    /* renamed from: wj.e$a */
    public static class a implements java.security.PrivilegedAction<java.lang.String> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.security.PrivilegedAction
        public java.lang.String run() {
                r1 = this;
                java.lang.String r0 = "line.separator"
                java.lang.String r0 = java.lang.System.getProperty(r0)
                return r0
        }
    }

    static {
            wj.e$a r0 = new wj.e$a     // Catch: java.lang.Exception -> Le
            r0.<init>()     // Catch: java.lang.Exception -> Le
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.lang.Exception -> Le
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Le
            p400wj.C6892e.f26795a = r0     // Catch: java.lang.Exception -> Le
            goto L1e
        Le:
            java.lang.String r0 = "%n"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1a
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch: java.lang.Exception -> L1a
            p400wj.C6892e.f26795a = r0     // Catch: java.lang.Exception -> L1a
            goto L1e
        L1a:
            java.lang.String r0 = "\n"
            p400wj.C6892e.f26795a = r0
        L1e:
            return
    }

    /* renamed from: a */
    public static java.lang.String m13958a(byte[] r5) {
            java.lang.String r0 = new java.lang.String
            int r1 = r5.length
            char[] r2 = new char[r1]
            r3 = 0
        L6:
            if (r3 == r1) goto L12
            r4 = r5[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            char r4 = (char) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L6
        L12:
            r0.<init>(r2)
            return r0
    }

    /* renamed from: b */
    public static byte[] m13959b(java.lang.String r4) {
            int r0 = r4.length()
            byte[] r1 = new byte[r0]
            r2 = 0
        L7:
            if (r2 == r0) goto L13
            char r3 = r4.charAt(r2)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L13:
            return r1
    }

    /* renamed from: c */
    public static java.lang.String m13960c(java.lang.String r5) {
            char[] r0 = r5.toCharArray()
            r1 = 0
            r2 = 0
        L6:
            int r3 = r0.length
            if (r1 == r3) goto L1e
            char r3 = r0[r1]
            r4 = 65
            if (r4 > r3) goto L1b
            r4 = 90
            if (r4 < r3) goto L1b
            int r3 = r3 + (-65)
            int r3 = r3 + 97
            char r2 = (char) r3
            r0[r1] = r2
            r2 = 1
        L1b:
            int r1 = r1 + 1
            goto L6
        L1e:
            if (r2 == 0) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
        L25:
            return r5
    }
}
