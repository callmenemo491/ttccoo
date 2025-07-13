package p072e7;

/* renamed from: e7.m6 */
/* loaded from: classes.dex */
public final class C1679m6 extends p072e7.AbstractC1699o6 {

    /* renamed from: c */
    public static final java.lang.Class<?> f7691c = null;

    static {
            java.util.List r0 = java.util.Collections.emptyList()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Class r0 = r0.getClass()
            p072e7.C1679m6.f7691c = r0
            return
    }

    public /* synthetic */ C1679m6() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p072e7.AbstractC1699o6
    /* renamed from: a */
    public final void mo4346a(java.lang.Object r4, long r5) {
            r3 = this;
            java.lang.Object r0 = p072e7.C1651j8.m4304j(r4, r5)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0 instanceof p072e7.InterfaceC1669l6
            if (r1 == 0) goto L11
            e7.l6 r0 = (p072e7.InterfaceC1669l6) r0
            e7.l6 r0 = r0.mo4186f()
            goto L36
        L11:
            java.lang.Class<?> r1 = p072e7.C1679m6.f7691c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L1e
            return
        L1e:
            boolean r1 = r0 instanceof p072e7.InterfaceC1630h7
            if (r1 == 0) goto L32
            boolean r1 = r0 instanceof p072e7.InterfaceC1609f6
            if (r1 == 0) goto L32
            e7.f6 r0 = (p072e7.InterfaceC1609f6) r0
            boolean r4 = r0.mo4129c()
            if (r4 == 0) goto L31
            r0.mo4128b()
        L31:
            return
        L32:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L36:
            e7.i8 r1 = p072e7.C1651j8.f7668c
            r1.m4264N(r4, r5, r0)
            return
    }

    @Override // p072e7.AbstractC1699o6
    /* renamed from: b */
    public final <E> void mo4347b(java.lang.Object r5, java.lang.Object r6, long r7) {
            r4 = this;
            java.lang.Object r6 = p072e7.C1651j8.m4304j(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = p072e7.C1651j8.m4304j(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L36
            boolean r2 = r1 instanceof p072e7.InterfaceC1669l6
            if (r2 == 0) goto L20
            e7.k6 r1 = new e7.k6
            r1.<init>(r0)
            goto L69
        L20:
            boolean r2 = r1 instanceof p072e7.InterfaceC1630h7
            if (r2 == 0) goto L30
            boolean r2 = r1 instanceof p072e7.InterfaceC1609f6
            if (r2 == 0) goto L30
            e7.f6 r1 = (p072e7.InterfaceC1609f6) r1
            e7.f6 r0 = r1.mo4197s(r0)
        L2e:
            r1 = r0
            goto L69
        L30:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            goto L69
        L36:
            java.lang.Class<?> r2 = p072e7.C1679m6.f7691c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L51
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L4f:
            r1 = r2
            goto L69
        L51:
            boolean r2 = r1 instanceof p072e7.C1601e8
            if (r2 == 0) goto L6f
            e7.k6 r2 = new e7.k6
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            e7.e8 r1 = (p072e7.C1601e8) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L4f
        L69:
            e7.i8 r0 = p072e7.C1651j8.f7668c
            r0.m4264N(r5, r7, r1)
            goto L8a
        L6f:
            boolean r2 = r1 instanceof p072e7.InterfaceC1630h7
            if (r2 == 0) goto L8a
            boolean r2 = r1 instanceof p072e7.InterfaceC1609f6
            if (r2 == 0) goto L8a
            r2 = r1
            e7.f6 r2 = (p072e7.InterfaceC1609f6) r2
            boolean r3 = r2.mo4129c()
            if (r3 != 0) goto L8a
            int r1 = r1.size()
            int r1 = r1 + r0
            e7.f6 r0 = r2.mo4197s(r1)
            goto L2e
        L8a:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L99
            if (r2 <= 0) goto L99
            r1.addAll(r6)
        L99:
            if (r0 > 0) goto L9c
            goto L9d
        L9c:
            r6 = r1
        L9d:
            e7.i8 r0 = p072e7.C1651j8.f7668c
            r0.m4264N(r5, r7, r6)
            return
    }
}
