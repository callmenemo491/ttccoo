package androidx.navigation;

import androidx.navigation.InterfaceC0506e;

/* renamed from: androidx.navigation.f */
/* loaded from: classes.dex */
public final class C0507f<Args extends androidx.navigation.InterfaceC0506e> implements ch.InterfaceC0977d<Args> {

    /* renamed from: Y */
    public Args f2914Y;

    /* renamed from: Z */
    public final sh.InterfaceC6073b<Args> f2915Z;

    /* renamed from: a0 */
    public final mh.InterfaceC4609a<android.os.Bundle> f2916a0;

    public C0507f(sh.InterfaceC6073b<Args> r1, mh.InterfaceC4609a<android.os.Bundle> r2) {
            r0 = this;
            r0.<init>()
            r0.f2915Z = r1
            r0.f2916a0 = r2
            return
    }

    @Override // ch.InterfaceC0977d
    public java.lang.Object getValue() {
            r5 = this;
            Args extends androidx.navigation.e r0 = r5.f2914Y
            if (r0 != 0) goto L5b
            mh.a<android.os.Bundle> r0 = r5.f2916a0
            java.lang.Object r0 = r0.mo15e()
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.Class<android.os.Bundle>[] r1 = androidx.navigation.C0512g.f2937a
            s.a<sh.b<? extends androidx.navigation.e>, java.lang.reflect.Method> r1 = androidx.navigation.C0512g.f2938b
            sh.b<Args extends androidx.navigation.e> r2 = r5.f2915Z
            java.lang.Object r2 = r1.get(r2)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L1b
            goto L41
        L1b:
            sh.b<Args extends androidx.navigation.e> r2 = r5.f2915Z
            java.lang.String r3 = "<this>"
            p214m2.C4339q.m9706k(r2, r3)
            nh.c r2 = (p239nh.InterfaceC4823c) r2
            java.lang.Class r2 = r2.mo10850a()
            java.lang.Class<android.os.Bundle>[] r3 = androidx.navigation.C0512g.f2937a
            int r4 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.lang.Class[] r3 = (java.lang.Class[]) r3
            java.lang.String r4 = "fromBundle"
            java.lang.reflect.Method r2 = r2.getMethod(r4, r3)
            sh.b<Args extends androidx.navigation.e> r3 = r5.f2915Z
            r1.put(r3, r2)
            java.lang.String r1 = "navArgsClass.java.getMet\u2026hod\n                    }"
            p214m2.C4339q.m9703h(r2, r1)
        L41:
            r1 = 0
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.Object r0 = r2.invoke(r1, r3)
            if (r0 == 0) goto L53
            androidx.navigation.e r0 = (androidx.navigation.InterfaceC0506e) r0
            r5.f2914Y = r0
            goto L5b
        L53:
            ch.i r0 = new ch.i
            java.lang.String r1 = "null cannot be cast to non-null type Args"
            r0.<init>(r1)
            throw r0
        L5b:
            return r0
    }
}
