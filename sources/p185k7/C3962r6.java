package p185k7;

/* renamed from: k7.r6 */
/* loaded from: classes.dex */
public final class C3962r6 extends p185k7.AbstractC3988t6 {

    /* renamed from: c */
    public static final java.lang.Class<?> f16851c = null;

    static {
            java.util.List r0 = java.util.Collections.emptyList()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Class r0 = r0.getClass()
            p185k7.C3962r6.f16851c = r0
            return
    }

    public /* synthetic */ C3962r6() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.AbstractC3988t6
    /* renamed from: a */
    public final void mo8922a(java.lang.Object r4, long r5) {
            r3 = this;
            java.lang.Object r0 = p185k7.C3859j8.m8736j(r4, r5)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0 instanceof p185k7.InterfaceC3949q6
            if (r1 == 0) goto L11
            k7.q6 r0 = (p185k7.InterfaceC3949q6) r0
            k7.q6 r0 = r0.mo8542d()
            goto L36
        L11:
            java.lang.Class<?> r1 = p185k7.C3962r6.f16851c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L1e
            return
        L1e:
            boolean r1 = r0 instanceof p185k7.InterfaceC3898m7
            if (r1 == 0) goto L32
            boolean r1 = r0 instanceof p185k7.InterfaceC3857j6
            if (r1 == 0) goto L32
            k7.j6 r0 = (p185k7.InterfaceC3857j6) r0
            boolean r4 = r0.mo8199c()
            if (r4 == 0) goto L31
            r0.mo8198b()
        L31:
            return
        L32:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L36:
            e7.i8 r1 = p185k7.C3859j8.f16708c
            r1.m4264N(r4, r5, r0)
            return
    }

    @Override // p185k7.AbstractC3988t6
    /* renamed from: b */
    public final <E> void mo8923b(java.lang.Object r5, java.lang.Object r6, long r7) {
            r4 = this;
            java.lang.Object r6 = p185k7.C3859j8.m8736j(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = p185k7.C3859j8.m8736j(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L36
            boolean r2 = r1 instanceof p185k7.InterfaceC3949q6
            if (r2 == 0) goto L20
            k7.p6 r1 = new k7.p6
            r1.<init>(r0)
            goto L69
        L20:
            boolean r2 = r1 instanceof p185k7.InterfaceC3898m7
            if (r2 == 0) goto L30
            boolean r2 = r1 instanceof p185k7.InterfaceC3857j6
            if (r2 == 0) goto L30
            k7.j6 r1 = (p185k7.InterfaceC3857j6) r1
            k7.j6 r0 = r1.mo8299k(r0)
        L2e:
            r1 = r0
            goto L69
        L30:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            goto L69
        L36:
            java.lang.Class<?> r2 = p185k7.C3962r6.f16851c
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
            boolean r2 = r1 instanceof p185k7.C3803f8
            if (r2 == 0) goto L6f
            k7.p6 r2 = new k7.p6
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            k7.f8 r1 = (p185k7.C3803f8) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L4f
        L69:
            e7.i8 r0 = p185k7.C3859j8.f16708c
            r0.m4264N(r5, r7, r1)
            goto L8a
        L6f:
            boolean r2 = r1 instanceof p185k7.InterfaceC3898m7
            if (r2 == 0) goto L8a
            boolean r2 = r1 instanceof p185k7.InterfaceC3857j6
            if (r2 == 0) goto L8a
            r2 = r1
            k7.j6 r2 = (p185k7.InterfaceC3857j6) r2
            boolean r3 = r2.mo8199c()
            if (r3 != 0) goto L8a
            int r1 = r1.size()
            int r1 = r1 + r0
            k7.j6 r0 = r2.mo8299k(r1)
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
            e7.i8 r0 = p185k7.C3859j8.f16708c
            r0.m4264N(r5, r7, r6)
            return
    }
}
