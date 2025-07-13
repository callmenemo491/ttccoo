package ck;

/* renamed from: ck.d */
/* loaded from: classes.dex */
public class C0995d implements p015ak.InterfaceC0118b {

    /* renamed from: Y */
    public final java.lang.String f5085Y;

    /* renamed from: Z */
    public volatile p015ak.InterfaceC0118b f5086Z;

    /* renamed from: a0 */
    public java.lang.Boolean f5087a0;

    /* renamed from: b0 */
    public java.lang.reflect.Method f5088b0;

    /* renamed from: c0 */
    public p028bk.C0809a f5089c0;

    /* renamed from: d0 */
    public java.util.Queue<p028bk.C0811c> f5090d0;

    /* renamed from: e0 */
    public final boolean f5091e0;

    public C0995d(java.lang.String r1, java.util.Queue<p028bk.C0811c> r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f5085Y = r1
            r0.f5090d0 = r2
            r0.f5091e0 = r3
            return
    }

    @Override // p015ak.InterfaceC0118b
    /* renamed from: a */
    public java.lang.String mo177a() {
            r1 = this;
            java.lang.String r0 = r1.f5085Y
            return r0
    }

    @Override // p015ak.InterfaceC0118b
    /* renamed from: b */
    public void mo178b(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            ak.b r0 = r2.f5086Z
            if (r0 == 0) goto L7
            ak.b r0 = r2.f5086Z
            goto L1d
        L7:
            boolean r0 = r2.f5091e0
            if (r0 == 0) goto Le
            ck.c r0 = ck.C0994c.f5084Z
            goto L1d
        Le:
            bk.a r0 = r2.f5089c0
            if (r0 != 0) goto L1b
            bk.a r0 = new bk.a
            java.util.Queue<bk.c> r1 = r2.f5090d0
            r0.<init>(r2, r1)
            r2.f5089c0 = r0
        L1b:
            bk.a r0 = r2.f5089c0
        L1d:
            r0.mo178b(r3, r4)
            return
    }

    /* renamed from: c */
    public boolean m2727c() {
            r5 = this;
            java.lang.Boolean r0 = r5.f5087a0
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            ak.b r0 = r5.f5086Z     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.String r1 = "log"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L24
            r3 = 0
            java.lang.Class<bk.b> r4 = p028bk.InterfaceC0810b.class
            r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L24
            r5.f5088b0 = r0     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.NoSuchMethodException -> L24
            r5.f5087a0 = r0     // Catch: java.lang.NoSuchMethodException -> L24
            goto L28
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r5.f5087a0 = r0
        L28:
            java.lang.Boolean r0 = r5.f5087a0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1e
            java.lang.Class<ck.d> r2 = ck.C0995d.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L1e
        L10:
            ck.d r5 = (ck.C0995d) r5
            java.lang.String r2 = r4.f5085Y
            java.lang.String r5 = r5.f5085Y
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L1d
            return r1
        L1d:
            return r0
        L1e:
            return r1
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f5085Y
            int r0 = r0.hashCode()
            return r0
    }
}
