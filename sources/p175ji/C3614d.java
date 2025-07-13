package p175ji;

/* renamed from: ji.d */
/* loaded from: classes.dex */
public class C3614d extends p175ji.C3615e {

    /* renamed from: d */
    public static final boolean f15893d = false;

    /* renamed from: e */
    public static final p175ji.C3614d.a f15894e = null;

    /* renamed from: ji.d$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            ji.d$a r0 = new ji.d$a
            r1 = 0
            r0.<init>(r1)
            p175ji.C3614d.f15894e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L14
            java.lang.Integer r1 = p362uh.C6462h.m13049F(r0)
        L14:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L23
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L21
            goto L2c
        L21:
            r0 = 0
            goto L2c
        L23:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L21
            r1.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L21
        L2c:
            p175ji.C3614d.f15893d = r0
            return
    }

    public C3614d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p175ji.C3615e
    /* renamed from: d */
    public void mo8039d(javax.net.ssl.SSLSocket r6, java.lang.String r7, java.util.List<bi.EnumC0773b0> r8) {
            r5 = this;
            java.lang.String r7 = "protocols"
            p214m2.C4339q.m9706k(r8, r7)
            javax.net.ssl.SSLParameters r7 = r6.getSSLParameters()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L12:
            boolean r1 = r8.hasNext()
            r2 = 0
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r8.next()
            r3 = r1
            bi.b0 r3 = (bi.EnumC0773b0) r3
            bi.b0 r4 = bi.EnumC0773b0.f4184Z
            if (r3 == r4) goto L25
            r2 = 1
        L25:
            if (r2 == 0) goto L12
            r0.add(r1)
            goto L12
        L2b:
            java.util.ArrayList r8 = new java.util.ArrayList
            r1 = 10
            int r1 = p062dh.C1469e.m3992D(r0, r1)
            r8.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            bi.b0 r1 = (bi.EnumC0773b0) r1
            java.lang.String r1 = r1.f4191Y
            r8.add(r1)
            goto L3a
        L4c:
            java.lang.String r0 = "sslParameters"
            p214m2.C4339q.m9705j(r7, r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r8 = r8.toArray(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r8, r0)
            java.lang.String[] r8 = (java.lang.String[]) r8
            r7.setApplicationProtocols(r8)
            r6.setSSLParameters(r7)
            return
    }

    @Override // p175ji.C3615e
    /* renamed from: f */
    public java.lang.String mo8040f(javax.net.ssl.SSLSocket r3) {
            r2 = this;
            r0 = 0
            java.lang.String r3 = r3.getApplicationProtocol()     // Catch: java.lang.UnsupportedOperationException -> L19
            if (r3 != 0) goto L8
            goto L19
        L8:
            int r1 = r3.hashCode()     // Catch: java.lang.UnsupportedOperationException -> L19
            if (r1 == 0) goto Lf
            goto L18
        Lf:
            java.lang.String r1 = ""
            boolean r1 = r3.equals(r1)     // Catch: java.lang.UnsupportedOperationException -> L19
            if (r1 == 0) goto L18
            goto L19
        L18:
            r0 = r3
        L19:
            return r0
    }
}
