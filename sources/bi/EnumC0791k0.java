package bi;

/* renamed from: bi.k0 */
/* loaded from: classes.dex */
public enum EnumC0791k0 extends java.lang.Enum<bi.EnumC0791k0> {

    /* renamed from: Z */
    public static final bi.EnumC0791k0 f4289Z = null;

    /* renamed from: a0 */
    public static final bi.EnumC0791k0 f4290a0 = null;

    /* renamed from: b0 */
    public static final bi.EnumC0791k0 f4291b0 = null;

    /* renamed from: c0 */
    public static final bi.EnumC0791k0 f4292c0 = null;

    /* renamed from: d0 */
    public static final bi.EnumC0791k0 f4293d0 = null;

    /* renamed from: e0 */
    public static final /* synthetic */ bi.EnumC0791k0[] f4294e0 = null;

    /* renamed from: f0 */
    public static final bi.EnumC0791k0.a f4295f0 = null;

    /* renamed from: Y */
    public final java.lang.String f4296Y;

    /* renamed from: bi.k0$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public final bi.EnumC0791k0 m2402a(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "javaName"
                p214m2.C4339q.m9706k(r3, r0)
                int r0 = r3.hashCode()
                r1 = 79201641(0x4b88569, float:4.338071E-36)
                if (r0 == r1) goto L43
                r1 = 79923350(0x4c38896, float:4.5969714E-36)
                if (r0 == r1) goto L38
                switch(r0) {
                    case -503070503: goto L2d;
                    case -503070502: goto L22;
                    case -503070501: goto L17;
                    default: goto L16;
                }
            L16:
                goto L4e
            L17:
                java.lang.String r0 = "TLSv1.3"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L4e
                bi.k0 r3 = bi.EnumC0791k0.f4289Z
                goto L4d
            L22:
                java.lang.String r0 = "TLSv1.2"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L4e
                bi.k0 r3 = bi.EnumC0791k0.f4290a0
                goto L4d
            L2d:
                java.lang.String r0 = "TLSv1.1"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L4e
                bi.k0 r3 = bi.EnumC0791k0.f4291b0
                goto L4d
            L38:
                java.lang.String r0 = "TLSv1"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L4e
                bi.k0 r3 = bi.EnumC0791k0.f4292c0
                goto L4d
            L43:
                java.lang.String r0 = "SSLv3"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L4e
                bi.k0 r3 = bi.EnumC0791k0.f4293d0
            L4d:
                return r3
            L4e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Unexpected TLS version: "
                java.lang.String r3 = p064e.C1493g.m4049a(r1, r3)
                r0.<init>(r3)
                throw r0
        }
    }

    static {
            r0 = 5
            bi.k0[] r0 = new bi.EnumC0791k0[r0]
            bi.k0 r1 = new bi.k0
            java.lang.String r2 = "TLS_1_3"
            r3 = 0
            java.lang.String r4 = "TLSv1.3"
            r1.<init>(r2, r3, r4)
            bi.EnumC0791k0.f4289Z = r1
            r0[r3] = r1
            bi.k0 r1 = new bi.k0
            java.lang.String r2 = "TLS_1_2"
            r3 = 1
            java.lang.String r4 = "TLSv1.2"
            r1.<init>(r2, r3, r4)
            bi.EnumC0791k0.f4290a0 = r1
            r0[r3] = r1
            bi.k0 r1 = new bi.k0
            java.lang.String r2 = "TLS_1_1"
            r3 = 2
            java.lang.String r4 = "TLSv1.1"
            r1.<init>(r2, r3, r4)
            bi.EnumC0791k0.f4291b0 = r1
            r0[r3] = r1
            bi.k0 r1 = new bi.k0
            java.lang.String r2 = "TLS_1_0"
            r3 = 3
            java.lang.String r4 = "TLSv1"
            r1.<init>(r2, r3, r4)
            bi.EnumC0791k0.f4292c0 = r1
            r0[r3] = r1
            bi.k0 r1 = new bi.k0
            java.lang.String r2 = "SSL_3_0"
            r3 = 4
            java.lang.String r4 = "SSLv3"
            r1.<init>(r2, r3, r4)
            bi.EnumC0791k0.f4293d0 = r1
            r0[r3] = r1
            bi.EnumC0791k0.f4294e0 = r0
            bi.k0$a r0 = new bi.k0$a
            r1 = 0
            r0.<init>(r1)
            bi.EnumC0791k0.f4295f0 = r0
            return
    }

    EnumC0791k0(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f4296Y = r3
            return
    }

    public static bi.EnumC0791k0 valueOf(java.lang.String r1) {
            java.lang.Class<bi.k0> r0 = bi.EnumC0791k0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            bi.k0 r1 = (bi.EnumC0791k0) r1
            return r1
    }

    public static bi.EnumC0791k0[] values() {
            bi.k0[] r0 = bi.EnumC0791k0.f4294e0
            java.lang.Object r0 = r0.clone()
            bi.k0[] r0 = (bi.EnumC0791k0[]) r0
            return r0
    }
}
