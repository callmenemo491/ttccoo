package androidx.lifecycle;

import androidx.lifecycle.AbstractC0457n0;

/* renamed from: androidx.lifecycle.o0 */
/* loaded from: classes.dex */
public final class C0459o0<VM extends androidx.lifecycle.AbstractC0457n0> implements ch.InterfaceC0977d<VM> {

    /* renamed from: Y */
    public VM f2552Y;

    /* renamed from: Z */
    public final sh.InterfaceC6073b<VM> f2553Z;

    /* renamed from: a0 */
    public final mh.InterfaceC4609a<androidx.lifecycle.C0467s0> f2554a0;

    /* renamed from: b0 */
    public final mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> f2555b0;

    public C0459o0(sh.InterfaceC6073b<VM> r1, mh.InterfaceC4609a<? extends androidx.lifecycle.C0467s0> r2, mh.InterfaceC4609a<? extends androidx.lifecycle.InterfaceC0461p0> r3) {
            r0 = this;
            r0.<init>()
            r0.f2553Z = r1
            r0.f2554a0 = r2
            r0.f2555b0 = r3
            return
    }

    @Override // ch.InterfaceC0977d
    public java.lang.Object getValue() {
            r6 = this;
            VM extends androidx.lifecycle.n0 r0 = r6.f2552Y
            if (r0 != 0) goto L72
            mh.a<androidx.lifecycle.p0> r0 = r6.f2555b0
            java.lang.Object r0 = r0.mo15e()
            androidx.lifecycle.p0 r0 = (androidx.lifecycle.InterfaceC0461p0) r0
            mh.a<androidx.lifecycle.s0> r1 = r6.f2554a0
            java.lang.Object r1 = r1.mo15e()
            androidx.lifecycle.s0 r1 = (androidx.lifecycle.C0467s0) r1
            sh.b<VM extends androidx.lifecycle.n0> r2 = r6.f2553Z
            java.lang.String r3 = "<this>"
            p214m2.C4339q.m9706k(r2, r3)
            nh.c r2 = (p239nh.InterfaceC4823c) r2
            java.lang.Class r2 = r2.mo10850a()
            java.lang.String r3 = r2.getCanonicalName()
            if (r3 == 0) goto L6a
            java.lang.String r4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r3 = p064e.C1493g.m4049a(r4, r3)
            java.util.HashMap<java.lang.String, androidx.lifecycle.n0> r4 = r1.f2562a
            java.lang.Object r4 = r4.get(r3)
            androidx.lifecycle.n0 r4 = (androidx.lifecycle.AbstractC0457n0) r4
            boolean r5 = r2.isInstance(r4)
            if (r5 == 0) goto L46
            boolean r1 = r0 instanceof androidx.lifecycle.C0465r0
            if (r1 == 0) goto L44
            androidx.lifecycle.r0 r0 = (androidx.lifecycle.C0465r0) r0
            r0.mo1425b(r4)
        L44:
            r0 = r4
            goto L62
        L46:
            boolean r4 = r0 instanceof androidx.lifecycle.AbstractC0463q0
            if (r4 == 0) goto L51
            androidx.lifecycle.q0 r0 = (androidx.lifecycle.AbstractC0463q0) r0
            androidx.lifecycle.n0 r0 = r0.mo1426c(r3, r2)
            goto L55
        L51:
            androidx.lifecycle.n0 r0 = r0.mo9a(r2)
        L55:
            java.util.HashMap<java.lang.String, androidx.lifecycle.n0> r1 = r1.f2562a
            java.lang.Object r1 = r1.put(r3, r0)
            androidx.lifecycle.n0 r1 = (androidx.lifecycle.AbstractC0457n0) r1
            if (r1 == 0) goto L62
            r1.mo8b()
        L62:
            r6.f2552Y = r0
            java.lang.String r1 = "ViewModelProvider(store,\u2026ed = it\n                }"
            p214m2.C4339q.m9705j(r0, r1)
            goto L72
        L6a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Local and anonymous classes can not be ViewModels"
            r0.<init>(r1)
            throw r0
        L72:
            return r0
    }
}
